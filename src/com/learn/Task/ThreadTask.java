package com.learn.Task;

import java.util.function.Function;

public class ThreadTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r=()->{
				// TODO Auto-generated method stub
				for(int i=1;i<=5;i++)
				{
					System.out.println(i);
				}};
			
		
		Thread t=new Thread();
		t.start();
		t.run();
	}

}
