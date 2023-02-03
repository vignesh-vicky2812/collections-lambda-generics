package com.vignesh.generics;

public class Demo {

	public static void main(String[] args) {
		Data<String> d1 = new Data<>("this is d1");

		System.out.println(d1.toString());

		Data<Integer> d2 = new Data<>(10);
//		int data = (int) (d2.getData());
		System.out.println(d2.toString()); // generics only applicable for class instances not for static members

		IData<String> d3 = new Data<>("we have implemented a generic interface");
		System.out.println(d3.getData());
		
		//subclassing
		Data<String> d4 = new Data<>("data 4");
		BaseData<String> b1 = d4;
	}

}
