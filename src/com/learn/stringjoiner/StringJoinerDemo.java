package com.learn.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj1=new StringJoiner("-");
		sj1.add("Lakshmi");
		sj1.add("is a ");
		sj1.add("JavaDeveloper");
		System.out.println(sj1);
		StringJoiner sj2=new StringJoiner("-","$","*");//here using delimeter ,prefix and suffix
		sj2.add("Hanvika");
		sj2.add("Cuitiee");
		sj2.add("pieee");
		System.out.println(sj2);
		

	}

}
