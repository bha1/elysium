package com.gfg.elusium.business.service;

import java.util.Arrays;
import java.util.Comparator;

public class StringComparison {
	public static String simpleSort(String input) {
		char[] characters = input.toCharArray();
		Arrays.sort(characters);
		return new String(characters);
	}
	
	public static String customSort(String input) {
		if(input != null) {
			Character[] characters = new Character[input.length()];
			for(int i = 0; i<input.length();i++) {
				characters[i] = input.charAt(i);
			}
			Arrays.sort(characters,new Comparator<Character>(){
				@Override
				public int compare(Character c1,Character c2) {
					return Character.compare(Character.toLowerCase(c1), Character.toLowerCase(c2));
				}
			});
			StringBuilder stringBuilder = new StringBuilder(input.length());
			for (Character character : characters) {
				stringBuilder.append(character);
			}
			return stringBuilder.toString();
		}
		return "can't sort null string";
	}
	
	public static void main(String[] args) {
		String[] strings = new String[] {"west", "WeSt","WeS2TErN1"};
		for(String str : strings) {
			System.out.print("simpleSort result :");
			System.out.println(simpleSort(str));
			System.out.print("customSort result :");
			System.out.println(customSort(str));
		}
	}
}
