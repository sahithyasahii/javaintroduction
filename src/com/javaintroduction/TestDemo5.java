package com.javaintroduction;

public class TestDemo5 {
	 static void hello(){
	
		System.out.println("Static method 1");
	}
	
	static void welcome()
	{
		System.out.println("Static method 2");
	}
	void helloo()
	{
		System.out.println("Instance method 1");
	}
	void welcomee()
	{
		System.out.println("Instance method 2");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method 1");
		hello();
		welcome();
		TestDemo5 td=new TestDemo5();
		td.helloo();
		td.welcomee();
	}

}
