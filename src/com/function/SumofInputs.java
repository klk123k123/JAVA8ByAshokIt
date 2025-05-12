package com.function;

import java.util.function.BiFunction;

public class SumofInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final double n=0;
BiFunction<Integer, Integer,Integer> sum=(a,b) -> a+b;
System.out.println("Sum of values : "+sum.apply(2, 19));

	}

}
