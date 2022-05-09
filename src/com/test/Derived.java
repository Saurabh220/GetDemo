package com.test;

public class Derived extends Base {
	
	Derived(){
		System.out.println("no argument");
	}
	
	Derived(String str){
		super(str);
		System.out.println("Parametrizeds");
	}
	public static void main(String[] args) {
		
		Derived derived = new Derived("");
	}

}
