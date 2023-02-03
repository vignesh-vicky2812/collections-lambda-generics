package com.vignesh.generics;

import java.util.HashMap;

public class CollectionDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		Bin<String, Integer> bin = new Bin<>();
		
		bin.setDryTrash("goffff");
		bin.setWetTrash(12122212);
		
		System.out.println(bin.getDryTrash()+" "+bin.getWetTrash());
		
	}
}
