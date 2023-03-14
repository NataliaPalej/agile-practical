package sortnumbers;

public class NumbersSorterException extends Exception{
	
	String message;
	
	public NumbersSorterException(String e) {
		message = e;
	}
	
	public String getMessage() {
		return message;
	}
	
}
