package com.javaintroduction;

public class Welcome {
	
	public static void main(String[] args) throws ClassNotFoundException{
				System.out.println("Welcome to TestDemo1 started ");
				// Bootstrap class loader loaded below two classes from Java Home
				System.out.println(Class.forName("java.lang.String"));
				System.out.println(Class.forName("java.lang.System"));
				// Application class loader loaded below two classes from Class
				// path
				System.out.println(Class.forName("com.javaintroduction.Hello"));
				System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
	}

}
