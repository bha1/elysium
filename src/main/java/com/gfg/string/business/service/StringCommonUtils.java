package com.gfg.string.business.service;

import java.util.HashMap;

public class StringCommonUtils {
	public static String stringSignature(String input) {
		if (input != null) {
			input = input.toLowerCase();
			HashMap<Character, Integer> charMap = new HashMap<>();
			for (int i = 0; i < input.length(); i++) {
				if (charMap.containsKey(input.charAt(i))) {
					charMap.put(input.charAt(i), charMap.get(input.charAt(i)) + 1);
				} else {
					charMap.put(input.charAt(i), 1);
				}
			}
			StringBuilder stringBuilder = new StringBuilder();
			for (Character ch = 'a'; ch <= 'z'; ch++) {
				if (charMap.containsKey(ch)) {
					stringBuilder.append(ch).append(charMap.get(ch));
				}
			}
			return stringBuilder.toString();
		}
		return "**";
	}
}
