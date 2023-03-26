import org.example.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        double expected = 10.5;
        double result = Calculator.add(3.0, 4.5, 3.0);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testSubtract() {
        double expected = 6.0;
        double result = Calculator.subtract(10.0, 2.0, 2.0);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testMultiply() {
        double expected = 24.0;
        double result = Calculator.multiply(2.0, 3.0, 4.0);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testDivide() {
        double expected = 5.0;
        double result = Calculator.divide(25.0, 5.0);
        assertEquals(expected, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator.divide(10.0, 0.0);
    }

}
