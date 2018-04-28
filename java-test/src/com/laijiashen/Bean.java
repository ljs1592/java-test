package com.laijiashen;

public class Bean {
	
	private String name;
	
	private Integer age;
	
	private static int constructCount = 0;
	
	public Bean() {
		this.name = "ÎÞÃû"+constructCount;
		this.age = constructCount;
		constructCount++;
	}
	
	public Bean(String name,Integer age) {
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
		return "["+this.name+","+this.age+"]";
	}

}
