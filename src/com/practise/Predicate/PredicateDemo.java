package com.practise.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//List<String> arr1=Arrays.asList("Hanvika","Apparao","Amalesh","Anshu","Hancshi");
		String[] arr= {"Hanvika","Apparao","Amalesh","Anshu","Hancshi"};
Predicate<String> p= arr1 -> arr1.charAt(0)=='A';
for(String names:arr)
	if(p.test(names))
		System.out.println(names);
	}

}
