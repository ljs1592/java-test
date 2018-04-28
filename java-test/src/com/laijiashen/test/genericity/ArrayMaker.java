package com.laijiashen.test.genericity;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMaker<T> {
	
	public Class<T> kind;
	
	public ArrayMaker(Class<T> kind) {this.kind = kind;}
	
	@SuppressWarnings("unchecked")
	T[] create(int size) {
		return (T[]) Array.newInstance(kind, size);
	}
	
	public static void main(String[] args) {
		
		ArrayMaker<String> arrayMaker = new ArrayMaker<>(String.class);
		
		String[] strings = arrayMaker.create(10);
		
		System.out.println(Arrays.toString(strings));
		
	}

}
