public class MarsRover {

    int[] position;
    Direction direction;

    public MarsRover() {
        this.position = new int[]{1,1};
        this.direction = Direction.NORTH;
    }

    public MarsRover(int x, int y, Direction direction) {
        this.position = new int[]{x,y};
        this.direction = direction;
    }

    public int[] getCurrentPosition() {
        return this.position;
    }

    public Direction getCurrentDirection() {
        return this.direction;
    }

    public void turn(char orientation) {
        switch (orientation) {
            case 'L':
                this.direction = this.direction.turnLeft();
                break;
            case 'R':
                this.direction = this.direction.turnRight();
                break;
            default:
                break;
        }
    }
}
