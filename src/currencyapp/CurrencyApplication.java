package currencyapp;

import java.util.Scanner;

public class CurrencyApplication {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		try {
			CurrencyApplication x = new CurrencyApplication();
			
			double result = 0;
			
			System.out.println("Enter US amount to convert: ");
			double USDamount = in.nextDouble();
			
			if (x.usValidator(USDamount)) {
				System.out.println("Enter exchange rate: ");
				double exchangeRate = in.nextDouble();
				if (x.conventerValidator(exchangeRate)) {
					result = x.convertCurrency(exchangeRate, USDamount);
					System.out.println(result+"EURO");
				}
			}
		}
		catch (CurrencyApplicationException e) {
			System.out.println("UNKNOWN ERROR!");
		}
		
	}

/*
 * Method that converts US to EURO
 * Method takes 2 @param
 * @param exchangeRate 
 * @param amountUSD
 */
double convertCurrency (double USDamount, double exchangeRate) {
		return USDamount*exchangeRate;
	}

/*
 * Method that verifies valid input
 * @param US
 */
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

/*
 * Method that verifies valid input
 * @param exchangeRate
 */
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
}