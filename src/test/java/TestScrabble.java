import org.junit.*;
import static org.junit.Assert.*;

public class TestScrabble {

    @Test
    public void isWordTest_forStringsContainingNumbers_false() {
        Scrabble testScrabble = new Scrabble();
        assertEquals(false, testScrabble.isCharacter("Yvonne"));
    }

    @Test
    public void isWordTest_forStringContainingNumbers_true() {
        Scrabble testScrabble = new Scrabble();
        assertEquals(true, testScrabble.isCharacter("Summer is number 1"));
    }

    @Test
    public void scrabbleScore_returnsAScrabbleScoreForALetter_1A() {
        Scrabble testScrabble = new Scrabble();
        Integer score = 1;
        assertEquals(score, testScrabble.scrabbleScoreOne("E"));
    }

    @Test
    public void scrabbleScore_returnsAScrabbleScoreForALetter_1() {
        Scrabble testScrabble = new Scrabble();
        Integer score = 1;
        assertEquals(score, testScrabble.scrabbleScore("T"));
    }

    @Test
    public void scrabbleScore_returnsAScrabbleScoreForALetter_2() {
        Scrabble testScrabble = new Scrabble();
        Integer score = 2;
        assertEquals(score, testScrabble.scrabbleScore("D"));
    }

    @Test
    public void scrabbleScore_returnsAScrabbleScoreForALetter_3() {
        Scrabble testScrabble = new Scrabble();
        Integer score = 3;
        assertEquals(score, testScrabble.scrabbleScore("C"));
    }

    @Test
    public void scrabbleScore_returnsAScrabbleScoreForALetter_4() {
        Scrabble testScrabble = new Scrabble();
        Integer score = 4;
        assertEquals(score, testScrabble.scrabbleScore("W"));
    }

    @Test
    public void scrabbleScore_returnsAScrabbleScoreForALetter_5() {
        Scrabble testScrabble = new Scrabble();
        Integer score = 5;
        assertEquals(score, testScrabble.scrabbleScore("K"));
    }

    @Test
    public void scrabbleScore_returnsAScrabbleScoreForALetter_8() {
        Scrabble testScrabble = new Scrabble();
        Integer score = 8;
        assertEquals(score, testScrabble.scrabbleScore("X"));
    }

    @Test
    public void scrabbleScore_returnsAScrabbleScoreForALetter_10() {
        Scrabble testScrabble = new Scrabble();
        Integer score = 10;
        assertEquals(score, testScrabble.scrabbleScore("Z"));
    }
}
