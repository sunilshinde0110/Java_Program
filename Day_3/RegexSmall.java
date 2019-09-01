package com.yash.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSmall {

	public static void main(String[] args) {

		Pattern p=Pattern.compile("aba");
		Matcher m=p.matcher("abaaaba");
		while(m.find()) {
			System.out.println(m.start());
		}
	}

}
