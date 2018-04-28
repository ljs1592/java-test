package com.laijiashen.test.genericity;

import java.util.HashMap;
import java.util.Map;

public class NewT {

	public static <K, V> Map<K, V> map(){
		return new HashMap<K, V>();
	}
	
}
