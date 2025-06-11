package com.stream.InterviewQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeSalaryQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		List<Employee>list=new ArrayList<Employee>(); 
		list.add(new Employee(1,"Lakshmi",23,"Female","JAVADEVELOER",2021,50000));
		list.add(new Employee(2,"Lakshman",31,"male","HR",2017,70000));
		list.add(new Employee(3,"Lenin",33,"male","PipingDesigner",2022,90000));
		list.add(new Employee(4,"Hanvika",3,"Female","MYANgel",2023,100000));
		list.add(new Employee(5,"Sweety",43,"Female","HR",2021,450000));
		list.add(new Employee(6,"Sreevalli",23,"Female","HR",2020,50000));
		list.add(new Employee(7,"Sanvi",33,"Female","JAVADEVELOER",2021,950000));
		list.add(new Employee(8,"HAnvik",2,"male","IASFinancial",2021,150000));
		list.add(new Employee(9,"haswith",15,"male","PythonDeveloper",2007,50000));
		list.add(new Employee(10,"kali",18,"Female","Salceforce",2009,1950000));
		
		//highest salary employee name
		Optional<Employee> name=list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee :: getSalary)));
		System.out.println("Highest Salary of EMployeename : "+name.get());
		//second highest salary
		/*
		 * Optional<Employee> name1=list.stream().
		 * findFirst().collect(Collectors.maxBy(Comparator.comparing(Employee ::
		 * getAge)))
		 */	;
		 //sort the reverese order skip 1st order
		 Optional<Employee> name21=list.stream().sorted(Comparator.comparing(Employee :: getSalary).reversed()).skip(1).findFirst();
				 System.out.println("Second highest salary for first method : "+name21);
		//second way
				 List<Employee> employee=list.stream().sorted(Comparator.comparing(Employee :: getSalary).reversed()).collect(Collectors.toList());
		System.out.println("Second Highest Salary :"+employee.get(1));
		System.out.println("third Highest Salary :"+employee.get(2));
	}

}
