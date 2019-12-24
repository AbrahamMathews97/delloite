package oops;
import java.lang.*;

public class Calculator {

	public void add(int num,int num2)
  	{
	 System.out.println(num+num2); 
  	}
	
	public void add(double num,double num2)
	{
		System.out.println(num+num2);
	}
	
	public void add(double num,int num2)
	{
		System.out.println(num+num2);
	}
	
	public void add(int num,double num2)
	{
		System.out.println(num+num2);
	}
	
	public void diff(int num,int num2)
	{
		System.out.println(num-num2);
	}
	
	public void diff(double num,double num2)
	{
		System.out.println(num-num2);
	}
	
	public void diff(int num,double num2)
	{
		System.out.println(num-num2);
	}
	
	public void diff(double num,int num2)
	{
		System.out.println(num-num2);
	}
	
	public void mul(int num,int num2)
	{
		System.out.println(num*num2);
	}
	
	public void mul(double num,double num2)
	{
		System.out.println(num*num2);
	}
	
	public void mul(double num,int num2)
	{
		System.out.println(num*num2);
	}
	
	public void mul(int num,double num2)
	{
		System.out.println(num*num2);
	}
	
	public void div(int num,int num2)
	{	if(num2!=0)
			System.out.println(num/num2);
		else
			System.out.println("Not divisible by zero");
	}
	
	public void div(double num,double num2)
	{	if(num2!=0.0)
			System.out.println(num/num2);
		else
			System.out.println("Not divisible by zero");
	}
	
	public void div(int num,double num2)
	{	if(num2!=0.0)
			System.out.println(num/num2);
		else
			System.out.println("Not divisible by zero");
	}
	
	public void div(double num,int num2)
	{	if(num2!=0)
			System.out.println(num/num2);
		else
			System.out.println("Not divisible by zero");
	}
	
   public static void main(String[] args)
   {   //Addition
	   Calculator calculator=new Calculator();
	   System.out.println("Addition:");
	   calculator.add(2,3);
	   calculator.add(2.0,3.0);
	   calculator.add(5,6.0);
	   calculator.add(6.0,7);
	   System.out.println("----------------------------------");
	   //Subtraction
	   System.out.println("Subtraction:");
	   calculator.diff(2,3);
	   calculator.diff(2.0,3.0);
	   calculator.diff(5,6.0);
	   calculator.diff(6.0,7);
	   System.out.println("----------------------------------");
	   //Multiplication
	   System.out.println("Multiplication:");
	   calculator.mul(2,3);
	   calculator.mul(2.0,3.0);
	   calculator.mul(5,6.0);
	   calculator.mul(6.0,7);
	   System.out.println("----------------------------------");
	   //Division
	   System.out.println("Division:");
	   calculator.div(2,3);
	   calculator.div(2.0,3.0);
	   calculator.div(5,6.0);
	   calculator.div(6.0,6);
	   System.out.println("----------------------------------");
   }
} 
