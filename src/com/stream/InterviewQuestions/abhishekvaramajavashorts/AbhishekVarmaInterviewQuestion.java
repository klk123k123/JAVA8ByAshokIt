package com.stream.InterviewQuestions.abhishekvaramajavashorts;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Operation
{
	//int increment(int num);
	
	//boolean canVote(int num);
	double generate();
}
public class AbhishekVarmaInterviewQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Operation op=(num)->++num;
		/*Operation op=(age) ->age>=18;
		boolean result=op.canVote(20);
		Function<Integer,Boolean>op2=(age)->age>=18;*/
		
		/*boolean result1=op2.apply(10);
		System.out.println(result1);
				System.out.println(result);*/
		//System.out.println(op.increment(10));
		//predicate
				Predicate<Integer>op3=(age)->age>=18;
				
				boolean result2=op3.test(10);
				System.out.println(result2);
				
				//without arguments
				Operation value=()-> Math.random();	
				System.out.println(value.generate());
				Supplier<Double> val=()->Math.random();
				System.out.println(val.get());
	}
	

}
