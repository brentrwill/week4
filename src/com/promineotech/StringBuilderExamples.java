package com.promineotech;

public class StringBuilderExamples {

	public static void main(String[] args) {
		String space = " ";

		/**
		 * String example
		 */
		String firstName = "Jenny";
		String lastName = "Smith";

		String address = "1234 North 5678 West";
		String city = "New York";
		String state = "NY";

		System.out.println(firstName + space + lastName + space + address + space + city + space + state);
		
		/**
		 * StringBuilder example
		 */
		StringBuilder builder = new StringBuilder();
		builder.append("Jenny" + space);
		builder.append("Smith" + space);
		builder.append("1234 North 5678 West" + space);
		builder.append("New York" + space);
		builder.append("NY");

		System.out.println(builder.toString());

		/**
		 * Reverse the String with a method
		 */
		StringBuilder reversed = new StringBuilder(builder.toString());
		System.out.println(reversed.reverse().toString());

		/**
		 * Reverse the String with a loop
		 */
		String s = "";
		for (int index = builder.length() - 1; index >= 0; index--) {
			s += builder.charAt(index);
		}
		System.out.println(s);
	}

}
