import org.junit.*;
import static org.junit.Assert.*;

public class TestScrabble {

    @Test
    public void isWordTest_forStringsNotContainingNumbers_true() {
        Scrabble testScrabble = new Scrabble();
        assertEquals(false, testScrabble.isCharacter("Yvonne"));
    }

    //Arrays.asList(abc).contains("A");

    //test.matches(".*[0-9].*");

}
