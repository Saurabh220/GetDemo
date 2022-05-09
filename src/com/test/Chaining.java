package com.test;

public class Chaining {
	
	Chaining() {
		this(5);
		System.out.println("the default constructor");
	}
	
	Chaining(int x) {
		this("java");
		System.out.println("the int paramartrized constructor" +x);
	}

	 Chaining(String string) {
		System.out.println(string);
	}
	 public static void main(String[] args) {
		Chaining chaining = new Chaining();
		
	}

}
