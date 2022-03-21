package com.capgemini.Employeemanagement;

interface A{
	public void print(int num);
	
}
public class lambdapositive {
	public static  void main (String[] args) {
	
		A a=(num)->{
		if(num>0)
		{
		System.out.println("The number is positive");
		}
		else 
		{
			System.out.println("the number is negative");
		}
		};
		a.print(-5);
	}

		
		
		
	}

