package com.gfg.string.business.service;

public class CheckIfAnagramIsPalindrome {
	public static void main(String[] args) {
		String[] arr = new String[] {"geeksforgeeks","geeksogeeks"};
		for(String str : arr) {
			System.out.println(str + " can be a palindrome "+StringCommonUtils.anagramCanBePalindrome(str));
		}
	}
}
