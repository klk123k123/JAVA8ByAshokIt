package com.learn.Streams;

import java.util.stream.Stream;

public class serialandparellel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Serial Stream ===========");
		Stream<Integer> ss=Stream.of(1,2,3,4,5);
		//ss.forEach(n -> System.out.println(n));
		ss.forEach(n -> System.out.println(n+ " :: "+Thread.currentThread()));
		
		System.out.println("parellel Stream ===========");
		Stream<Integer> ps=Stream.of(1,2,3,4,5);
		//ps.forEach(n -> System.out.println(n));
		ps.parallel().forEach(n -> System.out.println(n+ " :: "+Thread.currentThread()));
		
	}

}
