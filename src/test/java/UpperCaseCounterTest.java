import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseCounterTest {
    private  UpperCaseCounter upperCaseCounter = new UpperCaseCounter();

    @Test
    public void check_null() {
        String str = null;

        int result  = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertTrue(result == 0);
    }

    @Test
    public void check_emptyValue() {
        String str = "";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);

        assertTrue(result == 0);
    }

    @Test
    public void upperCase_ABC() {
        String str = "ABC";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("result :: " + result);
        assertTrue(result == 3);
        assertFalse(result == 2);
    }

    @Test
    public void lowerCase_ABC() {
        String str = "ABCdefGHI";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("result :: " + result);

        assertTrue(result == 6);
        assertFalse(result  == 5);
    }

}