package com.laijiashen.serTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class RecoverCAD {
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("CAD.out"));
		
		List<Class<? extends Shape>> shapeTypes = (List<Class<? extends Shape>>) in.readObject();
		
		Line.deserializeStaticState(in);
		
		List<Shape> shapes = (List<Shape>) in.readObject();
		
		
		System.out.println(shapes);
		
	}

}
