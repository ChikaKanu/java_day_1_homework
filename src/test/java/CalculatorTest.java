import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(60.5);
    }


    @Test
    public void add() {
        assertEquals(60.5, calculator.add(20, 40.5), 0.001);
    }

    @Test
    public void subtract(){
        assertEquals(30.2, calculator.subtract(60.5, 30.3), 0.001);
    }

    @Test
    public void multiply(){
        assertEquals(100, calculator.multiply(10.0, 10), 0.001);
    }

    @Test

    public void divide(){
        assertEquals(7.5, calculator.divide(30, 4), 0.001);
    }

}
