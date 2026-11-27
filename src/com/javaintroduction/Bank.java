package com.javaintroduction;

public class Bank {
     int acc_no;
	String holder_name;
	Long mobile_no;
	String ifsc_code;
	double balance;
	
	static int count =2873634;
	public static void main(String[] args) {
		System.out.println("Main");
        method();
	}

 static void method() {
		Bank b1 = new Bank();
		b1.holder_name = "Saahi";
		b1.mobile_no = 12345L;
		b1.ifsc_code = "SBI7800";
		b1.balance = 5000.0;
		   b1.acc_no=count++;

		Bank b2 = new Bank();
		 //acc_no=acc_no++;
		b2.holder_name = "Harshi";
		b2.mobile_no = 4376487L;
		b2.ifsc_code = "SBI7900";
		b2.balance = 7000.0;
		 b2.acc_no=count++;
	

		b1.methodinsta();
		b2.methodinsta();
		
	}

	void methodinsta() {
		System.out.println(acc_no);
		System.out.println(holder_name);
		System.out.println(mobile_no);
		System.out.println(ifsc_code);
		System.out.println(balance);

	}
}
