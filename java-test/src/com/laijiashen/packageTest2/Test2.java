package com.laijiashen.packageTest2;

import com.laijiashen.packageTest1.A1;
import com.laijiashen.packageTest1.A1Sub;
import com.laijiashen.packageTest1.Interface1;

public class Test2 {
	
	

	public static void main(String[] args) {
		
		A1 a1 = new A1();//只能访问到public方法
		A1Sub a1Sub = new A1Sub();//只能访问到public方法
		
		com.laijiashen.packageTest2.A1Sub2 a1Sub2 = new com.laijiashen.packageTest2.A1Sub2();//只能访问到public方法
		
		
		
		
	}
	
}

