package com.rokasi.gmcli.ui;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.TextBox;
import com.googlecode.lanterna.input.KeyStroke;
import com.rokasi.gmcli.api.RestApi;

/**
 * TextBox that allows pasting and detects the enter key
 * @author rkasireddy
 *
 */
public class TextBoxEnter extends TextBox {

	private int group_id;

	public TextBoxEnter(TerminalSize ts, String defa, int gid) {
		super(ts, defa);
		this.group_id = gid;
	}

	public TextBoxEnter(TerminalSize ts, String defa) {
		super(ts, defa);
	}

	public void setGroupId(int id) {
		this.group_id = id;
	}

	public synchronized Result handleKeyStroke(KeyStroke keyStroke) {

		switch (keyStroke.getKeyType()) {
		case Enter:
			RestApi.sendMessage(this.group_id+"", this.getText());			
			this.setText("");
			return Result.HANDLED;

		case Character:
									
			if(keyStroke.getCharacter().charValue() == 'v' && keyStroke.isCtrlDown()){								
				try {
					String data = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
					int curPos = this.getCaretPosition().getColumn();
					String t = this.getText();
					t = t.substring(0, curPos) + data + t.substring(curPos, t.length());
					this.setText(t);
				
				} catch (HeadlessException | UnsupportedFlavorException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				return Result.HANDLED;
				
			} else {
				return super.handleKeyStroke(keyStroke);
			}
			

		default:
			return super.handleKeyStroke(keyStroke);
		}

	}

}
