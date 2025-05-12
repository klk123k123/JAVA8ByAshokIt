package com.learn.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SorttheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=Arrays.asList(12,2,34,1,35,56);
		List<Integer>sortedList=new ArrayList<Integer>();
		System.out.println("Before Sort : "+list);
		Collections.sort(list, new NumberFormat());
		//System.out.println("Aftter desc sorting : "+list);
		//with lambda
		//Collections.sort(list,(i,j)->i.compareTo(j));//here only ascending order want to descending order use terinary operator
		Collections.sort(list,(i,j)-> (i<j) ? 1:-1);
		System.out.println("Aftter desc sorting : "+list);

	}

}
class NumberFormat implements Comparator<Integer>
{
	@Override
	public int compare(Integer i, Integer j) {
		// TODO Auto-generated method stub
		if(i>j)
			return -1;
		else if(i<j)
			return 1;
		return 0;
	}
}