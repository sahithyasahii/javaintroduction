package com.javaintroduction;

public class Count {
static int x=0;//static variable can be accessed directly ,class name ,ORV
//instance variable can be accessed using object refrence variable
//static variables shared among all objects.
{
	x++;//instance block executes and increments whenever the object is created
}

	 public static void main(String[] args) {
		Count c=new Count();
		Count d=new Count();
		Count e=new Count();
		
		System.out.println("count is :"+ Count.x);
	}

}
