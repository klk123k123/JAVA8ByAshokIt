package com.learn.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SplitIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=Arrays.asList("Lakshmi","Hanvika","Lakshman");
Spliterator<String> slist= list.stream().spliterator();
slist.forEachRemaining(n -> System.out.println(n));
	}

}
