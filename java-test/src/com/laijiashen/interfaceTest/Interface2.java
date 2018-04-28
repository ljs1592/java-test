package com.laijiashen.interfaceTest;

public interface Interface2 {
	
	public void m2();
	
	
	public default void sameM() {
		
		System.out.println("ю╢вт"+this.getClass());
		
	};

}
