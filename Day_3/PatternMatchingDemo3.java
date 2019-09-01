package com.yash.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchingDemo3 {

	public static void main(String[] args) {

		Pattern p=Pattern.compile("\\s");
		Matcher m=p.matcher("a 1 56 _z");
		while(m.find()) {
			System.out.println(m.start()+" ");
		}
	}

}
