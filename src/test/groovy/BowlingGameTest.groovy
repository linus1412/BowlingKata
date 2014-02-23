public class BowlingGameTest extends GroovyTestCase {

    Game g

    void setUp() {
        g = new Game()
    }

    private void rollMany(times, pins) {
        times.times { num ->
            g.roll(pins)
        }
    }

    private void rollSpare() {
        g.roll(5)
        g.roll(5)
    }

    void testGutterGame() {
        rollMany(20, 0)

        assert 0 == g.score()
    }

    void testAllOnes() {
        rollMany(20, 1)

        assert 20 == g.score()
    }

    void testOneSpare() {
        rollSpare()
        g.roll 3
        rollMany(17,0)
        assert 16 == g.score()
    }

    void testOneStrike() {
        g.roll(10) // strike
        g.roll(3)
        g.roll(4)
        rollMany(16, 0)

        assert 24 == g.score()
    }


}
