package currencyapp;

public class CurrencyApplication {

	public static void main(String[] args) {
		

	}
	
double convertCurrency (double exchangeRate, double amountUSD ) {
		
		// This method converts US dollar values to Euro values based on the 
		// current exchange rate between U.S. dollars and and the Euro.
		// On successful conversion, the Euro amount is returned.
		// Additional Requirement - Define your own exception handler to
		// handle any invalid values.
		
		throw new RuntimeException("Product code not yet written");
		
	}

public boolean usValidator(double us) throws CurrencyApplicationException {
	boolean result = false;
	if (us > 0) {
		result = true;
	}
	else {
		throw new CurrencyApplicationException("US cannot be less or equal to 0");
	}
	return result;
}

public boolean conventerValidator(double value) throws CurrencyApplicationException {
	boolean result = false;
	if (value > 0) {
		result = true;
	}
	else {
		throw new CurrencyApplicationException("CONVERSION cannot be less or equal to 0");
	}
	return result;
}

public double currencyConventer(double us, double conventer) throws CurrencyApplicationException {
	return us*conventer;
}

}