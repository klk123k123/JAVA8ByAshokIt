package com.learn.interfac;

interface Car

{
	abstract String message();
	public default String carNumber() //after java 8
	{
		return "1BGHN67898";
	}
	static String isValid()  //after java 8
	{
		return "Yes It is Valid";
	}
}
class Bike implements Car
{

	@Override
	public String message() {
		// TODO Auto-generated method stub
		return "Car Havind Engine";
	}
	
	public String display()
	{
		return "Bike Having Engine";
	}
	
}
public class InterfaceNewFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike bike=new Bike();
		Car car=new Bike();
		System.out.println(bike.display());
		System.out.println(bike.message());
		System.out.println(car.message());
		System.out.println(bike.carNumber());//here we can override
		//System.out.println(bike.isValid());//we cant override
		System.out.println(Car.isValid());//we can access direct  through class

	}

}
