package com.javaintroduction;

public class TestDemo6 {

	 static void hello(){
			
			System.out.println("Static method 1");
			welcome();
		}
		
		static void welcome()
		{
			System.out.println("Static method 2");
			TestDemo6 td=new TestDemo6();
			td.helloo();
		}
		void helloo()
		{
			System.out.println("Instance method 1");
			welcomee();
		}
		void welcomee()
		{
			System.out.println("Instance method 2");
		}
	public static void main(String[] args) {
		hello();
		System.out.println("Main method");
		//hello();
	
		

	}

}
