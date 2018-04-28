package com.laijiashen.test.genericity;

import com.laijiashen.Bean;

public class TwoTuple<A,B> {

	public final A first;
	
	public final B second;
	
	public TwoTuple(A a,B b) {
		first = a;
		second = b;
	}
	
	
	
	public static void main(String[] args) {
		
		TwoTuple<Bean, Bean> twoTuple = new TwoTuple<Bean, Bean>(new Bean("11", 11), new Bean("22", 22));
		
		System.out.println(twoTuple.first);
		System.out.println(twoTuple.second);
		
	}
	
}
