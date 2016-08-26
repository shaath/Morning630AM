package com.orgHRM.Master;

public class basicFunctions 
{
	public static void main(String[] args)
	{
		function1();
		String res=function2();
		System.out.println(res);
		basicFunctions fun=new basicFunctions();
		fun.function3();
		
		res=fun.function4();
		System.out.println(res);
		
	}
	
	
	//static function without returning a value
	public static void function1()
	{
		System.out.println("This is static function without returning a value");
	}
	
	//static Function With returning value
	
	public static String function2()
	{
		System.out.println("This is static Function With returning value");
		return "Pass";
	}
	
	//non static Function without returning value
	
	public void function3()
	{
		System.out.println("This is non static Function without returning value");
	}
	
	//non static function with returning value
	
	public String function4()
	{
		System.out.println("This is non static function with returning value");
		return "Fail";
	}

}
