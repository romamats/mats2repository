package bean;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {
Counter counter;
    @Before
    public void setUp() {
        counter = new Counter(100,5);
    }

    @Test
    public void increment() {
        this.counter.setValue(100);
        this.counter.setStep(5);
        int expected = 105;
        int actual = counter.increment();
        assertEquals(expected, actual);
    }

    @Test
    public void decrement() {
        this.counter.setValue(101);
        this.counter.setStep(60);
        int expected = 41;
        int actual = counter.decrement();
        assertEquals(expected, actual);
    }


}