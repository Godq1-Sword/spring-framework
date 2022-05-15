package org.gdq.debug;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gdq
 * @since 2022/2/3
 */
public class ExampleTest {

	public static void main(String[] args) {
		List<Integer> listA = new ArrayList<>();
		listA.add(1);
		List<Integer> listB = listA;
		listB.add(2);
		System.out.println(listA);
		System.out.println(listB);
		System.out.println(listA == listB);
	}
}
