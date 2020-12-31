package bean;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LightColorDetectorTest {
LightColorDetector lightColorDetector;
@Before
public void setUp(){
    lightColorDetector = new LightColorDetector();
}
    @Test
    public void detect() {
    String expected = "Red";
    String actual = lightColorDetector.detect(500);
    assertEquals(expected, actual);
    }
}