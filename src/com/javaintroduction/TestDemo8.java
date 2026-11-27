package com.javaintroduction;

public class TestDemo8 {
	
	String name;
	int roll_no;
	int batch;
	int mobile_no;
	String collegename;

	public static void main(String[] args) {
       System.out.println("main");
       
       method1();
      
	}

	static void method1()
           {
		
		TestDemo8 td=new TestDemo8();
		td.name="sahithya";
		td.roll_no=1;
		td.batch=81;
		td.mobile_no=12345;
		td.collegename="bvrit";
		
		TestDemo8 td1=new TestDemo8();
		
		td1.name="Harshitha";
		td1.roll_no=2;
		td1.batch=81;
		td1.mobile_no=6789;
		td1.collegename="kits";
		
		td.method2();
		td1.method2();
		 }
	void method2() {
		System.out.println(name);
		System.out.println(roll_no);
		System.out.println(batch);
		System.out.println(mobile_no);
		System.out.println(collegename);
	}
	}
