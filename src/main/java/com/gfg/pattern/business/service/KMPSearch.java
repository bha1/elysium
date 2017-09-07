package com.gfg.pattern.business.service;

public class KMPSearch {
	public static void main(String[] args) {
		String txt = "ABABDABACDABABCABAB";
		String pat = "ABABCABAB";
		search(txt, pat);
	}
	
	public static void search(String txt,String pat) {
		int M = pat.length();
		int j=0;
		int N=txt.length();
		int i=0;
		
		int[] lpsArr = LPSUtil.computeLPS(pat);
		while(i<N) {
			if(txt.charAt(i)==pat.charAt(j)) {
				i++;
				j++;
			}
			if(j == M) {
				System.out.println("parttern found at :"+(i-j));
				j=lpsArr[j-1];
			}
			if(i<N && txt.charAt(i) != pat.charAt(j)) {
				if(j!=0) {
					j=lpsArr[j-1];
				}else {
					i++;
				}
			}
		}
	}
}
