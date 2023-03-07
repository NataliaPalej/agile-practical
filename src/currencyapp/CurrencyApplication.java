package currencyapp;

public class CurrencyApplication {

	public static void main(String[] args) {
		

	}
	
double convertCurrency (double exchangeRate, double amountUSD ) {
		return amountUSD*exchangeRate;
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