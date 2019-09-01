package com.yash.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchingDemo6 {

	public static void main(String[] args) {

		Pattern p=Pattern.compile("0[xX][0-9a-fA-F]");
		Matcher m=p.matcher("12 0x 0x12 0Xf 0Xg");
		while(m.find()) {
			System.out.println(m.start()+" ");
		}
	}

}
