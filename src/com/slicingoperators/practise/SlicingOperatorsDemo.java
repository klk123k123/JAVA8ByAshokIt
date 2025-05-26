package com.slicingoperators.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SlicingOperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=Arrays.asList("Lakshmi","Hanvika","Lakshman","Lenin",
				"Lashya","Lenin","Lernon","Haswitha");
		list.stream().distinct().forEach(c -> System.out.println(c));
		list.stream().skip(3).forEach(c -> System.out.println(c));
		list.stream().limit(5).forEach(c -> System.out.println(c));
		list.stream().distinct().collect(Collectors.toList());

	}

}
