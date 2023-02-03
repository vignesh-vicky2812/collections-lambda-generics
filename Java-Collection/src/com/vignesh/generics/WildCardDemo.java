package com.vignesh.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WildCardDemo {

//	public static void displayData(List<?> l) {  //we dont know what generic
	public static void displayData(List<? super Integer> l) {
		for (Object t : l) {
			System.out.println(t);
		}
//		l.add(10);
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<Number> list1 = new ArrayList<>();

		list.add(34);
		list.add(1);
		list1.add(22);
		list1.add(2);

		displayData(list);
		displayData(list1);

		// example
		List<? extends Number> l2 = new ArrayList<Number>();
		List<? extends Number> l3 = new ArrayList<Integer>();
		List<? super Integer> l4 = new ArrayList<Integer>();
		List<? super Integer> l5 = new ArrayList<Number>(); 

		Number n = 12;
		Integer i = 10;

		l4.add(i);
		l5.add(i); 

	}
}
