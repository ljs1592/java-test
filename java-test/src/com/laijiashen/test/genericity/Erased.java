package com.laijiashen.test.genericity;

public class Erased<T> {
	
	
	private final int size = 100;
	
	public  void f(Object obj) {
//		if (obj instanceof T) {} //error
//		T var = new T();		 //error
//		T[] array = new T[size]; //error
		@SuppressWarnings("unchecked")
		T[] array = (T[]) new Object[size];
		Object[] name = new Object[0];
		
		
	}

}
