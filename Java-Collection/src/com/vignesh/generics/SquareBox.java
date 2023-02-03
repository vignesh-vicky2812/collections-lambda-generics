package com.vignesh.generics;

import java.util.List;

//public class SquareBox<E> extends Box<T> {  //wont work because T cant be subtype of E
public class SquareBox<T> extends Box<T> {
	
	public SquareBox(List<T> a) {
		super(a);
	}
}
