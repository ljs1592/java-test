package com.laijiashen.packageTest1;

public class Test1 {
	
	public static void main(String[] args) {
		
		A1 a1 = new A1();//public,protected,default�����Է���
		A1Sub a1Sub = new A1Sub();//public,protected,default�����Է���
		
		com.laijiashen.packageTest2.A1Sub2 a1Sub2 = new com.laijiashen.packageTest2.A1Sub2();//public,protected���Է���
		
		A1SubIn in = new A1SubIn();
	}

}
