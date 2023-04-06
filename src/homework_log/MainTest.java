package homework_log;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main m;


    @BeforeEach
    public void init() {
        m = new Main();

    }

    @Test
    public void testBinary() {
        int[] actual = {1, 3, 5, 6, 9, 14};
        assertEquals(4, m.binarySearch(9,actual));

    }

    @Test
    public void test_Binary_1() {
        int[] actual = {1, 3, 5, 6, 9};
        assertEquals(3, m.binarySearch(6, actual));
    }

    @Test
    public void test_Binary_2() {
        int[] actual = {1, 3, 5, 6, 9, 14,15,18};
        assertEquals(5, m.binarySearch(14, actual));
    }

}