package com.yash.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchingDemo4 {

	public static void main(String[] args) {

		Pattern p=Pattern.compile("[abc]");
		Matcher m=p.matcher("abcefgabc123abxaybzc");
		while(m.find()) {
			System.out.println(m.start()+" ");
		}
	}

}
