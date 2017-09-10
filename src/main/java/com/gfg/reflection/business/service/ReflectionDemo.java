package com.gfg.reflection.business.service;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Test {
	private String s;

	public Test() {
		this.s = "GfG";
	}

	public void method1() {
		System.out.println("the string is : " + s);
	}

	public void method2(int n) {
		System.out.println("the number is : " + n);
	}

	private void method3() {
		System.out.println("Private method invoked !!");
	}
}

public class ReflectionDemo {
	public static void main(String[] args) throws Exception {
		// creating object whoes property is to be checked
		Test obj = new Test();

		// creating class object from the object using get class
		Class cls = obj.getClass();
		System.out.println("the name of the class is :" + cls.getName());

		// getting the constructor of the class
		Constructor constructor = cls.getConstructor();
		System.out.println("name of the constructor is :" + constructor.getName());

		// getting methods of the class throught the object using getMethods
		Method[] methods = cls.getMethods();

		// printing method name
		for (Method method : methods) {
			System.out.println("method name : " + method.getName());
		}

		// create objects of desired methods using method name and parameter class as
		// arguments to the method
		Method methodCall1 = cls.getDeclaredMethod("method2", int.class);
		methodCall1.invoke(obj, 19);
		
		// create object os desired field by providing field name as argument to the method
		Field field = cls.getDeclaredField("s");
		
		//allow access to the field irrespective to the access specifier assigned to the field
		field.setAccessible(true);
		
		//set value into the field
		field.set(obj, "JAVA");
		
		Method methodCall2 = cls.getDeclaredMethod("method1");
		methodCall2.invoke(obj);
		
		Method methodCall3 = cls.getDeclaredMethod("method3");
		methodCall3.setAccessible(true);
		methodCall3.invoke(obj);
		
		
		
		

	}
}
