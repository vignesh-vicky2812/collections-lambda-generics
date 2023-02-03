package com.vignesh.lambdacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingListWithoutLambda {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(2);
		list.add(40);
		list.add(1);

		System.out.println(list);
		Collections.sort(list, new MyComparator());
		System.out.println(list);

	}
}

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer arg0, Integer arg1) {
		if (arg0 > arg1)
			return -1;
		else if (arg0 < arg1)
			return 1;
		else
			return 0;
	}

}
