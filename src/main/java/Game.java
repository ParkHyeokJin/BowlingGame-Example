public class Game {
    private int[] rolls = new int[21];
    private int currentRoll = 0;
    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }
    public Integer score() {
        int score = 0;
        int i = 0;
        for(int frame = 0; frame < 10; frame++) {
            if(isSpare(i)) { // spare
                score += 10 + rolls[i + 2];
                i += 2;
            }
            else {
                score += rolls[i] + rolls[i + 1];
                i += 2;
            }
        }
        return score;
    }

    private boolean isSpare(int i) {
        return rolls[i] + rolls[i + 1] == 10;
    }
}
