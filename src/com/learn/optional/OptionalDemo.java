package com.learn.optional;

import java.util.Optional;
import java.util.Scanner;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your User Id : ");
int userId=sc.nextInt();
UserService user=new UserService();
/*
 * String name=user.getUserByID(userId).toUpperCase()+"\n Thank You ";
 * System.out.println("Response is : "+name);
 */
//here will get null pointer exception aftergiving some different value so we can use optional class

Optional<String>userName=user.getUserByName(userId);
if(userName.isPresent())
{
	String name=userName.get();
	System.out.println("Response is : "+ (name.toUpperCase()+" \n Thank You") );
}
else
{
	System.out.println("InValid Id \n Thank You");
}

System.out.println("Please Enter Name : ");
//String value = sc.nextLine();
String value="Lakshmi";
Optional<String> name = Optional.ofNullable(value);

if (name.isPresent() && !name.get().isEmpty()) {
	System.out.println("Name Length: " + name.get().length());

} else {
	System.out.println("Entered No Value");

}
	}
}
