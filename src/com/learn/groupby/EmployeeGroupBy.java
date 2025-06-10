package com.learn.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


class EmployeeDetails
{
	String ename;
	double esalary;
	int eage;
	String ecountry;
	
	public EmployeeDetails(String ename, double esalary, int eage, String ecountry) {
		super();
		this.ename = ename;
		this.esalary = esalary;
		this.eage = eage;
		this.ecountry = ecountry;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [ename=" + ename + ", esalary=" + esalary + ", eage=" + eage + ", ecountry=" + ecountry
				+ "]";
	}
	
	
}
public class EmployeeGroupBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<EmployeeDetails> employee = Arrays.asList(
				new EmployeeDetails("Hanvika", 50000, 23,"USA"),
				new EmployeeDetails("Lakshman", 60000, 32,"USA"),
				 new EmployeeDetails("Lakshmi", 40000, 28,"INDIA"),
				 new EmployeeDetails("Haswin", 40000, 28,"INDIA") );
Map<Object, List<EmployeeDetails>>data=employee.stream().
collect(Collectors.groupingBy(emp -> emp.ecountry));
		System.out.println(data);
	}

}
