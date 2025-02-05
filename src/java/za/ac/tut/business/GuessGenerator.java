package za.ac.tut.business;

public class GuessGenerator {

    private final String[] coinSides = {"head", "tail"};

    public GuessGenerator() {
    }

    public String generateGuess() {
        int randNum;

        randNum = (int) Math.floor(Math.random() * 2);

        return coinSides[randNum];
    }
}
