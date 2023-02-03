package com.vignesh.generics;

import java.util.List;

public class RawTypeDemo {

	public static void main(String[] args) {
		Box<Integer> genBox = new Box<>(List.of(1, 2, 3, 4, 5, 6));

		for (Integer x : genBox.getA()) {
			System.out.println(x);

		}
		Box rawBox = new Box(List.of(1, 2, "basic"));
	
	}

}
