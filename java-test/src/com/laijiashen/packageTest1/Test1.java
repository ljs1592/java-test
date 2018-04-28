package com.laijiashen.packageTest1;

public class Test1 {
	
	public static void main(String[] args) {
		
		A1 a1 = new A1();//public,protected,default都可以访问
		A1Sub a1Sub = new A1Sub();//public,protected,default都可以访问
		
		com.laijiashen.packageTest2.A1Sub2 a1Sub2 = new com.laijiashen.packageTest2.A1Sub2();//public,protected可以访问
		
		A1SubIn in = new A1SubIn();
	}

}
