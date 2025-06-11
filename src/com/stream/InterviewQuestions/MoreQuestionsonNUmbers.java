package com.stream.InterviewQuestions;

import java.util.Arrays;

public class MoreQuestionsonNUmbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a=10,b=10; int c=0; c=a+b; System.out.println("Sum of numbers : "+c);
		 */
int[] nums= {1,2,3,4,5};
int reduceValue=Arrays.stream(nums).reduce(0, (a,b) -> a+b);
System.out.println("Sum of all number : "+reduceValue);
		
	}

}
