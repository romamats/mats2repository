import junit.framework.TestCase;
import org.junit.Test;

public class SignComparatorTest extends TestCase {

    SignComparator signComparator;

    public void setUp() throws Exception {
        super.setUp();
        signComparator = new SignComparator();
    }

    @Test
    public void testCompare1() {
        String expected = "Number is positive";
        String actual = signComparator.compare(1);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompare2() {
        String expected = "Number is equal to zero";
        String actual = signComparator.compare(0);
        assertEquals(expected, actual);
    }
}