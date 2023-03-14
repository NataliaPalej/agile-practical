package week5labs;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildCard {
	
	public static void showList(List<Object> list) {
		
		for(Object o:list) {
			System.out.println(o);
		}
		list.add("test");
	}

	public static void main(String[] args) {
		// changed <Double> <String> to <Object> to correct the code
		List<Object> doubles = new ArrayList<Object>();
		doubles.add(12.2);
		
		List<Object> names = new ArrayList<Object>();
		names.add("Sean");
		
		showList(names);
		showList(doubles);
	}

}
