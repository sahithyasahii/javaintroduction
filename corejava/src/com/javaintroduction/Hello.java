package com.javaintroduction;

public class Hello {
	// Hello h=new Hello();  - execution starts fromm static -> main
	//we haven't created any object 
	//so instance block will not execute
	 static Hello h=new Hello();
	 //static block gets first priority if we 
	 //create static variable
	static {
		System.out.println("hello 1");
	}
	
	
	static {
		
		System.out.println("hello 2");
		
	}
	{
		System.out.println("hello 3");
		//Hello h=new Hello();//Stack overflow error
		//because  we created static object then
		//static block will be executed then again created object it calls 
		//again that block recursively
	}
	{
		System.out.println("hello 4");	
	}
	public static void main(String[] args){
		System.out.println("Main mehtod");
	//Hello h=new Hello();

	} 

}
