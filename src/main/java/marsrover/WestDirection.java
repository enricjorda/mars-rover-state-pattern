package marsrover;

public class WestDirection implements DirectionState {

    private final MarsRover marsRover;

    public WestDirection(MarsRover marsRover) {
        this.marsRover = marsRover;
        this.marsRover.setPosition(marsRover.getPosition().setDirection("W"));
    }

    @Override
    public DirectionState action(char command) {
        if(command == 'M') {
        }

        if(command == 'L') {
            return new SouthDirection(marsRover);
        }

        return null;
    }
}
