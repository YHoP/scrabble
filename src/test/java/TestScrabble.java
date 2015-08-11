import org.junit.*;
import static org.junit.Assert.*;

public class TestScrabble {

    @Test
    public void eachScore_returnCorrectValue_1(){
        Scrabble testScrabble = new Scrabble();
        Integer score = 1;
        assertEquals(score, testScrabble.eachScore('A'));
    }

    @Test
    public void totalScoreFinal_returnCorrectValueForTwoLetters_5(){
        Scrabble testScrabble = new Scrabble();
        Integer score = 5;
        assertEquals(score, testScrabble.totalScoreFinal("HI"));
    }
}
