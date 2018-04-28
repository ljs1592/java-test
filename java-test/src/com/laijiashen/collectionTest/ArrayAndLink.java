package com.laijiashen.collectionTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.laijiashen.Bean;

public class ArrayAndLink {
	
	public static int times = 1000000;
	
	public static void main(String[] args) {
		
		
		ArrayList<Bean> array = new ArrayList<Bean>();
		LinkedList<Bean> link = new LinkedList<>();
		Bean bean = new Bean();
		
//		for (int i = 0; i < times; i++) {
//			beanArray[i] = new Bean();
//		}
		Random random = new Random(7);
		
		Long startTime = System.currentTimeMillis();
		for (int i = 0; i < times; i++) {
			array.add(bean);
		}
		Long endTime = System.currentTimeMillis();
		
		Long startTime2 = System.currentTimeMillis();
		for (int i = 0; i < times; i++) {
			link.add(bean);
		}
//		for (int i = 0; i < times; i++) {
//			beanArray[i] = bean;
//		}
		Long endTime2 = System.currentTimeMillis();
		
		Long startTime3 = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
//			Bean bean2 = array.get(random.nextInt(times-1));
//			array.remove(random.nextInt(array.size()));
			array.add(random.nextInt(array.size()), bean);
		}
		Long endTime3 = System.currentTimeMillis();
		
		Long startTime4 = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
//			Bean bean2 = beanArray[random.nextInt(times-1)];
//			Bean bean2 = link.get(random.nextInt(times-1));
//			link.remove(random.nextInt(link.size()));
			
			link.add(random.nextInt(link.size()), bean);
		}
		
		Long endTime4 = System.currentTimeMillis();
		
		
		System.out.println("数组：");
		System.out.println(endTime-startTime);
		System.out.println("链表：");
		System.out.println(endTime2-startTime2);
		System.out.println("数组：");
		System.out.println(endTime3-startTime3);
		System.out.println("链表：");
		System.out.println(endTime4-startTime4);
		
		
	}

}
