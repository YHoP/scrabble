import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import java.util.Arrays;
//import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Scrabble {
    public static void main(String[] args) {}

    public Boolean isCharacter (String word) {
        Boolean result = word.matches(".*[0-9].*");
        return result;
    }

    public Integer scrabbleScoreOne (String word){
        char [] wordArray = word.toCharArray();
        String [] wsArray = {};

        String [] scoreOne = {"A", "E", "I", "O", "U", "L", "N", "R", "S", "T"};
        Integer score = 0;

        for (Integer j = 0; j <= wordArray.length-1; j++){
            wsArray[j] = Character.toString(wordArray[j]);

            for (Integer i = 0; i <= scoreOne.length-1; i++) {
                if (wsArray[j].contains(scoreOne[i])) {
                    score = 1;
                }
            }
        }
    }

    public Integer scrabbleScore (String word) {

        String [] scoreOne = {"A", "E", "I", "O", "U", "L", "N", "R", "S", "T"};
        String [] scoreTwo = { "D", "G" };
        String [] scoreThree = { "B", "C", "M", "P" };
        String [] scoreFour = { "F", "H", "V", "W", "Y" };
        String [] scoreFive = { "K" };
        String [] scoreEight = { "J", "X" };
        String [] scoreTen = { "Q", "Z" };

        Integer score = 0;
        Integer totalScore = 0;

        for (Integer i = 0; i <= scoreOne.length-1; i++) {
            if (word.contains(scoreOne[i])) {
                score = 1;
            }
        }

        for (Integer i = 0; i <= scoreTwo.length-1; i++) {
            if (word.contains(scoreTwo[i])) {
                score = 2;
            }
        }

        for (Integer i = 0; i <= scoreThree.length-1; i++) {
            if (word.contains(scoreThree[i])) {
                score = 3;
            }
        }

        for (Integer i = 0; i <= scoreFour.length-1; i++) {
            if (word.contains(scoreFour[i])) {
                score = 4;
            }
        }

        for (Integer i = 0; i <= scoreFive.length-1; i++) {
            if (word.contains(scoreFive[i])) {
                score = 5;
            }
        }

        for (Integer i = 0; i <= scoreEight.length-1; i++) {
            if (word.contains(scoreEight[i])) {
                score = 8;
            }
        }

        for (Integer i = 0; i <= scoreEight.length-1; i++) {
            if (word.contains(scoreTen[i])) {
                score = 10;
            }
        }

        return score;
    }



    // public Boolean doesContain (String word) {
    //     String [] scoreOne = new String [] {"A", "E", "I", "O", "U", "L", "N", "R", "S", "T"};
    //     //char [] charWord = word.toCharArray();
    //
    //     //String [] wordArray = new String [];
    //     Boolean containsIt = false;
    //
    //     containsIt = word.contains(scoreOne[0]);
    //     // for (Integer i = 0; i <= scoreOne.length; i++) {
    //     //   if (word.contains(scoreOne[i])) {
    //     //         containsIt = true;
    //
    //     //     } else {
    //     //         containsIt = false;
    //     //     }
    //     // }
    //     return containsIt;
    //     //Boolean result = word.contains(score1[0]);
    //     //Boolean result = Arrays.asList(score1).contains(word);
    //     //return result;
    // }
}
