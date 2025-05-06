package com.practise;

public class Lambdafunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.function.Function<String, Integer> getLength = (String name) -> { return name.length(); };
		System.out.println(getLength.apply("Lakshmi"));
	}

}
