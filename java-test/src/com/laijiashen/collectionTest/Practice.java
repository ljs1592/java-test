package com.laijiashen.collectionTest;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Practice {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>(10);
		
		for (int i = 0; i < 10; i++) {
			list1.add(Integer.valueOf(i));
		}
		
		System.out.println(list1);
		
		ListIterator<Integer> listIte = list1.listIterator(list1.size());
		
		List<Integer> list2 = new ArrayList<>(10);
		
		while (listIte.hasPrevious()) {
			Integer integer = (Integer) listIte.previous();
			list2.add(integer);
		}
		
		System.out.println(list2);
		
		
	}

}
