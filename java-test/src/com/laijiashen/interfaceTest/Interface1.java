package com.laijiashen.interfaceTest;

public interface Interface1 {
	
	public void m1();
	
	
	public default void sameM1() {
		
		System.out.println("ю╢вт"+this.getClass());
		
	};

}
