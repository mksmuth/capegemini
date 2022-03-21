package com.capgemini.Employeemanagement;

	

/*interface Code
{
	public void execute(int a,int b);
	
}*/
interface Hello
{
	public void print();
	
}
interface StringUpper 
{
	public String toUpper(String str);
	
}
public class MyLambda {
	public void main(String[] args)
	{
		//use to store the value in varibale 
		
		//able to store the code or method in variable 
		
		//with help of lambda it is possible 
		
		//we do not need the access modifier 
		//we also do not need the return type
		//remove the method name coz you can call be variable name 
		//add the lambda symbol
		//method cannot store in normal or primitive data type
		//create a interface 
		//create obj of interface which will hold the value for methiod
		//remove the input type also 
		//sum of two numbers 
		/*
		 * Code c=( a, b)->System.out.println(a+b); c.execute(30,30);
		 */
		
	    Hello hello=()->System.out.println("Hello World");
	     hello.print();
	}
	    
	    public void print() {
	    	System.out.println("hello World");
	    }
	    
	    //lambda to return the String in upper case 
	    //single input remove bracket and return keyword 
		/*
		 * StringUpper upper=str->str.toUpperCase(); String str=upper.toUpper("surya");
		 * System.out.println(str);
		 */
	//}
	    
/*
 * public String toUpper(String str) { return str.toUpperCase(); }
 */
	}

//lambda to take string returj first character 
//lambds to print even or odd number 
//lambda to check for ositive or negative number 
//cube root 
