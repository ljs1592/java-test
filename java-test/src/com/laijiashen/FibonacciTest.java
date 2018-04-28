package com.laijiashen;

public class FibonacciTest {
	
	public static int count = 0;
	
	public static int fibonacci(int n) {
		count++;
		if (n>=2) {
			return fibonacci((n-1))+fibonacci((n-2));
		}else if (n==0) {
			return 0;
		}else{
			return 1;
		}
	}
	
	public static void main(String[] args) {
		int result = FibonacciTest.fibonacci(7);
		System.out.println(result);
//		System.out.println(FibonacciTest.count);
	}

}
