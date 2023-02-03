package com.vignesh.generics;

import java.util.Arrays;
import java.util.List;

public class BoundedT {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[] {2,3,4,5,6});
		List<String> slist = Arrays.asList(new String[] {"hello","there"});
		
		DataSorter<Integer> sorter1= new DataSorter<>(list);
		DataSorter<String> sorter2= new DataSorter<>(slist);
		
		sorter1.getSortedData();
		sorter2.getSortedData();
		
		CBound b = new CBound();
		getSortedData(b);
		
	}
	
	public static <T extends IBound1 & IBound2> void getSortedData(T list) {
//		list.sort(null);
//		
//		for(T t: list) {
//			System.out.println(t);
//		}
	}
}
interface IBound1 {
	
}
interface IBound2 {
	
}
class CBound implements IBound1, IBound2 {
	
}