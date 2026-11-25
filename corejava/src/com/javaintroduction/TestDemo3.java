package com.javaintroduction;

public class TestDemo3 {
	
	public static void main(String[] args) {
		//Main method is called byu JVM,but all other methods 
		//must call explicitly on the requirement.
		System.out.println("Main method started");
		hello();
		//welcome(); can't call instance method in static method doirectly 
		//we need to create object r v.
		
		TestDemo3 td=new TestDemo3();
		td.welcome();
		
		System.out.println("Main method ended");
	}
	//static method
	public static void hello() {
	
		System.out.println("Hello method called 1");
	}
	//instance method
	void welcome() {
		System.out.println("Welocome method called 1");
		//In instance we can call INSTANCE method directly
		welcome1();
		//In instance we can call static method directly
		hello3();
	}
	
	//static method
		public static void hello3() {
		
			System.out.println("static method called 2");
			//In static we can call static directly
			hello4();
			//In static we can't call instance directly
			//we need to create object 
			TestDemo3 td2=new TestDemo3();
			td2.welcome2();
		}
		
		public static void hello4() {
			
			System.out.println("static method called 3");
			
		}
		void welcome2() {
			System.out.println("Welocome method called 3");
		}

	void welcome1() {
		System.out.println("Welocome method called 2");
	}
	static{
		System.out.println("static block 1");
	}
	static{
		System.out.println("static block 2");
	}
}