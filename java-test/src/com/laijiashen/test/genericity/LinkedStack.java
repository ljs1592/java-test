package com.laijiashen.test.genericity;

import com.laijiashen.Bean;

public class LinkedStack<T> {
	
	private static class Node<U>{
		U item;
		Node<U> next;
		
		Node() {
			item = null; next = null;
		}
		
		Node(U item,Node<U> next){
			this.item = item; this.next = next;
		}
		
		boolean end() {return item == null&&next == null;}
	}
	
	private T t;
	
	private Node<T> top = new Node<>();
	
	public void push(T item) {
		top = new Node<T>(item, top);
	}
	
	public T pop() {
		T result = top.item;
		if (!top.end()) {
			top = top.next;
		}else {
			System.out.println("ÒÑµ½µ×");
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		LinkedStack<Bean> linkedStack = new LinkedStack<Bean>();
		
		for (int i = 0; i < 5; i++) {
			linkedStack.push(new Bean());
		}
		
		for (int i = 0; i < 7; i++) {
			Object result = linkedStack.pop();
			System.out.println(result);
		}
	}
	
}
