package com.laijiashen.test.genericity;

import java.util.Map;

import com.laijiashen.Bean;
import com.laijiashen.Demo;

public class LimitsOfRefrence {
	
	public static Map<Bean, ? extends Demo> f(Map<Bean, ? extends Demo> a) {
		System.out.println(a.getClass().getName()+"\t"+a.hashCode());
		
		return a;
	}
	
	public static void main(String[] args) {
		
		Map<Bean, ? extends Demo> m = f(NewT.<Bean,Demo>map());
		
	}

}
