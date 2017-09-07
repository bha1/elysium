package com.gfg.sandbox;

public class BinaryManipulation {
	public static void main(String[] args) {
		int i = 10;
		int j = 5;
		int k = 1;
		int l = 2;
		int m = 0;
		System.out.println(i^i^j^j^k^l);
		System.out.println(i&i);
		System.out.println(i|i);
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toBinaryString(i^i^j^j^k^l));
		System.out.println(Integer.toBinaryString(~i));
		System.out.println(Integer.toBinaryString(2<<i));
		System.out.println(Integer.toBinaryString(i>>2));
		System.out.println(Integer.toBinaryString(i>>>2));
		
		System.out.println("******************************");
		j = -5;
		System.out.println(j);
		System.out.println(Integer.toBinaryString(j));
		System.out.println(~j);
		System.out.println(Integer.toBinaryString(~j));
		/*
		
11111111111111111111111111111011
	 */
	}
}
