package com.yash.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchingDemo7 {

	public static void main(String[] args) {

		Pattern p=Pattern.compile("\\d+");
		Matcher m=p.matcher("1 a12 234b");
		while(m.find()) {
			System.out.println(m.start()+" ");
		}
	}

}
