package com.function;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String, Integer>f=(name)->name.length();
		System.out.println("Leangth of the name "+f.apply("LAkshmi"));
	}

}
