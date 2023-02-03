package com.vignesh.generics;

import java.util.ArrayList;
import java.util.List;

public class SubTyping {
	public static void main(String[] args) {
		Object o = new Object();
		Integer i = Integer.valueOf(10);
		
		o=i;
		
		List<Number> list = new ArrayList<>();
		list.add(Integer.valueOf(10));
		list.add(Double.valueOf(10.5));
//		list.add("asasd");
		
		
		List<Box<Integer>> bList = new ArrayList<>();
		bList.add(new Box<>(List.of(1,2,3,4)));
		bList.add(new SquareBox<>(List.of(10,20,30,40)));
		
		
	}

}
