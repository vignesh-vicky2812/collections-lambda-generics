package com.vignesh.generics;

import java.util.LinkedList;
import java.util.List;

public class ErasureDemo {
	
	public static void main(String[] args) {
		System.out.println(method1(10));
	}
	
	public static String method1(Integer x) {
		List<String> a = new LinkedList<String>();
		List b = a;
		b.add(x);
		
		return a.iterator().next();
	}

}
