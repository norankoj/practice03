package com.javaex.problem05;

public class StringUtil {
    
    

	public static String concatString(String[] strArray) {
		String sum = "";//null이라고 쓰거나 String값 초기화 방법!!!
		for(int i=0;i<strArray.length;i++) {
			sum+=strArray[i];
		}
		return sum;
	}

}
