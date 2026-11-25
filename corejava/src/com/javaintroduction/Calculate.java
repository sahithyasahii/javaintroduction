package com.javaintroduction;

public class Calculate {
	static int a = 10;
	static int b = 20;


	public static void main(String[] args) {
		int sum = methodcal(a, b);
		int difference = methodcal1(a, b);
		int mul = methodcal2(a, b);
		int division = methodcal3(a, b);
		int modulus = methodcal4(a, b);
		 System.out.println("Sum is :" +sum);
		 System.out.println("Difference is :" + difference);
		 System.out.println("Multiplication is :" +mul);
		 System.out.println("Division is :" +division);
		 System.out.println("Modulus is :" +modulus);
	}

	static int methodcal(int a, int b) {
		int sum = a + b;
		return sum;
	}
	static int methodcal1(int a, int b) {
		int difference = a - b;
		return difference ;
	}
	static int methodcal2(int a, int b) {
		int mul= a * b;
		return mul ;
	}
	
	static int methodcal3(int a, int b) {
		int division= a / b;
		return division;
	}
	
	static int methodcal4(int a, int b) {
		int modulus= a % b;
		return modulus;
	}
}
