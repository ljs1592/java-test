package com.laijiashen.test.genericity;

import java.util.ArrayList;
import java.util.List;

class Fruit {}
class Apple extends Fruit {}
class Orange extends Fruit {}


public class CovariantArrays {
	
	public static void main(String[] args) {
		
//		Fruit[] apples = new Apple[10];
//		
//		try {
//			apples[0] = new Fruit();
//		} catch (Exception e) {
//			System.out.println(1);
//		}
//		
//		try {
//			apples[1] = new Orange();
//		} catch (Exception e) {
//			System.out.println(2);
//		}
		
		List<? extends Fruit> list = new ArrayList<Apple>();
		
//		list.add(new Orange());
		
	}

}
