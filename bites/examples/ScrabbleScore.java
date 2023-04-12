package bites.examples;

import java.util.HashMap;

public class ScrabbleScore {

    static HashMap<String, Integer> letterValues = new HashMap<String, Integer>();

    static int calculate(String word){
        int total = 0;
        for (int i = 0; i < word.length(); i++){
            String letter = "" + word.charAt(i);
            int letterScore = letterValues.get(letter);
            total = total + letterScore;
        }
        return total;
    }

    public static void main(String[] args) {
        letterValues.put("a", 1);
        letterValues.put("b", 2);
        letterValues.put("c", 3);
        letterValues.put("d", 1);
        letterValues.put("e", 2);
        letterValues.put("f", 3);
        letterValues.put("g", 1);
        letterValues.put("h", 2);
        letterValues.put("i", 3);
        letterValues.put("j", 1);
        letterValues.put("k", 2);
        letterValues.put("l", 3);
        letterValues.put("m", 1);
        letterValues.put("n", 2);
        letterValues.put("o", 3);
        letterValues.put("p", 1);
        letterValues.put("q", 2);
        letterValues.put("r", 3);
        letterValues.put("s", 1);
        letterValues.put("t", 2);
        letterValues.put("u", 3);
        letterValues.put("v", 1);
        letterValues.put("w", 2);
        letterValues.put("x", 3);
        letterValues.put("y", 1);
        letterValues.put("z", 2);

        int score = calculate("score");
        System.out.println(score);
    }
}
