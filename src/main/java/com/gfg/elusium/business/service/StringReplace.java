package com.gfg.elusium.business.service;

public class StringReplace {
	public static void main(String[] args) {
		String original = "abcabc baidb cdnabdijwef abc ba";
		System.out.println("original string is :"+original);
		System.out.println("replacing ab with jk");
		System.out.println(original.replace("ab", "jk"));
		System.out.println(original.replaceAll("ab", "jk"));
		System.out.println(original.replaceFirst("ab", "jk"));
	}
}
