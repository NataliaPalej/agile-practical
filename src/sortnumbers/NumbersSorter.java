package sortnumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author A00279259
 * USER STORY:
 * AS A mathematician I WANT TO sort numbers TO see lowest and highest number
 * 
 * ACCEPTANCE CRITERIA:
 * 1. Verify valid n1, n2, n3 in range min to max
 * 2. Verify three negative numbers are sorted in ascending order
 * 3. Verify three positive numbers are sorted in ascending order
 * 4. Verify three zeros are sorted 
 * 5. Verify combinations of negative, zero and positive are sorted in ascending order
 * 6. Verify invalid inputs are handled
 */

public class NumbersSorter {

	public boolean validNumber(int n1) throws NumbersSorterException {
		try {
			boolean result = false;
			if (n1 < 10000 && n1 > -10000)	{
				result = true;
			}
			else {
				result = false;
			}
			return result;
		}
		catch {
			
		}
		
	}
		
	
	
	public ArrayList<Integer> sortNumbers(int n1, int n2, int n3) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(n1);
		numbers.add(n2);
		numbers.add(n3);
		Collections.sort(numbers);
		return numbers;
	}

	
	public static void main(String[] args) throws NumbersSorterException {
		// Create object of scanner and class
		Scanner in = new Scanner(System.in);
		NumbersSorter x = new NumbersSorter();
		
		try {
			System.out.println("Enter n1: ");
			int n1 = in.nextInt();
			System.out.println("Enter n2: ");
			int n2 = in.nextInt();
			System.out.println("Enter n3: ");
			int n3 = in.nextInt();
			if (x.validNumber(n1) && x.validNumber(n2) && x.validNumber(n3)) {
				x.sortNumbers(n1, n2, n3);
				System.out.println(x.sortNumbers(n1, n2, n3));
			}
		} catch (InputMismatchException e) {
			System.out.println("Inputs MUST be numbers only!");
		}
	}
}

