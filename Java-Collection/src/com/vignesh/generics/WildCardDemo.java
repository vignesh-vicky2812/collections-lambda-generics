package com.vignesh.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {

//	public static void displayData(List<?> l) {  //we dont know what generic
	public static void displayData(List<? super Integer> l) {
		for(Object t: l) {
			System.out.println(t);
		}		
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<Number> list1 = new ArrayList<>();
		
		list.add(34);
		list.add(50);
		list1.add(22);
		list1.add(2);
		
		displayData(list);
		displayData(list1);
		
	}
}
