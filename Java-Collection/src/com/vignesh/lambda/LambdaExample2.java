package com.vignesh.lambda;

interface MyFunInterface2 {
	public int findLength(String str);
}



public class LambdaExample2 {

	public static void main(String[] args) {
		MyFunInterface2 funInter = (a) -> a.length();
		System.out.println(funInter.findLength("india")); 

	}
}
