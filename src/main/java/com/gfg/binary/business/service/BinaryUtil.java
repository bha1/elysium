package com.gfg.binary.business.service;

public class BinaryUtil {
	
	public static int findFirstBitWithSetBit(int x) {
		int position = 0;
		while((x&1) != 1) {
			position++;
			x=x>>1;
		}
		return position;
	}
	
	public static int sumUsingBinary(int x, int y) {
		while(y != 0) {
			int carry = x & y;
			x = x^y;
			y=carry<<1;			
			System.out.println(Integer.toBinaryString(x) +"-"+ Integer.toBinaryString(y) + "-" + Integer.toBinaryString(carry) );
		}
		return x;
	}
	
	public static void main(String[] args) {
		//System.out.println(findFirstBitWithSetBit(0));
		System.out.println(sumUsingBinary(15, 30));
	}
}
