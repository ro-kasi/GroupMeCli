package com.rokasi.gmcli.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import com.googlecode.lanterna.TextColor;

/**
 * Give users a random color across different chats
 * @author rkasireddy
 *
 */
public class UserColors {

	private static HashMap<String, TextColor> user_colors = new HashMap<>();
	private static List<TextColor> color_list = loadColors();
	private static Random rnd = new Random();

	private static List<TextColor> loadColors() {
		
		int[][] rgbs = { { 1, 157, 234 }, { 234, 94, 25 }, { 83, 71, 204 }, { 81, 168, 2 }, { 138, 28, 167 },
				{ 154, 145, 0 }, { 227, 132, 255 }, { 0, 204, 172 }, { 224, 0, 133 }, { 1, 139, 137 }, { 194, 0, 62 },
				{ 0, 112, 203 }, { 255, 147, 42 }, { 94, 64, 159 }, { 164, 95, 0 }, { 170, 164, 255 }, { 118, 72, 21 },
				{ 154, 0, 133 }, { 184, 206, 149 }, { 255, 127, 204 }, { 224, 195, 132 }, { 66, 80, 134 },
				{ 255, 101, 99 }, { 108, 127, 179 }, { 255, 155, 109 }, { 139, 52, 82 }, { 255, 168, 217 },
				{ 138, 58, 35 }, { 255, 136, 161 }, { 148, 80, 94 } };
		
		List<TextColor> cls = new ArrayList<TextColor>();
		for(int c[]: rgbs){
			cls.add(TextColor.Indexed.fromRGB(c[0], c[1], c[2]));
		}	
		
		return cls;

	}

	public static TextColor getColor(String user) {

		if (!user_colors.containsKey(user)) {
			user_colors.put(user, color_list.get(rnd.nextInt(color_list.size())));
		}		
		
		return user_colors.get(user);
	}

}
