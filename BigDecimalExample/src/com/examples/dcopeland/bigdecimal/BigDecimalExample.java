package com.examples.dcopeland.bigdecimal;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigDecimal bd = new BigDecimal("10");
		/**
		 * Needed this to get an understanding of compareTo in this example
		 * compareTo returns 0 then the values are equal
		 * if compareTo returns 1 the second value is less than the calling value
		 * if compareTo returns -1 the second value is greater than the calling value
		 */
		
		if(bd.compareTo(new BigDecimal("10")) == 0) {
			System.out.println("Compare To shows values are equal");
		}
		
		if(bd.compareTo(new BigDecimal("5")) == 1) {
			System.out.println("Compare to shows 5 is less than 10");
		}
		
		if(bd.compareTo(new BigDecimal("15")) == -1) {
			System.out.println("Compare to shows that 15 is greater than 10");
		}
		

		/**
		 * Second example using compareTo and storing its result in a int variable
		 * Using that variable to return the expected results
		 */
		BigDecimal bd1 = new BigDecimal("3");
		
		int holder = bd.compareTo(new BigDecimal("7"));
		
		if(holder == 0) {
			System.out.println("Values are equal");
		} else if(holder == -1) {
			System.out.println("Calling value is greater than second value");
		} else if(holder == 1) {
			System.out.println("Calling value is less than second value");
		}
		
		
		/**
		 * More Examples using BigDecimal
		 */
		//get the negated 
		BigDecimal dec = new BigDecimal("500");
		System.out.println(dec.signum()); //should return 1 it is positive
		System.out.println(dec + " negated is: " + dec.negate());
		System.out.println("calling negate() again gives us: " +dec.negate());
		System.out.println("BigDecimal.negate() returns a BigDecimal, it doesn't change the original: " +dec);
		
		//Negate negative number to get the positive of it
		BigDecimal dec1 = new BigDecimal("-120");
		System.out.println("BigDecimal number is: " +dec1);
		System.out.println(dec1.signum()); //should return -1 it is negative
		System.out.println("Calling BigDecimal.negate() will return a BigDecimal containing +this: " +dec1.negate());
		System.out.println(dec1.signum()); //still -1 remember the value did not change for dec1 t
	}

}
