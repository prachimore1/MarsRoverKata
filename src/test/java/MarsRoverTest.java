import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void roverDefaultInitializedCoordinates() {
        final int[] expectedCoordinates = {1, 1};
        MarsRover rover = new MarsRover();
        assertArrayEquals(rover.getCurrentPosition(), expectedCoordinates);
    }

    @Test
    public void roverDefaultInitializedDirection() {
        MarsRover rover = new MarsRover();
        assertEquals(rover.getCurrentDirection(), Direction.NORTH);
    }

    @Test
    public void roverCustomInitializedCoordinates() {
        final int[] expectedCoordinates = {3, 4};
        MarsRover rover = new MarsRover(3,4,Direction.NORTH);
        assertArrayEquals(rover.getCurrentPosition(), expectedCoordinates);
    }

    @Test
    public void roverCustomInitializedDirection() {
        final int[] expectedCoordinates = {3, 4};
        MarsRover rover = new MarsRover(3,4, Direction.WEST);
        assertArrayEquals(rover.getCurrentPosition(), expectedCoordinates);
    }

    @Test
    public void turnRoverLeft() {
        MarsRover rover = new MarsRover(3,4, Direction.WEST);

        rover.turn('L');

        assertEquals(rover.getCurrentDirection(), Direction.SOUTH);
    }

    @Test
    public void turnRoverRight() {
        MarsRover rover = new MarsRover(3,4, Direction.WEST);

        rover.turn('R');

        assertEquals(rover.getCurrentDirection(), Direction.NORTH);
    }

    @Test
    public void turnRoverLeftTwice() {
        MarsRover rover = new MarsRover(3,4, Direction.EAST);

        rover.turn('L');
        rover.turn('L');

        assertEquals(rover.getCurrentDirection(), Direction.WEST);
    }

    @Test
    public void turnRoverRightRightLeftRight() {
        MarsRover rover = new MarsRover(3,4, Direction.NORTH);

        rover.turn('R');
        rover.turn('R');
        rover.turn('L');
        rover.turn('R');

        assertEquals(rover.getCurrentDirection(), Direction.SOUTH);
    }

}