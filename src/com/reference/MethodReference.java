package com.reference;

import java.util.function.Supplier;

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Doctor d=new Doctor();//before java 8 creating object
	Supplier<Doctor>s=	Doctor::new;
	s.get();
	System.out.println(s.hashCode());

	}

}
class Doctor
{
	public Doctor()
	{
		System.out.println("Doctor Constructor----------");
	}
}