package com.vignesh.lambdacollections;

import java.util.function.Function;

public class FunctionExample {
	
	public static void main(String[] args) {
		String s = "sabastabasha";
		Function<String, Integer> fun = str -> str.length(); //return anythin based on the second parameter in generic
		int len = fun.apply(s);
		System.out.println(len);
		
	}

}
