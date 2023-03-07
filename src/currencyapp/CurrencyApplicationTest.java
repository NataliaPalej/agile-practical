package currencyapp;

import junit.framework.TestCase;

public class CurrencyApplicationTest extends TestCase {
    
    public void testusValidator001() {
        /**
         * Test #1
         * Objective: Verify valid US > 0
         * Input: 20
         * Output: true
         */
        CurrencyApplication test001 = new CurrencyApplication();
        
        try {
            boolean result = test001.usValidator(20);
            assertEquals(true, result);
        }
        catch (CurrencyApplicationException e) {
            fail("Exception NOT expected!");
        }
        
    }
    
    public void testusValidator002() {
        /**
         * Test #2
         * Objective: Verify invalid  US <= 0
         * Input: -30
         * Output: Value cannot be less or equal to 0 // False
         */
        CurrencyApplication test002 = new CurrencyApplication();
        try {
            boolean result = test002.usValidator(-30);
            assertEquals(false, result);
            fail("Exception expected!");
        }
        catch (CurrencyApplicationException e) {
            assertEquals("US cannot be less or equal to 0", e.getMessage());
        }
    }
    
    public void testusValidator003() {
        /**
         * Test #2
         * Objective: Verify invalid  US = 0
         * Input: 0
         * Output: Value cannot be less or equal to 0 // False
         */
        CurrencyApplication test003 = new CurrencyApplication();
        try {
            boolean result = test003.usValidator(0);
            assertEquals(false, result);
            fail("Exception expected!");
        }
        catch (CurrencyApplicationException e) {
            assertEquals("US cannot be less or equal to 0", e.getMessage());
        }
    }
    
    public void testconventerValidator001() {
        /**
         * Test #1
         * Objective: Verify valid convention value > 0
         * Input: 1.5
         * Output: true
         */
        CurrencyApplication test001 = new CurrencyApplication();
        
        try {
            boolean result = test001.conventerValidator(1.5);
            assertEquals(true, result);
        }
        catch (CurrencyApplicationException e) {
            fail("Exception NOT expected!");
        }
        
    }
    
    public void testconventerValidator002() {
        /**
         * Test #2
         * Objective: Verify invalid  convention value <= 0
         * Input: -1.2
         * Output: Value cannot be less or equal to 0 // False
         */
        CurrencyApplication test002 = new CurrencyApplication();
        try {
            boolean result = test002.conventerValidator(-1.2);
            assertEquals(false, result);
            fail("Exception Expected");
        }
        catch (CurrencyApplicationException e) {
            assertEquals("CONVERSION cannot be less or equal to 0", e.getMessage());
        }
    }
    
    public void testconventerValidator003() {
        /**
         * Test #3
         * Objective: Verify invalid  convention value = 0
         * Input: 0
         * Output: Value cannot be less or equal to 0 // False
         */
        CurrencyApplication test003 = new CurrencyApplication();
        try {
            boolean result = test003.conventerValidator(0);
            assertEquals(false, result);
            fail("Exception Expected");
        }
        catch (CurrencyApplicationException e) {
            assertEquals("CONVERSION cannot be less or equal to 0", e.getMessage());
        }
    }
    
    public void testconvertCurrency001() {
        /**
         * Test #1
         * Objective: Verify invalid  convention value <= 0
         * Input: US = 20, converter = 1.5
         * Output: 30EURO
         */
        CurrencyApplication test001 = new CurrencyApplication();
        double result = test001.convertCurrency(20, 1.5);
		assertEquals(30.0, result);
    }
 
}
 