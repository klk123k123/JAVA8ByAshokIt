package com.learn.DateandtimeapiChanges;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DATEAPICHNAGES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d);
		LocalDate local= LocalDate.now();
		System.out.println(local);
		LocalTime localt=LocalTime.now();
		System.out.println(localt);
		LocalDateTime localdt=LocalDateTime.now();
		System.out.println(localdt);
		local.plusDays(3);
		local.plusMonths(3);
		local.plusYears(3);
		System.out.println(local);
	boolean value=local.parse("2020-03-20").isLeapYear();
System.out.println(value);


enum Mood {
HAPPY("happy"), SAD("sad");
private final String description;

 Mood(String description) {
this.description = description;
 System.out.println("Hello"+description);
}
}
	}

}
