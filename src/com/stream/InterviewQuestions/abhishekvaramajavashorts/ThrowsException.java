package com.stream.InterviewQuestions.abhishekvaramajavashorts;

import java.io.IOException;

interface Operation2
{
	double division(int num,int den)
	throws IOException;
}
public class ThrowsException {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Operation2 op=(num,den)->
{
	if(den==0)
		throw new IOException("devided by zero");
	return num/den;
	
};
System.out.println(op.division(20, 0));
	}

}
