package day3;

public class WordMatch {

    private String secret;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public WordMatch(String word) {
        secret = word;
    }

    public int scoreGuess(String guess) {
        int occurrences = 0;
        for (int i = 0; i < secret.length() - guess.length() + 1; i++) {
            if (secret.substring(i, i + guess.length()).equals(guess)) {
                occurrences++;
            }
        }
        return occurrences * guess.length() * guess.length();
    }

    public String findBetterGuess(String guess1, String guess2) {
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);
        if (score1 > score2) {
            return guess1;
        } else if (score2 > score1) {
            return guess2;
        } else if (guess1.compareTo(guess2) > 0) {
            return guess1;
        } else {
            return guess2;
        }
    }
}