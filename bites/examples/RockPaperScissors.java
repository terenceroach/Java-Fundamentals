package bites.examples;

import java.util.HashMap;
import java.util.HashSet;

public class RockPaperScissors {
    public static HashMap<String, HashMap<String, String>> rules = new HashMap<String, HashMap<String, String>>();

    static String play(String player1, String player2){
        String outcome = rules.get(player1).get(player2);
        return outcome;
    }

    public static void main(String[] args) {
        HashMap<String, String> rockOutcomes = new HashMap<String, String >();
        rockOutcomes.put("rock", "draw");
        rockOutcomes.put("paper", "player 2 wins");
        rockOutcomes.put("scissors", "player 1 wins");

        HashMap<String, String> paperOutcomes = new HashMap<String, String>();
        paperOutcomes.put("rock", "player 1 wins");
        paperOutcomes.put("paper", "draw");
        paperOutcomes.put("scissors", "player 2 wins");

        HashMap<String, String> scissorsOutcomes = new HashMap<String, String>();
        scissorsOutcomes.put("rock", "player 2 wins");
        scissorsOutcomes.put("paper", "player 1 wins");
        scissorsOutcomes.put("scissors", "draw");

        rules.put("rock", rockOutcomes);
        rules.put("paper", paperOutcomes);
        rules.put("scissors", scissorsOutcomes);

        System.out.println(play("scissors", "paper"));

    }
}
