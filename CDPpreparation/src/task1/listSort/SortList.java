package task1.listSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//отсортировать список по длине строк

public class SortList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Dmitriy");
		list.add("Nadezhda");
		list.add("Viktor");
		list.add("Pavel");
		list.add("Olga");

		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				int l1 = s1.length();
				int l2 = s2.length();

				if (l1 > l2) {
					return 1;
				} else if (l1 < l2) {
					return -1;
				}
				return s1.compareTo(s2);
			}
		});

		for (String el : list) {
			System.out.println(el);
		}
	}
}
