package com.laijiashen.regexTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	
	
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("[a-c]");
		
		Matcher matcher = pattern.matcher("a");
		
		boolean b = matcher.matches();
		
		System.out.println(b);
		
	}
	

}
