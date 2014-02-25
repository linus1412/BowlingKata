package loto

class Machine {

    private Set<Ball> _balls = [] as Set<Ball>

    {
        (1..49).each {
            _balls << new Ball(number:it)
        }
    }

    Ball pickBall() {
        _balls.remove(new Ball(((int)Math.random() * 49) + 1 ))
    }

    Set<Ball> getBalls() {
        _balls.asImmutable()
    }

}
