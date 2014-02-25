package loto

class BallTest extends GroovyTestCase {

    void testEquals() {
        def ball_a = new Ball(1)
        def ball_b = new Ball(1)

        assert ball_a == ball_b
    }

    void testNotEquals() {
        def ball_a = new Ball(1)
        def ball_b = new Ball(2)

        assert ball_a != ball_b
    }

}
