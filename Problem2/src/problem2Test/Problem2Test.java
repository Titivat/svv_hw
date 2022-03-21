package problem2Test;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import problem2.Problem2;

import static org.junit.Assert.*;

public class Problem2Test {
    private Problem2 problem2;
    @Before public void runBeforeEachTest()
    {
        problem2 = new Problem2();
    }

    @DisplayName("Test for Gcd")
    @Test public void testGcd() {
        assertEquals(problem2.gcd(5, 1), 1);
        assertEquals(problem2.gcd(234, 234), 234);
        assertEquals(problem2.gcd(18, 16), 6);
        assertEquals(problem2.gcd(16, 18), 6);
        assertEquals(problem2.gcd(36, 24), 12);
        assertEquals(problem2.gcd(24, 36), 12);
        assertEquals(problem2.gcd(77, 21), 7);
        assertEquals(problem2.gcd(104513, 23), 1);
    }
}
