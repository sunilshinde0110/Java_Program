package com.yash.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchingDemo {

	public static void main(String[] args) {

		Pattern p=Pattern.compile("\\w");
		Matcher m=p.matcher("a 1 56_z");
		while(m.find()) {
			System.out.println(m.start()+" ");
		}
	}

}
