package com.yash.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchingDemo5 {

	public static void main(String[] args) {

		Pattern p=Pattern.compile("[a-fA-F&&[^fA]]");
		Matcher m=p.matcher("abcefgabc123abxaybzc");
		while(m.find()) {
			System.out.print(m.start()+" ");
		}
	}

}
