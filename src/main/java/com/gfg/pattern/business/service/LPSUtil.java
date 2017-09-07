package com.gfg.pattern.business.service;

import java.util.Arrays;

public class LPSUtil {
	public static void main(String[] args) {
		String str1 = "AAAA";
		System.out.println(Arrays.toString(computeLPS(str1)));
		String str2 = "ABCDE";
		System.out.println(Arrays.toString(computeLPS(str2)));
		String str3 = "AABAACAABAA";
		System.out.println(Arrays.toString(computeLPS(str3)));
		String str4 = "AAACAAAAAC";
		System.out.println(Arrays.toString(computeLPS(str4)));
		String str5 = "AAABAAA";
		System.out.println(Arrays.toString(computeLPS(str5)));
	}
	
	public static int[] computeLPS(String str) {
		int n = str.length();
		int[] lpsArr = new int[n];
		lpsArr[0] = 0;
		int len = 0;
		int i = 1;
		while(i<n) {
			if(str.charAt(i)==str.charAt(len)) {
				len++;
				lpsArr[i]=len;
				i++;
			}else {
				if(len!=0) {
					len = lpsArr[len-1];
				}else {
					lpsArr[i] = len;
					i++;
				}
			}
		}
		return lpsArr;
	}
}
