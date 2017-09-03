package com.gfg.string.business.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindAnagramsInArray {
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

	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> resultMap = new HashMap<>();
		String[] arr = new String[] { "geeksquiz", "geeksforgeeks", "abcd", "forgeeksgeeks", "zuiqkeegs" };
		for(String str :arr) {
			String signature = stringSignature(str);
			ArrayList<String> arrList;
			if(resultMap.containsKey(signature)) {
				arrList = resultMap.get(signature);
				arrList.add(str);
			}else {
				arrList = new ArrayList<>();
				arrList.add(str);
			}
			resultMap.put(signature, arrList);
		}
		for(Map.Entry<String, ArrayList<String>> entry: resultMap.entrySet()) {
			ArrayList<String> list = entry.getValue();
			if(list.size()>1) {
				System.out.println(list);
			}
		}
	}
}
