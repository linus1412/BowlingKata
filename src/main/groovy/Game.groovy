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
            if (rolls[frameIndex] == 10) {
                score += 10 + rolls[frameIndex+1] + rolls[frameIndex+2]
                frameIndex++
            } else if (isSpare(frameIndex)) { // spare
                score += 10 + rolls[frameIndex+2]
                frameIndex += 2
            } else {
                score += rolls[frameIndex] + rolls[frameIndex+1]
                frameIndex += 2
            }
        }
        score
    }

    private boolean isSpare(int frameIndex) {
        rolls[frameIndex] + rolls[frameIndex + 1] == 10
    }

}
