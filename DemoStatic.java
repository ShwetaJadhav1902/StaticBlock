package com.staticblock;

public class DemoStatic {
	static {
		System.out.println("static block 1");
	}
	public static void main(String[] args) {
		System.out.println("Main Metod");
	}
	static {
		System.out.println("static block 2");
	}
	static {
		System.out.println("static block 3");
	}

}
