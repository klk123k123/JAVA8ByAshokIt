package com.matchingstrems.practise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class finmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person>person=Arrays.asList(
				new Person("Lakshmi","INDIA"),
				new Person("Lakshman","MEXICO"),
				new Person("Hanvika","US"),
				new Person("Haswin","America"));
		Optional<Person>findFirst=person.stream().filter(p -> p.country.equals("INDIA"))
			//	.findFirst();
		.findAny();
		if(findFirst.isPresent())
			System.out.println(findFirst.get());
	}

}
