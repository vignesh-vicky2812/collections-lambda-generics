package com.vignesh.streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamsDemo {

	public static void main(String[] args) {
		long time1, time2;
		List<Employee> eList = new ArrayList<Employee>();

		for (int i = 0; i < 100; i++) {
			eList.add(new Employee("john", 20000));
			eList.add(new Employee("vignesh", 2000));
			eList.add(new Employee("mike", 23000));
			eList.add(new Employee("virat", 50000));
			eList.add(new Employee("sachin", 90000));
			eList.add(new Employee("kallis", 10000));
		}
		
		//sequential processing

		time1 = System.currentTimeMillis();
		System.out.println(eList.stream().filter(e -> e.getSalary() > 20000).count());
		
		time2 = System.currentTimeMillis();
		
		System.out.println(time2-time1);
		
		
		//parallel processing
		time1= System.currentTimeMillis();
		
		System.out.println(eList.parallelStream().filter(e -> e.getSalary() > 20000).count());
		
		time2 = System.currentTimeMillis();
		
		System.out.println(time2-time1);
	}

}
