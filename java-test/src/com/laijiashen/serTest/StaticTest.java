package com.laijiashen.serTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract class Shape implements Serializable{
	
	public static final int RED = 1, BLUE = 2 , GREEN = 3;
	private int xPos , yPos , dimension;
	private static int count = 0;
	private static Random random = new Random(47);
	public abstract void setColor(int newColor);
	public abstract int getColor();
	public Shape(int xVal,int yVal,int dim) {
		xPos = xVal;
		yPos = yVal;
		dimension = dim;
	}
	
	public String toString() {
		return getClass()+"===>>> color ["+getColor()+"] xPos ["+xPos+"] yPos ["+yPos+"] dimension ["+dimension+"]\n";
	}
	
	public  static Shape randomFactory() {

		int xVal = random.nextInt(100);
		int yVal = random.nextInt(100);
		int dim = random.nextInt(100);
		
		switch (count++%3) {
		case 0: return new Circle(xVal, yVal, dim);
		case 1: return new Square(xVal, yVal, dim);
		case 2: return new Line(xVal, yVal, dim);
		default: return null;
		}
	} 
}

class Circle extends Shape{
	
	private static int color = RED;
	
	public Circle(int xVal,int yVal,int dim) {
		super(xVal, yVal, dim);
	}
	
	@Override
	public void setColor(int newColor) {
		color = newColor;
	}

	@Override
	public int getColor() {
		return color;
	}
	
}

class Square extends Shape{
	
	private static int color;
	
	public Square(int xVal,int yVal,int dim) {
		super(xVal, yVal, dim);
		color = RED;
	}
	
	@Override
	public void setColor(int newColor) {
		color = newColor;
	}

	@Override
	public int getColor() {
		return color;
	}
}

class Line extends Shape{
	
	private static int color = RED;
	
	public static void serializeStaticState(ObjectOutputStream out) throws IOException {
		out.writeInt(color);
	}
	
	public static void deserializeStaticState(ObjectInputStream in) throws IOException {
		color = in.readInt();
	}
	
	public Line(int xVal,int yVal,int dim) {
		super(xVal, yVal, dim);
	}
	
	@Override
	public void setColor(int newColor) {
		color = newColor;
	}

	@Override
	public int getColor() {
		return color;
	}
}

public class StaticTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		List<Class<? extends Shape>> shapeTypes = new ArrayList<Class<? extends Shape>>();
		shapeTypes.add(Circle.class);
		shapeTypes.add(Square.class);
		shapeTypes.add(Line.class);
		
		List<Shape> shapes = new ArrayList<Shape>();
		for (int i = 0; i < 10; i++) {
			Shape shape = Shape.randomFactory();
			shape.setColor(Shape.GREEN);
			shapes.add(shape);
		}
		
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("CAD.out"));
		
		Line.serializeStaticState(outputStream);
		
		outputStream.writeObject(shapeTypes);
		
		outputStream.writeObject(shapes);
		
		
		System.out.println(shapes);
		
	}
	
}
