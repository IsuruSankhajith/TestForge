import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoPlusTwoShouldFour(){
        var calculator = new SimpleCalculator();
        assertEquals(4,calculator.add(2,2));
    }
    @Test
    void threePlusSevenShouldequlaTen (){
        var calculator = new SimpleCalculator();
        assertEquals(10,calculator.add(4,7));
    }

}