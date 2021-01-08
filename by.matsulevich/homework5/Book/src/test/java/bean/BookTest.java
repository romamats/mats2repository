package bean;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
Book book1;
Book book2;
    @Before
    public void setUp() throws Exception {
        book1 = new Book("Gogol", "Revizor",500);
        book2 = new Book("Gogol", "Vij",400);
    }

    @Test
    public void testToString() {
        String expected = "Book{author='Gogol', name='Revizor', numberOfPages=500}";
        String actual = book1.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testEquals() {
        Book expected = new Book("Gogol", "Revizor", 500);
        Book actual = book1;
        assertEquals(expected, actual);
    }
    @Test
    public void testToString2() {
        String expected = "Book{author='Gogol', name='Vij', numberOfPages=400}";
        String actual = book2.toString();
        assertEquals(expected, actual);
    }
}