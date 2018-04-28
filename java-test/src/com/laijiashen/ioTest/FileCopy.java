package com.laijiashen.ioTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	
	
	public static void noBuffer() {
		
		FileInputStream input = null;
		FileOutputStream out = null;
		
		int count = 0;
		try {
			Long startTime = System.currentTimeMillis();
			input = new FileInputStream(new File("a.txt"));
			out = new FileOutputStream("a1.txt");
			
			int numberRead=0;  
			while((numberRead=input.read())!=-1) {  //读取文件字节，并递增指针到下一个字节  
	             count++;  
	             out.write(numberRead);
	        }  
			Long endTime = System.currentTimeMillis();
	        System.out.println("---长度是： "+count+" 字节");  
	        System.out.println("---共耗时： "+(endTime-startTime)+" 毫秒"); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void buffer() {
		
		FileInputStream input = null;
		FileOutputStream out = null;
		
		int count = 0;
		byte[] buffer=new byte[1024];   //一次取出的字节数大小,缓冲区大小  
		try {
			Long startTime = System.currentTimeMillis();
			input = new FileInputStream(new File("a.txt"));
			out = new FileOutputStream("a1.txt");
			
			int numberRead=0;  
			while((numberRead=input.read(buffer))!=-1) {  //读取文件字节，并递增指针到下一个字节  
	             count++;  
	             out.write(buffer, 0, numberRead);;
	        }  
			Long endTime = System.currentTimeMillis();
	        System.out.println("---长度是： "+count+" ("+buffer.length+")字节");  
	        System.out.println("---共耗时： "+(endTime-startTime)+" 毫秒"); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		FileCopy.noBuffer();
		FileCopy.buffer();
	}
	

}
