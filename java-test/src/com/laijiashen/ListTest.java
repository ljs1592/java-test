package com.laijiashen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		
		System.out.println(list);
		
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1));
		
		list2.add(2);
		
		System.out.println(list2);
	}

}
