package com.laijiashen.test.genericity;

public class Static<T> {
	
	public static <T> void asd(T a){
		
	}
	
	
	public  void aa(T a) {
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Static s = new Static();
		
		s.aa(1);
		s.aa(2);
		s.aa("1");
		
	}
	

}
