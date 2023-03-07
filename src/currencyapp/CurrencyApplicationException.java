package currencyapp;

@SuppressWarnings("serial")
public class CurrencyApplicationException extends Exception {
	
	String message;
	
	public CurrencyApplicationException(String e) {
		message = e;
	}
	
	public String getMessage() {
		return message;
	}
}