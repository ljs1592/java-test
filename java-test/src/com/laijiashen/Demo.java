package com.laijiashen;


import java.util.HashMap;
import java.util.Map;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Map<A, B> map = new HashMap<A, B>();
//		A a1 = new A("a", 10);
//		A a2 = new A("a", 12);
//		B b1 = new B("b", 10);
//		B b2 = new B("b", 11);
//		map.put(a1, b1);
//		map.put(a2, b2);
//		a1.setAge(12);
//		System.out.println(a1);
//		System.out.println(a2);
//		System.out.println(map.get(a1));
	}

}

class A{
	private String name;
	private Integer age;
	
	public A(String name, Integer age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(!(obj instanceof A))
			return false;
		A a = (A)obj;
		return name.equals(a.getName());
	}
}

class B{
	private String name;
	private Integer age;
	
	public B(String name, Integer age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return name+"µÄÄêÁäÎª"+age;
	}
}
