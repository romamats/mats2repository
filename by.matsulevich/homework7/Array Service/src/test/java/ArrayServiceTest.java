import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayServiceTest {
    ArrayService arrayService;

    @Before
    public void setUp() {
        arrayService = new ArrayService();
    }
    @Test
        public void sort () {
            int[] array = {121, 200, 201, 300, 301, 400, 401, 500, 600};
            int[] expected = {121, 200, 201, 300, 301, 400, 401, 500, 600};
            int[] actual = arrayService.sort(array);
            assertArrayEquals(expected, actual);
        }

        @Test
        public void swap() {
            int[] array = {121, 200, 201, 300, 301, 400, 401, 500, 600};
            int[] expected = {600, 500, 401, 400, 301, 300, 201, 200, 121};
            int[] actual = arrayService.swap(array);
            assertArrayEquals(expected, actual);
        }
}