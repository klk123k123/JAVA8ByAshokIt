package com.stream.InterviewQuestions.abhishekvaramajavashorts;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

interface Operation1
{
	int add(int a,int b);
}
public class biFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operation1 op=(a,b)-> a+b;
		System.out.println(op.add(10, 20));
		//bifunction
		BiFunction<Integer, Integer, Integer>value=(a,b)->a=b;
		System.out.println(value.apply(10, 25));
		//BiPredicate
		BiPredicate<Integer, Integer>pre=(num,den)->num%den==0;
		System.out.println(pre.test(20, 5));
		System.out.println(pre.test(13, 5));
		//BiConsumer accep the value
		BiConsumer<String, String>con=(name,lunage)->System.out.println(name +" from "+lunage);
		con.accept("laskhmi", "Odisha");
		
		System.out.println(true?null:"Yes");
		
	}

}
