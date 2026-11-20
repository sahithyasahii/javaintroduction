package com.javaintroduction;

public class Student {
	static int dept_no=1;
	static  String dept_name="Cse";
	int stud_id;
	String stud_name;
	public static void main(String[] args) {
		int a;
		//JVM will not provide default values to local variables
		//System.out.println(a);//The local variable a may not have been initialized
		Student stud=new Student();
		stud.stud_id=1;
		stud.stud_name="Pinky";
		
		
		//if we have same static data as local 
		//if we access directly,then local variables get highest priority to execute
		//still we want to access class level data then we can access
		//through class name.
		 int dept_no=2;
		//static -Illegal modifier for parameter dept_no; only final is permitted
		 //for local variables PUBLIC modifier is only applicable
		 //Local variables are stored in staxck Area
		String dept_name="Computer Science";
		System.out.println("Student department number :" + dept_no);
		System.out.println("Student department name :" + dept_name);
		
		System.out.println("Student department number :" + Student.dept_no);
		System.out.println("Student department name :" + Student.dept_name);
		System.out.println("student id is:" + stud.stud_id);
		System.out.println("student name is:" + stud.stud_name);
		Student stud4=null;
		System.out.println("Student department number :" + stud4.dept_no);//class level data but
		//gives an warning:static data  should be access in static way
		System.out.println("Student department name :" + stud4.dept_name);
		System.out.println("student id is:" + stud4.stud_id);//null pointer exception
		System.out.println("student name is:" + stud4.stud_name);

	}

}
