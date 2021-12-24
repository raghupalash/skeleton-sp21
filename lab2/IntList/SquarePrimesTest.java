package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesHard() {
        IntList lst = IntList.of(2, 4, 5, 7, 12, 19, 97);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("4 -> 4 -> 25 -> 49 -> 12 -> 361 -> 9409", lst.toString());
        assertTrue(changed);
    }
}
