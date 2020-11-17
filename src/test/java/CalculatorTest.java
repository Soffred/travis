import com.company.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addition() {
        var cal = new Calculator();
        assertEquals(10, cal.addition(5, 5), "should be 10 ");
    }

    @Test
    void subtraction() {
        var calc = new Calculator();
        assertEquals(10, calc.subtraction(15, 5), "should be 15" );
    }
}