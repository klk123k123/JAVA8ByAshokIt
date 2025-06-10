package com.stream.InterviewQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Employee
{
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	
	
}
public class EmployeeDetailsQA {

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
	list.add(new Employee(9,"haswith",15,"male","PythonDeveloper",2007,950000));
	list.add(new Employee(10,"kali",18,"Female","Salceforce",2009,950000));
	
	//howmany female and males are there
	//Map<String, Long> emp=list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
	//System.out.println(emp);
	//print all the department names
	list.stream().map(name ->name.department)
	.distinct()
	.forEach(name -> System.out.println(name));
	//what is avg of age of female and male
	Double findAvg=list.stream().collect(Collectors.averagingInt(emp -> emp.age));
	System.out.println("Find Average : "+findAvg);
	//other way
	Map<String, Double>emp=list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge )));
	System.out.println("Avergage Second Method : "+emp);
	
	//Highest PAid Employee
	Optional<Employee> findHighestPaid=list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(emp1 -> emp1.getSalary())));
	System.out.println("Highest paid : "+findHighestPaid.get());
	//find the all employees names who have joined after 2015
list.stream().filter(doj ->( doj.yearOfJoining>2015)).map(Employee :: getName ).forEach(name -> System.out.println(name));
	//count the e,mployee each department
Map<String,Long>count=list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
	System.out.println(count);
	//avg salary eaxh department
	Map<String, Double>avgSalary=list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
	System.out.println(avgSalary);
	
	//get the youngest male detales in the hr department
	Optional<Employee>youngest=list.stream().filter(name ->name.getGender().equals("male")&& name.department.equals("HR")).collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge)));
	if(youngest.isPresent())
		System.out.println("Youngest male in department : "+youngest.get());
	//most highest work experience
	Optional<Employee>HighestExp=list.stream().collect(Collectors.minBy(Comparator.comparingInt(Employee :: getYearOfJoining)))	;
	HighestExp.ifPresent(System.out::println);
	
	//how many males and females in hr department
	Map<String, Long> values=list.stream().filter(name -> name.department.equals("HR")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
	System.out.println("MAle and Femails Details in HR department: "+values);
	//avg salary of male and femailes
	Map<String, Double> salaries=list.stream().collect(Collectors.groupingBy(Employee :: getGender, Collectors.averagingDouble(Employee :: getSalary)));
	System.out.println("Salries : "+salaries);
	//list of all employees each department
	Map<String,List<String>> names=list.stream().collect(Collectors.groupingBy(Employee :: getDepartment,Collectors.mapping(Employee :: getName, Collectors.toList())));
	System.out.println("List is : "+names);
	//second way
	Map<String,List<String>> names1=list.stream().collect(Collectors.groupingBy(Employee :: getName,Collectors.mapping(Employee :: getDepartment, Collectors.toList())));

	System.out.println("List is : "+names1);
	//avg salary and total salary
	Double avgsalry=list.stream().collect(Collectors.averagingDouble(Employee :: getSalary));
	System.out.println("Avg Salary : "+avgsalry);
	Double totalSalary=list.stream().collect(Collectors.summingDouble(Employee :: getSalary));
	System.out.println("Total salary : "+totalSalary);
//in one line 
DoubleSummaryStatistics stats = list.stream()
.collect(Collectors.summarizingDouble(Employee::getSalary));

System.out.println("Avg Salary : " + stats.getAverage());
System.out.println("Total Salary : " + stats.getSum());
//seperate employee who are younger or equal to 25years from those employees who are older than 25 years
list.stream().filter(name -> name.age <=25 ).map(Employee :: getName).forEach(name -> System.out.println(name));
//other way

Map<Boolean, List<Employee>> partitioned = list.stream()
 .collect(Collectors.partitioningBy(e -> e.getAge() <= 25));

List<Employee> youngerOrEqual25 = partitioned.get(true);
List<Employee> olderThan25 = partitioned.get(false);
System.out.println("Youngest : "+youngerOrEqual25);
System.out.println("Oldest : "+olderThan25);
//only names 

Map<Boolean, List<String>> namesByAgeGroup = list.stream()
.collect(Collectors.partitioningBy(
 e -> e.getAge() <= 25,
Collectors.mapping(Employee::getName, Collectors.toList())
));

List<String> youngerOrEqual251 = namesByAgeGroup.get(true);
List<String> olderThan251 = namesByAgeGroup.get(false);
System.out.println("Youngest : "+youngerOrEqual251);
System.out.println("Oldest : "+olderThan251);

	}
}
