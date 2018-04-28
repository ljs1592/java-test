package com.laijiashen.serTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class House implements Serializable{};

class Animal implements Serializable{
	
	private String name;
	private House preferredHouse;
	
	public Animal(String n,House h) {
		this.name = n;
		this.preferredHouse = h;
	}
	
	@Override
	public String toString() {
		return name + "[" + super.toString() + "]" + "preferredHouse为：" + preferredHouse;
	}
	
}

public class MyWorld {
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		House h = new House();
		
		List<Animal> list = new ArrayList<Animal>();
		
		list.add(new Animal("狗", h));
		list.add(new Animal("猫", h));
		list.add(new Animal("猪", h));
		
		House h2 = new House();
		List<Animal> list2 = new ArrayList<Animal>();
		
		list2.add(new Animal("狗2", h2));
		list2.add(new Animal("猫2", h2));
		list2.add(new Animal("猪2", h2));
		
		System.out.println(list);
		
		ByteArrayOutputStream buf1 = new ByteArrayOutputStream();
		
		ObjectOutputStream o1 = new ObjectOutputStream(buf1);
		o1.writeObject(list);
		o1.writeObject(list2);
		
		
//		o1.close();
		
		ByteArrayOutputStream buf2 = new ByteArrayOutputStream();
		
		ObjectOutputStream o2 = new ObjectOutputStream(buf2);
		o2.writeObject(list);
		
		ObjectInputStream i1 = new ObjectInputStream(new ByteArrayInputStream(buf1.toByteArray()));

		ObjectInputStream i2 = new ObjectInputStream(new ByteArrayInputStream(buf1.toByteArray()));
		
		ObjectInputStream i3 = new ObjectInputStream(new ByteArrayInputStream(buf2.toByteArray()));
		
		List 
			animals1 = (List) i1.readObject(),
			animals2 = (List) i1.readObject(),
			animals3 = (List) i3.readObject();
		
		
		System.out.println("动物1：" + animals1);
		System.out.println("动物2：" + animals2);
		System.out.println("动物3：" + animals3);
	}
	
	
}
