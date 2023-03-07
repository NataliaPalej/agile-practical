package currencyapp;
  
import org.junit.Test;

import junit.framework.TestCase;
 
public class CurrencyApplicationTest extends TestCase {
    
    @Test
    public void usValidator001() {
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
    
    @Test
    void usValidator002() {
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
            fail("Exception Expected");
        }
        catch (CurrencyApplicationException e) {
            assertEquals("US cannot be less or equal to 0", e.getMessage());
        }
    }
    
    @Test
    public void conventerValidator001() {
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
    
    @Test
    void conventerValidator002() {
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
    
    @Test
    void currencyConventer001() {
        /**
         * Test #1
         * Objective: Verify invalid  convention value <= 0
         * Input: US = 1, converter = 1.5
         * Output: 1.5EURO
         */
        CurrencyApplication test001 = new CurrencyApplication();
        try {
            double result = test001.currencyConventer(1, 1.5);
            assertEquals(1.5, result);
        }
        catch (CurrencyApplicationException e) {
            fail("Exception NOT expected!");
        }
    }
 
}
 