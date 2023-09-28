package com.promineotech;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionExamples {

	public static void main(String[] args) {
		/**
		 * There are lots of different collections we can use.
		 * 
		 * A List is one type.
		 * 
		 * A Set is a special kind of list that contains no duplicate elements
		 * 
		 * A Map is a collection of key,value pairs. Let's look at each type.
		 * 
		 * Interface --> Implementation
		 * 
			 Set --> HashSet, TreeSet, LinkedHashSet
			 List --> ArrayList, LinkedList
			 Map --> HashMap, TreeMap, LinkedHashMap
			 
		 * 
		 */
		
		/**
		 * Lets look at a Set example. A HashSet is a type of Set Object.
		 */
		Set<String> mySet = new HashSet<String>();
		mySet.add("Test");
		mySet.add("Test");
		mySet.add("Test");
		mySet.add("Test");
		mySet.add("Test1");		
		
		for(String str : mySet) {
			System.out.println(str);
		}
		
		System.out.println("--------------");
		

		/**
		 * Let's go over a HashMap now.
		 * 
		 * key/value pairs are everywhere, we want a way to store this together. Examples of these are
		 * 
		 * - username and password.
		 * - checking account and total.
		 */
		Map<String, String> usernameAndPasswords = new TreeMap<String, String>();
		usernameAndPasswords.put("test", "123123adfasdf");
		usernameAndPasswords.put("test1", "asdf1234565");
		usernameAndPasswords.put("test2", "0989asd081325146");
		usernameAndPasswords.put("test3", "2134123450@$^");
		
		for (Map.Entry<String,String> entry : usernameAndPasswords.entrySet()) {
	            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
		}
		
		
		Map<String, List<String>> lists = new HashMap<String, List<String>>();
		
		List<String> values = new ArrayList<String>();
		values.add("This is a test");
		
		lists.put("myKey", values);
		
		System.out.println("--------------");		
	}
}
