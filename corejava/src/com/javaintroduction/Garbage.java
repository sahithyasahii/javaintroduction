package com.javaintroduction;

public class Garbage {
	void hello() {
		System.out.println("Ananymous");
		System.out.println("Ananymous");
		Garbage gc=new Garbage();//out of scope
		//System.out.println("Anonymous");
		//System.out.println("Anonymous");
		
	}
	@Override
	protected void finalize()
            throws Throwable{
		System.out.println("Finalize method ");
		//System.out.println("Finalize method 2");
	}
	

	public static void main(String[] args) {
	System.out.println("Main method ");
	Garbage g1=new Garbage();
	Garbage g2=new Garbage();
	Garbage g3=new Garbage();
	//nullifying the object
	g1=null;
	//System.gc();
	
	//re-assigning the object
	g3=g2;
	//Anonymous object
	new Garbage().hello();
	
	System.out.println(g1);
	System.out.println(g2);
	System.out.println(g3);
	System.gc();
	}

}
