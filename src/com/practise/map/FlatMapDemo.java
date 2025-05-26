package com.practise.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>java=Arrays.asList("Core Java","Advanced JAVA","Spring Boot");
		List<String>ui=Arrays.asList("Html","CSS","Bootstrap","angular");
		
		List<List<String >> courses=Arrays.asList(java,ui);
		//courses.stream().forEach(s -> System.out.println(s));
		Stream<String>fs=courses.stream().flatMap(s ->s.stream());
		fs.forEach(s -> System.out.println(s));
	}

}
