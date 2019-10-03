package com;

import java.util.Scanner;

public class IG {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int numberOfDigits = (int) (Math.log10(input.nextInt())+1);
		System.out.println(numberOfDigits);
		input.close();
		String s = "siva karthik para";
		System.out.println(s.substring(15));
	}
}
