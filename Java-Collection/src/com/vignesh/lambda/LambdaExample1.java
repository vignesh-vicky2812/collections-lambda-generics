package com.vignesh.lambda;

interface MyFunInterface {
	public void funMethodAdd(int a, int b);
}



public class LambdaExample1 {

	public static void main(String[] args) {
		MyFunInterface funInter = (a, b) -> System.out.println(a + b);
		funInter.funMethodAdd(5, 10);

	}
}
