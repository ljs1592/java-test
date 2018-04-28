package com.laijiashen.collectionTest;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetTest {
	
	
	
	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();
		
		Collections.addAll(set1, "A B C D E F G H I J K L".split(" "));
		
		
		Set<String> set2 = new HashSet<>();
		
		Collections.addAll(set2, "H I J K L".split(" "));
		
		System.out.println(set1.containsAll(set2));
		
	}

}

