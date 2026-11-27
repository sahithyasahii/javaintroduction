package com.langfundamentals;

public class Billing {

	byte itemCount=10;
	double itemPrice=200;
     int discount=12;
	 double exactDiscount=discount;
	double subtotal=500;
	  double finalBill=(subtotal - (subtotal * exactDiscount / 100));
	  int roundedBill=(int)finalBill;
	  int grade='A';
	public static void main(String[] args) {
		Billing  b1=new Billing();
		System.out.println(b1.itemCount);
		System.out.println("exactDiscount is:"+b1.exactDiscount);
		System.out.println("finalBill is :"+b1.finalBill);
		System.out.println("roundedBill:"+ b1.roundedBill);
		System.out.println("grade:"+b1.grade);
		/* 1. Widening Casting: Store discount (int) into a double variable exactDiscount.

		 2. Calculate finalBill after applying the discount.

		 3. Narrowing Casting: Convert finalBill (double) in (subtotal - (subtotal * exactDiscount / 100))
		 //to an int variable roundedBill.
		 int roundedBill=finalBill;

		 4. Convert grade (char) into its ASCII int value gradeCode.
	          int grade='A';

		 5. Print finalBill, roundedBill, and gradeCode
		 */
	}

}
