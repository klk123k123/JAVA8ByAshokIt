package com.stream.InterviewQuestions.abhishekvaramajavashorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMainJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee>list= Arrays.asList(new Employee(1,"LAkshmi"),
				new Employee(2,"HAnvika"),
				new Employee	(3,"Lakshman"));
		//Employee emp=new Employee();
		//sys
	
		//System.out.println(list1);
		List<Employee>list2=list.stream().sorted(Comparator.comparing(Employee :: getName)).collect(Collectors.toList());
		System.out.println(list2);
	}

}
