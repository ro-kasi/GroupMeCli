package com.rokasi.gmcli.ui;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

import javax.xml.soap.Text;

import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.TextColor.Indexed;
import com.googlecode.lanterna.graphics.Theme;
import com.googlecode.lanterna.graphics.ThemeDefinition;
import com.googlecode.lanterna.graphics.ThemeStyle;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.BorderLayout;
import com.googlecode.lanterna.gui2.BorderLayout.Location;
import com.googlecode.lanterna.gui2.Button;
import com.googlecode.lanterna.gui2.DefaultWindowManager;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.GridLayout;
import com.googlecode.lanterna.gui2.Label;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.TextGUIGraphics;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.gui2.dialogs.ActionListDialogBuilder;
import com.googlecode.lanterna.gui2.table.DefaultTableCellRenderer;
import com.googlecode.lanterna.gui2.table.Table;
import com.googlecode.lanterna.gui2.table.TableCellRenderer;
import com.googlecode.lanterna.gui2.table.TableModel;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.TerminalResizeListener;
import com.rokasi.gmcli.api.RestApi;
import com.rokasi.gmcli.json.Group;
import com.rokasi.gmcli.json.Groups;
import com.rokasi.gmcli.json.SocketResponse;

public class UserInterface {

	private Table<String> table;
	private MultiWindowTextGUI gui;
	private BasicWindow window;
	private TextBoxEnter textbox;
	private Label statusLable;
	private Terminal terminal;

	private int width;
	private int height;

	private int groupId;

	private HashMap<String, TableModel<String>> chats;
	private HashMap<String, TextColor.ANSI> user_colors;

	public UserInterface(int gid) {
		this.groupId = gid;
		chats = new HashMap<String, TableModel<String>>();

		TextColor io = TextColor.Indexed.fromRGB(1, 1, 1);
	}

	public UserInterface() {
		chats = new HashMap<String, TableModel<String>>();
	}

	public void init() {

		try {
			this.terminal = new DefaultTerminalFactory().createTerminal();
			this.terminal.addResizeListener(new TerminalResizeListener() {

				@Override
				public void onResized(Terminal terminal, TerminalSize newSize) {
					width = newSize.getColumns();
					height = newSize.getRows();
					if (table != null)
						table.setVisibleRows(height - 3);
				}
			});
			Screen screen = new TerminalScreen(this.terminal);
			screen.startScreen();

			// Overall Panel
			Panel panel = new Panel();
			panel.setLayoutManager(new BorderLayout());

			// Message list
			this.table = new Table<String>("Date", "User", "Message");
			this.table.setVisibleRows(20);
			this.table.setLayoutData(BorderLayout.Location.CENTER);
			panel.addComponent(table);

			// Text box area
			this.textbox = new TextBoxEnter(null, "type to send", this.groupId);
			this.textbox.setLayoutData(BorderLayout.Location.BOTTOM);
			panel.addComponent(textbox);

			// Top status bar and menu buttons
			Panel uiPanel = new Panel();
			uiPanel.setLayoutManager(new GridLayout(4));

			this.statusLable = new Label("Me and My Bot's");
			this.statusLable.setBackgroundColor(TextColor.ANSI.BLUE);
			this.statusLable.setForegroundColor(TextColor.ANSI.WHITE);
			this.statusLable.addStyle(SGR.BOLD);
			uiPanel.addComponent(this.statusLable);

			this.table.setTableCellRenderer(new TableCellRenderer<String>() {

				DefaultTableCellRenderer<String> dtcr = new DefaultTableCellRenderer<String>();
				TextColor act_bg = null;
				TextColor sel_bg = null;
				TextColor def_bg = null;

				@Override
				public TerminalSize getPreferredSize(Table<String> table, String cell, int columnIndex, int rowIndex) {
					return dtcr.getPreferredSize(table, cell, columnIndex, rowIndex);
				}

				@Override
				public void drawCell(Table<String> table, String cell, int columnIndex, int rowIndex,
						TextGUIGraphics textGUIGraphics) {

					if (act_bg == null) {
						act_bg = table.getThemeDefinition().getActive().getBackground();
						sel_bg = table.getThemeDefinition().getSelected().getBackground();
						def_bg = table.getThemeDefinition().getNormal().getBackground();
					}

					switch (columnIndex) {
					case 1:
						textGUIGraphics.enableModifiers(SGR.BOLD);
						textGUIGraphics.setForegroundColor(UserColors.getColor(cell));
						
						
						if ((table.getSelectedColumn() == columnIndex && table.getSelectedRow() == rowIndex)
								|| (table.getSelectedRow() == rowIndex && !table.isCellSelection())) {
							if (table.isFocused()) {
								textGUIGraphics.setBackgroundColor(act_bg);
							} else {
								textGUIGraphics.setBackgroundColor(sel_bg);
							}
						} else {
							textGUIGraphics.setBackgroundColor(def_bg);
						}

						textGUIGraphics.putString(0, 0, cell);
						break;

					default:
						dtcr.drawCell(table, cell, columnIndex, rowIndex, textGUIGraphics);
						break;
					}

				}
			});

			Button button = new Button("Change Group", new Runnable() {
				@Override
				public void run() {
					showGroupDialog();
				}
			});
			uiPanel.addComponent(button);
			uiPanel.addComponent(new Button("Exit"));
			uiPanel.addComponent(new Button("Config"));

			panel.addComponent(uiPanel, Location.TOP);

			this.window = new BasicWindow("GM CLI");
			this.window.setHints(Arrays.asList(Window.Hint.NO_DECORATIONS, Window.Hint.FULL_SCREEN));
			this.window.setComponent(panel);

			this.gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.BLACK));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void showGroupDialog() {
		Groups groups = RestApi.getGroupList();

		ActionListDialogBuilder aldb = new ActionListDialogBuilder();
		aldb.setTitle("Available Groups");
		aldb.setDescription("Select a new group");

		for (Group group : groups.getResponse()) {
			aldb.addAction(group.getName(), new Runnable() {

				@Override
				public void run() {
					statusLable.setText(group.getName());
					setGroupId(Integer.parseInt(group.getGroupId()));
				}
			});
		}
		aldb.build().showDialog(this.gui);
	}

	public void start() {
		this.showGroupDialog();
		this.gui.addWindowAndWait(this.window);
	}

	public void addMessage(SocketResponse msg) {

		String groupid = msg.getData().getSubject().getGroupId();

		if (chats.containsKey(groupid)) {
			this.chats.get(groupid).addRow(msg.getData().getReceivedAt() + "", msg.getData().getSubject().getName(),
					msg.getData().getSubject().getText());

		} else {
			TableModel<String> tm = new TableModel<String>("Date", "User", "Message");
			tm.addRow(msg.getData().getReceivedAt() + "", msg.getData().getSubject().getName(),
					msg.getData().getSubject().getText());
			chats.put(groupid, tm);
		}

		this.table.setSelectedRow(this.table.getTableModel().getRowCount());
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int id) {
		this.groupId = id;
		this.textbox.setGroupId(id);

		if (chats.containsKey("" + id)) {
			this.table.setTableModel(this.chats.get("" + id));
		} else {
			TableModel<String> tm = new TableModel<String>("Date", "User", "Message");
			this.table.setTableModel(tm);
			this.chats.put("" + id, tm);
		}
	}

}
