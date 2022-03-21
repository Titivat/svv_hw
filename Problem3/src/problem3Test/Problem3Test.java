package problem3Test;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import problem3.Problem3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class Problem3Test {
    private Problem3 problem3;
    @Before
    public void runBeforeEachTest()
    {
        problem3 = new Problem3();
    }

    @DisplayName("Test for binToDec")
    @Test public void testBinToDecEx() {
        assertThrows(IllegalArgumentException.class, () -> {problem3.binToDec("12");});
        assertThrows(IllegalArgumentException.class, () -> {problem3.binToDec("Hello_World");});
        assertThrows(IllegalArgumentException.class, () -> {problem3.binToDec("1011.1");});
        assertThrows(IllegalArgumentException.class, () -> {problem3.binToDec("-101");});
        assertThrows(IllegalArgumentException.class, () -> {problem3.binToDec("1 1 0 1");});
        assertThrows(IllegalArgumentException.class, () -> {problem3.binToDec("");});
        assertDoesNotThrow( () -> {problem3.binToDec("1001");});
        assertDoesNotThrow( () -> {problem3.binToDec("0");});
    }
}
