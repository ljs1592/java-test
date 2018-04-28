package com.laijiashen;

public class YouYiFuHao {
	
	public static void main(String[] args) {
		
		int i = 10;
		
		int count = 0;
		
		while (i<10000000) {
			Float old = Float.valueOf(i);
			i = i + (i >> 1);
			count++;
			
			double a = i/old;
			System.out.println(count+"=="+i);
			System.out.println(i/old);
		}
//		while (i<=100000) {
//			System.out.println((i >> 1)/i);
//			System.out.println(i);
//		}
		
//		System.out.println(count);
		
	}

}
