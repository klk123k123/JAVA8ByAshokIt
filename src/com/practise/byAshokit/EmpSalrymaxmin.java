package com.practise.byAshokit;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class EmployeeDetails
{
	String ename;
	double esalary;
	int eage;
	public EmployeeDetails(String ename, double esalary, int eage) {
		super();
		this.ename = ename;
		this.esalary = esalary;
		this.eage = eage;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", esalary=" + esalary + ", eage=" + eage + "]";
	}
	
}
public class EmpSalrymaxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

List<EmployeeDetails> employee = Arrays.asList(
new EmployeeDetails("Hanvika", 50000, 23),
new EmployeeDetails("Lakshman", 60000, 32),
 new EmployeeDetails("Lakshmi", 40000, 28));

Optional<EmployeeDetails> findMax = employee.stream()
.collect(Collectors.maxBy(Comparator.comparing(emp -> emp.esalary)));


Optional<EmployeeDetails> findMax1 = employee.stream()
 .max(Comparator.comparingDouble(emp -> emp.esalary));

Optional<EmployeeDetails> findMin=employee.stream().
min(Comparator.comparingDouble(emp -> emp.esalary));


Double findAvg=employee.stream().collect(Collectors.averagingDouble(emp -> emp.esalary))
;
System.out.println("Avg salary : "+findAvg);
findMax.ifPresent(System.out::println);
findMax1.ifPresent(System.out::println);
findMin.ifPresent(System.out::println);
System.out.println(findMax.get().ename);
	}
}




