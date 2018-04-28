package com.laijiashen.serTest;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalTest {
	
	public static void exOutIn() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Student stu = new Student();
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("stu.out"));
		
		out.writeObject(stu);
		
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("stu.out"));
		
		Object student = in.readObject();
		
		
	}
	
	
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		ExternalTest.exOutIn();
		
	}

}


class Student implements Externalizable{
	
	public Student() {
		System.out.println("无参构造函数");
	}
	
	public Student(int age) {
		System.out.println("有参构造函数:"+age);
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("调用：writeExternal");
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("调用：readExternal");
	}
}

