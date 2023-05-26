package week4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a fun exercise for working with Lists.
 * 
 * Let's say I am a Pet Store owner and I want to manage my pets. I only handle
 * domestic pets so the basic pets such as cats, dogs, birds, rabbits and so
 * forth.
 * 
 * 
 * I am going to create a list of the pets that I carry.
 * 
 * There are 2 ways to do this, I can keep the list in a file and read that file
 * and add them to my list or I can just add them in the code.
 * 
 * Example 1 - add them with code.
 * 
 * Example 2 - read them from a file.
 *
 */
public class PetStore {

	public static void main(String[] args) {
		/**
		 * I am going to add my pet types in code here.
		 */
		System.out.println("Example 1");

		/**
		 * This creates a new list and allocates the memory for me so I can start adding
		 * my pets. As you can see below I have added my pets that I carry to a list.
		 */
		List<String> petTypes = new ArrayList<String>();
		petTypes.add("dogs");
		petTypes.add("cats");
		petTypes.add("birds");
		petTypes.add("rabbits");
		petTypes.add("snakes");
		petTypes.add("hamsters");
		petTypes.add("mice");

		/**
		 * Let's print out the pets that I carry. You will notice that I changed the for
		 * loop a bit and I am using the list.size() method so that I will not access
		 * memory or indexes outside of what I already have.
		 * 
		 * The below code says, loop over the list, check if i < petTypes.size(), if so,
		 * the add 1 to i and print the String from the list
		 */
		for (int i = 0; i < petTypes.size(); i++) {
			/**
			 * The list.get() method takes an index or an integer and will pull out the
			 * String at that location. Here I am just printing it.
			 */
			System.out.println(petTypes.get(i));
		}

		/**
		 * An example of checking the get() method would be : petTypes.get(1) = "cats"
		 * or petTypes.get(4) = "snakes" see below. The print outs should be "cats" and
		 * "snakes"
		 */
		System.out.println("-----------------------------------");
		System.out.println(petTypes.get(1));
		System.out.println(petTypes.get(4));

		/**
		 * Now let's say we want to add a new pet type to my list, we already now, I can
		 * call list.add() but let's say I want it to be first in the list.
		 * 
		 * We can use methods in the List Object to add Strings to the list in different
		 * locations. So now I want to sale rats, but I want that to be the first one in
		 * my list
		 * 
		 * The List Object allows me to add a String using the index so I can put the
		 * "rats" in the first entry of the List.
		 * 
		 * Now that I have inserted "rats" at the beginning of the List, the List Object
		 * will move all the other items down so instead of 7, I now have 8 pet types
		 * and "rats" is the first entry.
		 */
		petTypes.add(0, "rats");
		System.out.println("-----------------------------------");
		for (int i = 0; i < petTypes.size(); i++) {
			System.out.println(petTypes.get(i));
		}

		/**
		 * Now let's say I want to add another pet type that I will carry but I cannot
		 * remember if it is in my List. List has a method that you can check called
		 * List.contains() So my new pet type is "fish", so I can check the list to see
		 * if "fish" is in my list.
		 * 
		 * The contains method is a boolean so I say !true or if petTypes does not have
		 * "fish", then add it.
		 * 
		 */
		System.out.println("-----------------------------------");
		if (!petTypes.contains("fish")) {
			System.out.println("Adding fish");
			petTypes.add("fish");
		}

		/**
		 * Now let's test to make sure it added the "fish" type. This should print out
		 * fish is already in your list! cause we added it above. This is a good idea to
		 * check because lists can have duplicates
		 */
		System.out.println("-----------------------------------");
		if (!petTypes.contains("fish")) {
			System.out.println("Adding fish");
			petTypes.add("fish");
		} else {
			System.out.println("fish is already in your list!");
		}

		/**
		 * Now let's say I want to sort my list alphabetically, List can sort your
		 * entries in several ways. Let's look at an example that is alphabetically.
		 * List has a sort() or you can use the Collections Object to help.
		 * 
		 * There are lots of way to sort a list, for this demo, this is the easiest way
		 * to sort it you tell the sort method to compare and ignore Case or upper or
		 * lower case Strings. Let's print it out and see if it worked.
		 * 
		 * You should see birds first and snakes last.
		 */
		petTypes.sort(String::compareToIgnoreCase);
		System.out.println("-----------------------------------");
		for (int i = 0; i < petTypes.size(); i++) {
			System.out.println(petTypes.get(i));
		}

		/**
		 * Let's say you want to start all over and clear out your list, you can call
		 * list.clear() and all my pet types will be removed from my list.
		 * 
		 * This should print out nothing as we have cleared the list.
		 */
		petTypes.clear();
		System.out.println("-----------------------------------");
		for (int i = 0; i < petTypes.size(); i++) {
			System.out.println(petTypes.get(i));
		}

		/**
		 * Okay, I am now going to load my pet types from a file and all of the above
		 * will work exactly the same way, the only difference is that I am getting the
		 * data from file.
		 * 
		 * WARNING *** this is a bit more advanced but worth reading because we are
		 * going to be working with more complex code in the next few weeks.
		 * 
		 * 
		 * 
		 * You can add, sort, clear
		 */
		System.out.println("\n\nExample 2");

		/**
		 * This method looks for a file, loads the file and reads it into a list. This
		 * will be new for you but if you read the method, it will have the explanations
		 */
		petTypes = loadPetTypesFromFile();

		System.out.println("-----------------------------------");
		for (int i = 0; i < petTypes.size(); i++) {
			System.out.println(petTypes.get(i));
		}
	}

	/**
	 * Okay so this will be new to some of you and that's okay, I will break down
	 * the method so you can see what is going on.
	 * 
	 * List<String> pets = null; is basically setting the variable pets to null, the
	 * compiler will get mad if we don't at least attempt to set this to something
	 * even null is a good practice.
	 * 
	 * Now you can see we have a try/catch around part of the method. What this is
	 * telling us is that we want to try to load the file, but if there is an error,
	 * catch that error and print it with e.printStackTrace(). I/O errors can happen
	 * all the time when you are reading files or other sorts of data. this is just
	 * helping us to print out what might have gone wrong.
	 * 
	 * 		try {
	 * 
	 * 			... stuff going on in here might encounter an error.
	 * 
	 * 		} catch (IOException e) { e.printStackTrace(); }
	 * 
	 * This is the file name we want to use.
	 * 
	 * 		String pathToFile = "pet.list.txt";
	 * 
	 * This is a File Object and we are telling the JVM to look in my classpath or
	 * current directory to find the file I want to use.
	 * 
	 * 		File file = new File(PetStore.class.getResource(pathToFile).getFile());
	 * 
	 * This is another Files Object that will take our file, read each line or
	 * String from the file and create a List for us.
	 * 
	 * 		pets = Files.readAllLines(file.toPath());
	 */
	private static List<String> loadPetTypesFromFile() {
		List<String> pets = null;
		try {
			String pathToFile = "pet.list.txt";
			File file = new File(PetStore.class.getResource(pathToFile).getFile());
			pets = Files.readAllLines(file.toPath());
			return pets;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pets;
	}
}
