package com.gfg.string.business.service;

public class EvaluateSimpleExpression {
	
/*	
 	1+2*3 will be evaluated to 9.
	4-2+6*3 will be evaluated to 24.
	1++2 will be evaluated to -1(INVALID).
	
	space are allowed in string
	
*/
	
	public static boolean isValidOperand(Character ch) {
		if(ch>='0' && ch<='9') {
			return true;
		}
		return false;
	}
	
	public static int value(Character ch) {
		return Integer.valueOf(ch - '0');
	}
	public static int evaluate(String expression) {
		if(expression != null) {
			int length = expression.length();
			int left;
			int right;
			for(int i = 0; i<length-2;i++) {
				left = value(expression.charAt(i));
				right = Integer.valueOf(expression.charAt(i+2));
				System.out.println(left);
				System.out.println(expression.charAt(i));
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String expr1 = new String("1+2*3");
		String expr2 = new String("4-2+6*3");
		String expr3 = new String("1++2");
		evaluate(expr1);
		
		
	}
	
}
