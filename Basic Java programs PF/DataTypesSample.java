package com.technosys.datatypes;

public class DataTypesSample {
	public static void main(String[] args) {

		// Premitive data types
		byte tinyNumber = 127; // range of -128 to 127 size-1byte- 8bit   0000 0000   128 64 32 16 8421
		short smallNumber = 1234; // range of -32768 to 32767
		int number = 2134567890; // range of -2^31 to 2^31 -1
		long largeNumber = 12345678909l;// range of -2^63 to 2^63 -1
		float decimal = 123.1f;// range 7 decimal points
		double bigDecimal = 112.12333544667; // range 15 decimal points
		char charecter = 'a'; // ASCII table single char 2 bytes  unicode
		boolean flag = false; // values either true or false 
		System.out.println("Byte Value is :" + tinyNumber);

		
	}
}
