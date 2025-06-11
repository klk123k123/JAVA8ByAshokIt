package com.stream.InterviewQuestions.abhishekvaramajavashorts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class StreamOperations {
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
List<Employee>list=new ArrayList();
list.add(new Employee(1, "Lakshman"));
list.add(new Employee(2, "Hanvika"));
list.add(new Employee(3, "Lakshmi"));
list.add(new Employee(4, "Lenin"));
list.add(new Employee(5, "Chinnu"));

//limit and skip
List<Employee>limitv=list.stream().limit(2).toList();
System.out.println(limitv);
List<Employee>skipv=list.stream().skip(1).collect(Collectors.toList());
System.out.println(skipv);
//sorted by names
Spliterator<Employee>listemploye=list.stream().sorted(Comparator.comparing(Employee :: getName)).spliterator();
System.out.println(listemploye);
listemploye.forEachRemaining(name -> System.out.println(name+"  \n  ==="));
//reverseorder
list.stream().sorted(Comparator.reverseOrder()).
forEach(System.out::println);

list.stream()
 .sorted(Comparator.comparing(Employee::getName).reversed())
 .dropWhile(employee -> employee.getName().startsWith("L"))
.forEach(System.out::println);

	}

}
