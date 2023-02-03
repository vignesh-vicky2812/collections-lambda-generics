package com.vignesh.generics;

import java.util.ArrayList;

public class Behaviour {


	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("basic");
		l.add("asdsad");
		method(l);
		System.out.println(l);

	}
	
	public static void method(ArrayList ls) {
		
		ls.add(10);
		ls.add("as");
		
	}
}
