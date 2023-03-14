package week5labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsPractice {

	public static void main(String[] args) {
		listOfNames();
	}
	
	public static void nonGenericList() {
		
	}
	
	public static void listOfNames() {
		List<String> myList = new ArrayList<>();
		myList.add("Amy");
		myList.add("Betty");
		myList.add("Doris");
		myList.add("Enda");
		myList.add("Fenna");
		myList.add("Conor");
		// Sort the list in order
		Collections.sort(myList);
		System.out.println("List items: " + myList);
		System.out.println("List size: " + myList.size());
		
		
	}
	
	public static void listOfFruits() {
		
	}

}
