package com.vignesh.lambda;

public class LambdaIntroduction {

	public static void main(String[] args) {
		MyFunctionalInterface funInter = () -> {
			System.out.println("hello");
		};
		funInter.funMethod();
	}

}

interface MyFunctionalInterface {
	public void funMethod();
}

class CallFunInterface implements MyFunctionalInterface {

	@Override
	public void funMethod() {
		System.out.println("Functional method");
	}

}