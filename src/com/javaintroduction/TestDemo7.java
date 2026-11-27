package com.javaintroduction;

public class TestDemo7 {
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
		static {
			hello();
			welcome();
			TestDemo7 td=new TestDemo7();
			td.helloo();
			td.welcomee();
		}
		
	public  void main(String[] args) {
		System.out.println("Main method");

	}

}