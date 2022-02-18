package com.technosys.datatypes;

public class OperatorSample {

	public static void main(String[] args) {
		
		// binary Operator
		int number1=10,number2=20;
		System.out.println("Sum of two Numbers "+number1+number2);// Arithmetic operator +,-,*,/,%
		
		System.out.println("B Greater than A "+(number2>number1));// Relational Opertaor <,>,<=,>=,==,!=
		System.out.println("B Equal to A "+(number2==number1));// check operands are equal are not
		//logical operator
		System.out.println("Both Experssion are true "+((number1<=number2)&&(number1!=number2)));// Logical Operators && || !
		
		//unary operator ++ --
		int number3=50;
		System.out.println(number3++);// post increment value get updated after the printing stmt
		System.out.println(number3);
	}
}
