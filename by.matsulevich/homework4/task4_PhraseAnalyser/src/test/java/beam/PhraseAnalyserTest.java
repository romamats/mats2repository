package beam;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhraseAnalyserTest {
    PhraseAnalyser phraseAnalyser;
    @Before
    public void setUp (){
        phraseAnalyser = new PhraseAnalyser();
    }
    @Test
    public void analyse() {
        String expected = "It stands no chance";
        String actual = phraseAnalyser.analyse("Make this things great again");
        assertEquals(expected, actual);
    }
        @Test
        public void analyse2() {
            String expected = "It could be worse";
            String actual = phraseAnalyser.analyse("Make this things bad again");
            assertEquals(expected, actual);
    }
          @Test
         public void analyse3() {
            String expected = "It is fine, really";
            String actual = phraseAnalyser.analyse("Don't make this things bad again");
            assertEquals(expected, actual);

}}