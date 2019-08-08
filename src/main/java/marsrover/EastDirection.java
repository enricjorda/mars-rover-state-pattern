package marsrover;

public class EastDirection implements DirectionState {

    private final MarsRover marsRover;

    public EastDirection(MarsRover marsRover) {
        this.marsRover = marsRover;
        this.marsRover.setPosition(marsRover.getPosition().setDirection("E"));
    }

    @Override
    public DirectionState action(char command) {
        if(command == 'M') {
        }

        if(command == 'L') {
            return new NorthDirection(marsRover);
        }

        return null;
    }
}
