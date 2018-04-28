package com.laijiashen;

import java.util.Arrays;

public class YinYongTest {
	
	public static void main(String[] args) {
		
		Integer[] i1 = {111,2,3,4,5};
		
		Integer[] i2 = new Integer[5] ;
		
		for (int i = 0; i < i1.length; i++) {
			i2[i] = i1[i];
		}
		
		Integer[] i3 = {1,2,3} ;
		
//		i3[0] = 111;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		System.out.println(Arrays.toString(i1));
		System.out.println(Arrays.toString(i2));
		System.out.println(Arrays.toString(i3));
		
		i3 = i1;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		System.out.println(Arrays.toString(i1));
		System.out.println(Arrays.toString(i2));
		System.out.println(Arrays.toString(i3));
		
	}

}
