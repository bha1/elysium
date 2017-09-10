package com.gfg.reflection.business.service;

public class InstanceOfIsInstance {
	public static void main(String[] args) {
		Integer i = new Integer(5);
		
		System.out.println(i instanceof Integer);
		try {
			System.out.println(Class.forName("java.lang.Integer").isInstance(i));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
