package problrm4Test;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import problem4.Problem4;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class Problem4Test {
    private Problem4 problem4;
    @Before
    public void runBeforeEachTest()
    {
        problem4 = new Problem4();
    }

    @DisplayName("SortRandom number")
    @RepeatedTest(value = 100)
    @Test public void testSortRandom() {
        int length = (int) (0 + Math.random() * (100 - 0 + 1)), min = -1000000, max = 1000000;
        int[] arr = IntStream.range(0, length)
                .map(i -> (int) (min + Math.random() * (max - min + 1)))
                .toArray();

        problem4.sort(arr);
        assertEquals(isSorted(arr), true);
        assertEquals(arr.length, length);
    }

    boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }
}
