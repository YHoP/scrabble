import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import java.util.Arrays;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Scrabble {
    public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("template", "templates/scrabbleform.vtl");
        return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/score", (request, response) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("template", "templates/scrabbleoutput.vtl");

        String userInput = request.queryParams("userWord");
        Integer finalScore = 0;

        if ( isNumber(userInput) == false ) {
            finalScore = totalScoreFinal(userInput);
        } else {
            Boolean isNumber = true;
        }

        model.put("userWord", userInput);
        model.put("finalScore", finalScore);
        return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

}

public static Integer totalScoreFinal(String userInput){

    Integer totalScore = 0;

    String userInputCaps = userInput.toUpperCase();
    char [] userInputArray = userInputCaps.toCharArray();

    for (char userInputArrayItem : userInputArray ){
        Integer score = eachScore(userInputArrayItem);
        totalScore = totalScore + score;
    }
    return totalScore;
}

public static Boolean isNumber (String word) {
    Boolean result = word.matches(".*[0-9].*");
    return result;
}

public static Integer eachScore(char wordInput){
    Map<Character, Integer> scrabbleScores = new HashMap<>();
        scrabbleScores.put('A', 1);
        scrabbleScores.put('E', 1);
        scrabbleScores.put('I', 1);
        scrabbleScores.put('O', 1);
        scrabbleScores.put('U', 1);
        scrabbleScores.put('L', 1);
        scrabbleScores.put('N', 1);
        scrabbleScores.put('R', 1);
        scrabbleScores.put('S', 1);
        scrabbleScores.put('T', 1);
        scrabbleScores.put('D', 2);
        scrabbleScores.put('G', 2);
        scrabbleScores.put('B', 3);
        scrabbleScores.put('C', 3);
        scrabbleScores.put('M', 3);
        scrabbleScores.put('P', 3);
        scrabbleScores.put('F', 4);
        scrabbleScores.put('H', 4);
        scrabbleScores.put('V', 4);
        scrabbleScores.put('W', 4);
        scrabbleScores.put('Y', 4);
        scrabbleScores.put('K', 5);
        scrabbleScores.put('J', 8);
        scrabbleScores.put('X', 8);
        scrabbleScores.put('Q', 10);
        scrabbleScores.put('Z', 10);

        return scrabbleScores.get(wordInput);
     }
}
