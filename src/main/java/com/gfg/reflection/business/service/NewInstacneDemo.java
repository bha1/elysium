package com.gfg.reflection.business.service;

class A {
	int a;
}

class B {
	int b;
}

public class NewInstacneDemo {
	public static void fun(String c) throws Exception {
		Object obj = Class.forName(c).newInstance();

		System.out.println("Object created for class :" + obj.getClass().getName());
	}

	public static void main(String[] args) {
		try {
			fun("com.gfg.reflection.business.service.B");
			fun("com.gfg.reflection.business.service.A");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
