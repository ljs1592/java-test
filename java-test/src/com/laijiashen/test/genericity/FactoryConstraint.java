package com.laijiashen.test.genericity;

interface FactoryI<T> {
	public T create();
}

class Foo2<T>{
	private T x;
	
	public <F extends FactoryI<T>> Foo2(F factory) {
		x = factory.create();
	}
}

class IntegerFactory implements FactoryI<Integer>{
	@Override
	public Integer create() {
		return new Integer(0);
	}
}

class Widget{
	public static class Factory implements FactoryI<Widget>{
		@Override
		public Widget create() {
			return new Widget();
		}
	}
	
}

public class FactoryConstraint {
	public static void main(String[] args) {
		Object obj1 = new Foo2<Integer>(new IntegerFactory());
		Object obj2 = new Foo2<Widget>(new Widget.Factory());
		
		System.out.println(obj1);
		System.out.println(obj2);
	}
	
}



