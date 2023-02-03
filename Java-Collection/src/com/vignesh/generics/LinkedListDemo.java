package com.vignesh.generics;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		DataNode<Integer> node2 = new DataNode<>(20, null);
		DataNode<Integer> node1 = new DataNode<>(35, node2);
		
		DataNode<Double> node22 = new DataNode<>(20.2, null);
		DataNode<Double> node11 = new DataNode<>(10.5, node22);
		DataNode<Number> node111 = new DataNode<>(Double.valueOf(35.8), node11);
//		node111.setNext(node2);
		
		
		System.out.println(node111.toString());

	}
}
