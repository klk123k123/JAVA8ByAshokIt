package com.learn.DateandtimeapiChanges;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d);
		//Date to String
		SimpleDateFormat smp=new SimpleDateFormat("DD/MM/YYYY");
		String dateString=smp.format(d);
		System.out.println(dateString);
		//here mm moth is dec mmm full december yyyy also 2024 yy is 24
		SimpleDateFormat smp1=new SimpleDateFormat("MM-DD-YY");
		Date date=smp1.parse("25-06-25");
		System.out.println("STring To Date"+date);
		

	}

}
