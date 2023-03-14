package week5labs;

import java.util.ArrayList;
import java.util.List;

public class Generics {
	
	public static void main(String[] args) {
		List <Object> myList = new ArrayList<>();
		myList.add("Fred");
		myList.add(43);
	
		String s1 = (String)myList.get(0);
		Integer s2 = (Integer)myList.get(1);
		
		String s3 = (String)myList.get(0);
		Integer s4 = (Integer)myList.get(1);
	
		System.out.print(s1 + " " + s2);
		System.out.println();
		System.out.print(s3 + " " + s4);
		
	}
}
