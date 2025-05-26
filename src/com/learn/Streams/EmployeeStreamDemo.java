package com.learn.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Employee
{
	 String empName;
	int empAge;
	 double empSalary;
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public Employee(String empName, int empAge, double empSalary) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary + "]";
	}
	
	
	
}
public class EmployeeStreamDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<Employee> employee= Arrays.asList(new Employee("Lakshmi",20,55000),
			new Employee("Lakshman",30,60000),
			new Employee("Hanvika",10,150000),
			new Employee("Lenin",25,35000)
			);
	/*employee.stream().
	filter(emp -> emp.getEmpSalary()>50000).
	
	map(emp -> emp.empName+" - "+emp.empAge)
	.forEach(emp -> System.out.println("Second Highest Salary:"+emp));
	}*/
	//Second Highestsalary
	Optional<Employee> second=employee.stream()
			.sorted(Comparator.comparingDouble(Employee::getEmpSalary).reversed())
			.skip(1)
			.findFirst();
	
System.out.println("Highest Salary "+second.get());
}
}
