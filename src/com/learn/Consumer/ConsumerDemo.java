package com.learn.Consumer;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
 printUpperCase.accept("hello world");
Consumer<String> printOriginal = str -> System.out.println("Original: " + str);
Consumer<String> printLength = str -> System.out.println("Length: " + str.length());
Consumer<String> combined = printOriginal.andThen(printLength);
combined.accept("Java Consumer");

	}

}
