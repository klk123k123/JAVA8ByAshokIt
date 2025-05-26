package com.learn.Streams;

import java.util.Arrays;
import java.util.List;

public class MapTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("Anil","Raju","Akhil","Anusha","Ambhani");
list.stream().filter(name ->name.startsWith("A"))
.map(name -> name+" - "+name.length())
.forEach( name -> System.out.println(name));
	}

}
