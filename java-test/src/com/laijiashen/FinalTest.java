package com.laijiashen;

public class FinalTest {

	
	private static Bean b1 = new Bean("张三", 12);
	
	private final static Bean b2 = new Bean("李四", 100);
	
	private final static int i = 1;
	
	private final static Integer I = 1;
	
	public static void main(String[] args) {
		
		I.valueOf("2");
		
		////////////////////////////////////////
		b1.setAge(123);
		b2.setAge(11111);
		
//		b2 = b1;
		System.out.println(b1);
		System.out.println(b2);
	}
}
