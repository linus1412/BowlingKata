class Game {

    int score
    int[] rolls = new int[21]
    int currentRole = 0

    void roll(int pins) {
        score += pins
        rolls[currentRole++] = pins
    }

    int score() {
        int score = 0
        int frameIndex = 0
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(frameIndex)) {
                score += 10 + strikeBonus(frameIndex)
                frameIndex++
            } else if (isSpare(frameIndex)) { // spare
                score += 10 + spareBonus(frameIndex)
                frameIndex += 2
            } else {
                score += sumOfBallsInFrame(frameIndex)
                frameIndex += 2
            }
        }
        score
    }

    private boolean isStrike(int frameIndex) {
        rolls[frameIndex] == 10
    }

    private int spareBonus(int frameIndex) {
        rolls[frameIndex + 2]
    }

    private int sumOfBallsInFrame(int frameIndex) {
        rolls[frameIndex] + rolls[frameIndex + 1]
    }

    private int strikeBonus(int frameIndex) {
        rolls[frameIndex+1] + rolls[frameIndex+2]
    }

    private boolean isSpare(int frameIndex) {
        rolls[frameIndex] + rolls[frameIndex + 1] == 10
    }


}
