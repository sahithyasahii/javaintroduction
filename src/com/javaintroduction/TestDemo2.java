package com.javaintroduction;
//program to print student data
public class TestDemo2 {
	//static members declartion and initilization
	static int dept_no;
	static String dept_name;
	//instance or non static members declartion and initilization
	int stud_id;
	String stud_name;
	public static void main(String[] args) {
		//static members representation
		dept_no=2;
		dept_name="Cse";
		System.out.println("Student department number :" + TestDemo2.dept_no);
		System.out.println("Student department name :" + TestDemo2.dept_name);	
		//object creation
		//lhs:TestDemo2 is object ,std is object refrence variable
		//Rhs:new is a keyword which is used to create object,
		//TestDemo2 us constructor calling it is same as classname 
		TestDemo2 std=new TestDemo2();
		std.stud_id=1;
		std.stud_name="Sahi";
		//instance members representation
		System.out.println("student id is:" + std.stud_id);//not initialized so
		//default values =0-->1
		System.out.println("student name is:" + std.stud_name);	//null-->sahi
		
		System.out.println("Object**************** 2************");
		TestDemo2 stud=new TestDemo2();
		//Re-assigning data
		//static data can change -Re-assigning the data and not static is not final
		dept_no=3;
		dept_name="Computer Science";
		stud.stud_id=2;
		stud.stud_name="Priya";
		System.out.println("Student department number :" + TestDemo2.dept_no);
		System.out.println("Student department name :" + TestDemo2.dept_name);
		System.out.println("student id is:" + stud.stud_id);
		System.out.println("student name is:" + stud.stud_name);
		System.out.println("Object**************** 3************");
		TestDemo2 stud3=new TestDemo2();
		stud3.stud_id=3;
		stud3.stud_name="viha";
		System.out.println("Student department number :" + TestDemo2.dept_no);
		System.out.println("Student department name :" + TestDemo2.dept_name);
		System.out.println("student id is:" + stud3.stud_id);
		System.out.println("student name is:" + stud3.stud_name);
		
		System.out.println("Object**************** 4************");
		TestDemo2 stud4=new TestDemo2();
		stud4.stud_id=4;
		stud4.stud_name="nari";
		System.out.println("Student department number :" + TestDemo2.dept_no);
		System.out.println("Student department name :" + TestDemo2.dept_name);
		System.out.println("student id is:" + stud4.stud_id);
		System.out.println("student name is:" + stud4.stud_name);
		
	}

}
