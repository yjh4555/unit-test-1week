import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {

    @Test
    public void testPlus() {

        CustomCalculator cal = new CustomCalculator();
        int result = cal.add(3, 4);
        assertTrue(result == 7);
    }

    @Test
    public void testMinus() {
        CustomCalculator cal = new CustomCalculator();
        int result = cal.subtract(10, 2);
        assertTrue(result == 8);
    }

    @Test
    public void testMul() {
        CustomCalculator cal = new CustomCalculator();
        int reuslt = cal.multiply(10, 2);
        assertTrue(reuslt == 20);
    }

    @Test
    public void testDiv(){
        CustomCalculator cal = new CustomCalculator();
        int result  = cal.divide(3,4);
        assertTrue(result==0);


}