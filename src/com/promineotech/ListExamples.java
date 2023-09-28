package com.promineotech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {

	public static void main(String[] args) {
		
		/**
		 * Create a List of Integer with an Array, we know how to do this!
		 */
		int[] numbersArray = {1,2,3};
		
		// int[] numbersArray = new int[3];
		
		numbersArray[0] = 1;
		numbersArray[1] = 2;
		numbersArray[2] = 3;

//		for (int index = 0; index < 1000; index++) {
//			numbersArray[index] = index;
//		}

		System.out.println("--------------");	
		
		/**
		 * Create a list of Integer with an ArrayList, it looks very similar
		 * 
		 * <> These define the datatype that will be used. <String>, <Integer>, <Long>, <Custom Object>
		 * 
		 * int = Integer Object 
		 * long = Long Object 
		 * String = String 
		 * double = Double
		 */
		ArrayList<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(1);
		numbersList.add(2);
		numbersList.add(3);

//		for (int index = 0; index < numbersList.size(); index++) {
//			System.out.println(numbersList.get(index));
//		}
		
		for (int index = 0; index < 1000; index++) {
			numbersList.add(index);
		}
		
		System.out.println("--------------");
		

		/**
		 * Now, let's create a list of pets and use some of the list methods
		 */
		List<String> pets = new ArrayList<String>();
		pets.add("dogs");
		pets.add("cats");
		pets.add("birds");
		pets.add("rabbits");
		pets.add("snakes");
		pets.add("hamsters");
		pets.add("mice");

		for (int i = 0; i < pets.size(); i++) {
			System.out.println(pets.get(i));
		}

		System.out.println("--------------");

		/**
		 * Let's add a new pet at the end
		 */
		pets.add("fish");
		for (int i = 0; i < pets.size(); i++) {
			System.out.println(pets.get(i));
		}

		System.out.println("--------------");

		
		pets.add(0, "rat");
		for (int i = 0; i < pets.size(); i++) {
			System.out.println(pets.get(i));
		}

		System.out.println("--------------");


		/**
		 * Lists can be sorted in various ways, we can sort the list by smallest to largest.
		 */
		List<Integer> newInts = new ArrayList<>();
		newInts.add(894);
		newInts.add(-1);
		newInts.add(1077);
		newInts.add(43);
		newInts.add(54329);
		
		Collections.sort(newInts);
		System.out.println(newInts);
		
		/**
		 * Let's sort from largest to smallest
		 */
		Collections.reverse(newInts);
		System.out.println(newInts);
		
		System.out.println("--------------");

		/**
		 * Let's create a linkedlist
		 */
		List<String> shoppingList = new LinkedList<>();

		// Add some items to the list
		shoppingList.add("Apples");
		shoppingList.add("Bread");
		shoppingList.add("Bananas");
		shoppingList.add("Milk");
		shoppingList.add("Cheese");
		shoppingList.add("Eggs");
		shoppingList.add("Ham");

		System.out.println("Shopping List:");

		for (String item : shoppingList) {
			System.out.println(item);
		}
		
		System.out.println("--------------");

		shoppingList.remove(2);
		System.out.println("Shopping List:");

		for (String item : shoppingList) {
			System.out.println(item);
		}
	}

}
