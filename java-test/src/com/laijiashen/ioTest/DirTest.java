package com.laijiashen.ioTest;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class DirTest {
	
	public static void main(String[] args) {
		
		
		String regex = "^a";
		
		File path = new File(".");
		String[] list;
		if (null==regex) {
			list = path.list();
		}else {
			list = path.list(new DirFilter(regex));
		}
		
		for (String string : list) {
			System.out.println(string);
		}
	}
	
}

class DirFilter implements FilenameFilter{
	
	private Pattern pattern;
	
	public DirFilter(String regex) {
		pattern = Pattern.compile(regex);
	}
	
	@Override
	public boolean accept(File dir, String name) {
		return pattern.matcher(name).matches();
	}
	
}



