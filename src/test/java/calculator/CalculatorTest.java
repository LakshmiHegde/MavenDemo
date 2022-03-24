package calculator;
import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    calculator c = new calculator();

    @Test
    public void addingTruePositive(){
        assertEquals("Adding two integer numbers for True Positive", 4, c.add(2, 2), DELTA);
        assertEquals("Adding two double numbers for True Positive", 5.3, c.add(2.1, 3.2), DELTA);
    }

    @Test
    public void addingFalsePositive(){
        assertNotEquals("Adding two integer numbers for False Positive", 6, c.add(2, 2), DELTA);
        assertNotEquals("Adding two double numbers for False Positive", 7.3, c.add(2.1, 3.2), DELTA);
    }

    @Test
    public void subtractingTruePositive(){
        assertEquals("Subtracting two integer numbers for True Positive", 0, c.subtract(2, 2), DELTA);
        assertEquals("Subtracting two double numbers for True Positive", -1.1, c.subtract(2.1, 3.2), DELTA);
    }

    @Test
    public void subtractingFalsePositive(){
        assertNotEquals("Subtracting two integer numbers for False Positive", 6, c.subtract(2, 2), DELTA);
        assertNotEquals("Subtracting two double numbers for False Positive", -7.3, c.subtract(2.1, 3.2), DELTA);
    }
}
