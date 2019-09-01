package com.yash.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchingDemo2 {

	public static void main(String[] args) {

		Pattern p=Pattern.compile("\\d");
		Matcher m=p.matcher("a12c3e456f");
		while(m.find()) {
			System.out.println(m.start()+" ");
		}
	}

}
