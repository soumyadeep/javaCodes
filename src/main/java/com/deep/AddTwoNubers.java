package com.deep;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddTwoNubers {
	static int number1=0,number2=0,result=0;
	private static final Logger LOGGER = Logger.getLogger(AddTwoNubers.class.getName()); 

	public static void main(String[] args) {
		LOGGER.setLevel(Level.INFO);
		System.out.println("Enter the number1 and number2");
		Scanner scan = new Scanner(System.in);
		LOGGER.info(scan.toString());
		number1 = scan.nextInt();
		LOGGER.warning("number1 value is "+number1);
		number2 = scan.nextInt();
		result = number1+number2;
		System.out.println("Sum is "+result);
	}

}
