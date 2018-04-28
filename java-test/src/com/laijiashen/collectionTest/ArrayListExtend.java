package com.laijiashen.collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ArrayListExtend<E> extends ArrayList<E>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 548565093510668654L;
	
	public Object[] elementData2;
	
	public int modifyCount;
	
	public ArrayListExtend() {
		super();
		this.modifyCount = super.modCount;
//		this.elementData2 = super.ele
	}
	
	 public ArrayListExtend(int initialCapacity) {
		 super(initialCapacity);
	 }
	
	 
	 public ArrayListExtend(Collection<? extends E> c) {
		 super(c);
	 }
	 
	 
	
	
	

}
