package bean;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LookupArrayServiceTest {
    LookupArrayService lookupArrayService;

    @Before
    public void setUp() throws Exception {
        lookupArrayService = new LookupArrayService();
    }

    @Test
    public void findMax() {
        int[] numberMax = {1, 10, 100};
        int expected = 10;
        int actual = lookupArrayService.findMax(numberMax);
        assertEquals(expected, actual);

    }

    @Test
    public void findMin() {
        int[] numberMin = {1, 5, 7, 9};
        int expected = 5;
        int actual = lookupArrayService.findMin(numberMin);
        assertEquals(expected, actual);
    }

    @Test
    public void indexOfMax() {
        int[] numberMax = {1, 8, 100, 200};
        int expected = 3;
        int actual = lookupArrayService.indexOfMax(numberMax);
        assertEquals(expected, actual);

    }

    @Test
    public void indexOfMin() {
        int[] numberMin = {100, 8, 105, 1, 5};
        int expected = 3;
        int actual = lookupArrayService.indexOfMin(numberMin);
        assertEquals(expected, actual);

    }
    @Test
    public void indexOf() {
        int[] number = {100, 8, 4, 1, 5};
        int expected = 2;
        int actual = lookupArrayService.indexOf( number,4);
        assertEquals(expected, actual);
}}