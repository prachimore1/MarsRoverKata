import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectionTest {

    @Test
    public void LeftOfNorthIsWest() {
        assertEquals(Direction.WEST, Direction.NORTH.turnLeft());
    }

    @Test
    public void RightOfNorthIsEast() {
        assertEquals(Direction.EAST, Direction.NORTH.turnRight());
    }

    @Test
    public void LeftOfSouthIsEast() {
        assertEquals(Direction.EAST, Direction.SOUTH.turnLeft());
    }

    @Test
    public void RightOfSouthIsEast() {
        assertEquals(Direction.WEST, Direction.SOUTH.turnRight());
    }

    @Test
    public void LeftOfEastIsNorth() {
        assertEquals(Direction.NORTH, Direction.EAST.turnLeft());
    }

    @Test
    public void RightOfEastIsSouth() {
        assertEquals(Direction.SOUTH, Direction.EAST.turnRight());
    }

    @Test
    public void LeftOfWestIsSouth() {
        assertEquals(Direction.SOUTH, Direction.WEST.turnLeft());
    }

    @Test
    public void RightOfWestIsNorth() {
        assertEquals(Direction.NORTH, Direction.WEST.turnRight());
    }
}