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
		
		

	}

}
