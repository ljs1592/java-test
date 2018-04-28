package com.laijiashen.test.genericity;

public class Tuple {
	
	public static <A, B, C, Bean> void name(A a,B b,C c,Bean bean) {
		
	}
	
	public static void main(String[] args) {
		name("1", "1", "1", "1");
	}
	
}

