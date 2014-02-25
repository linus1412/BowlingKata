package loto


class MachineTest extends GroovyTestCase {

    void testPickBall() {

        def machine = new Machine()

        assert machine.pickBall() != null

    }

    void testPickMultipleBalls() {

        def machine = new Machine()

        def pickedBalls = []
        (1..49).each {
            def ball = machine.pickBall()
            assert !pickedBalls.contains(ball)
            pickedBalls << ball
        }
        assert 0 == machine.balls.size()

    }

    void testHasAllBalls() {
        def machine = new Machine()
        assert 49 == machine.balls.size()
    }


}
