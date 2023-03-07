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

public boolean usValidator(double US) throws CurrencyApplicationException {
	boolean result = false;
	if (US > 0) {
		result = true;
	}
	else {
		throw new CurrencyApplicationException("US cannot be less or equal to 0");
	}
	return result;
}

public boolean conventerValidator(double exchangeRate) throws CurrencyApplicationException {
	boolean result = false;
	if (exchangeRate > 0) {
		result = true;
	}
	else {
		throw new CurrencyApplicationException("CONVERSION cannot be less or equal to 0");
	}
	return result;
}

public double currencyConventer(double US, double exchangeRate) throws CurrencyApplicationException {
	return US*exchangeRate;
}

}