package com.vignesh.generics;

public class GenericMethod {

	private static <T> String concat(T data) {
		return "Data is: " + data;
	}

	public static void main(String[] args) {
		System.out.println(concat("Basics"));
		System.out.println(concat(1));
	}

}
