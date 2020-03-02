package com.designprinciples;

public class Addition {

	public static double add(int t,double ar[])
	{
		double sum=0;
		for(int i=0;i<t;i++)
		{
			sum=sum+ar[i];
		}
		return sum;
	}
}
