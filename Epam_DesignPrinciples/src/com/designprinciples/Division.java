package com.designprinciples;

public class Division extends Multiplication  {

	public static void div(int num1,int num2)
	{
		float ans;
		try {
			ans=num1/num2;
			System.out.println("divison is "+ans);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Zero cant be divided with a number");
		}
	}

}
