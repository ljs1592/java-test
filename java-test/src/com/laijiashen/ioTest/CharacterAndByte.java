package com.laijiashen.ioTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class CharacterAndByte {
	
	
	public static void character() {
		
		FileWriter fw = null;
		Writer writer = null;
		try {
			fw = new FileWriter("character.txt");
			fw.write("ÄãºÃ£¡£¡");
			writer = new StringWriter();
			BufferedWriter bw = new BufferedWriter(fw);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
//				fw.flush();
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		CharacterAndByte.character();
	}
	

}
