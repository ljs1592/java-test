package com.laijiashen.collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SuffleTest {
	
	private static Integer a1[] = {1,2,3,4,5,6,7,8,9};
	private static Integer a2[] = {1,2,3,4,5,6,7,8,9};
	
	public static void main(String[] args) {
		
		Random random = new Random(47);
		
		List<Integer> list1 = new ArrayList<>(Arrays.asList(a1));
		System.out.println("打乱前："+list1);
		Collections.shuffle(list1, random);
		System.out.println("打乱后："+list1);
		System.out.println("此时列表："+Arrays.toString(a1));
		
		List<Integer> list2 = Arrays.asList(a2);
		System.out.println("打乱前："+list2);
		Collections.shuffle(list2, random);
		System.out.println("打乱后："+list2);
		System.out.println("此时列表："+Arrays.toString(a2));
		
		List<Integer> list3 = new ArrayList<>(10);
		for (Integer integer : a1) {
			list3.add(integer);
		}
		System.out.println("打乱前："+list3);
		Collections.shuffle(list3, random);
		System.out.println("打乱后："+list3);
		System.out.println("此时列表："+Arrays.toString(a1));
		
		
	}

}
