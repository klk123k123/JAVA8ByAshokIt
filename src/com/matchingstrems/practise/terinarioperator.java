package com.matchingstrems.practise;

import java.util.Arrays;
import java.util.List;

class Person
{
	String name;
	String country;
	public Person(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}
	
	
	
}
public class terinarioperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person>person=Arrays.asList(
				new Person("Lakshmi","INDIA"),
				new Person("Lakshman","MEXICO"),
				new Person("Hanvika","US"),
				new Person("Haswin","America"));
		//if match anyone record
		
		boolean status=person.stream().anyMatch(p -> p.country.equals("INDIA"));
		System.out.println("Any India is there ::  "+status);
		//all match need to match every record
		boolean status1=person.stream().allMatch(p -> p.country.equals("US"));
		System.out.println("All are from US ::  "+status1);
		//nonmatch no one match field
		boolean status2=person.stream().noneMatch(p -> p.country.equals("JAPAN"));
		System.out.println("No One From JAPAN RIGHT ? ::  "+status2);
		
		
		

	}

}
