package com.learn.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapExampleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>list=Arrays.asList("Lakshmi","Hanvika","Lakshman");

list.stream().map(name ->name.toUpperCase() ).forEach(System.out::println);
list.stream().mapToInt(i->i.length()).forEach(System.out::println);
	}

}
