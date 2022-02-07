import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }


    @Test
    public void hasAdd(){
        assertEquals(4, calc.add(2, 2));
    }

    @Test
    public void hasSubtract(){
        assertEquals(2, calc.subtract(10, 8));
    }

    @Test
    public void hasMultiply(){
        assertEquals(4, calc.multiply(2, 2));
    }

    @Test
    public void hasDivide(){
        assertEquals(0.125, calc.divide(1, 8), 0.0);
    }

}
