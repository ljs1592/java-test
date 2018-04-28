package com.laijiashen.test.genericity;

import java.awt.Color;

interface HasColor{Color getColor();}

class Colored<T extends HasColor>{
	T item;
	public Colored(T item) { this.item = item;}
	T getItem() {return this.item;}
	Color color() { return item.getColor();}
}

class Dimension {public int x, y, z;}

class ColoredDimension<T extends Dimension & HasColor>{
	
	
	
}

public class BaiscBounds {

	public static void main(String[] args) {
		
		
	}
	
}





