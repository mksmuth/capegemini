package com.capgemini.Employeemanagement;

interface C{
	public void print(int num);
}

public class Lambdaoe {
	public static void main(String[] args){
	C evenodd=(num)->{
		if(num%2==0)
		{
			System.out.println("the number is even");
		}
		else
		{
			System.out.println("the number is odd");
		}
	    };
	    evenodd.print(7);
	}
}
