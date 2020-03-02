package com.designprinciples;

public class Multiplication extends Subtraction {
	
	public static double mul(int t,double ar[])
	{
	     double  mul=1;
		for(int i=0;i<t;i++)
		{
			mul=mul*ar[i];
		}
		return mul;
	}
	

}
