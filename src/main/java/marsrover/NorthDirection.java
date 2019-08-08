package marsrover;

public class NorthDirection implements DirectionState {

    private final MarsRover marsRover;

    public NorthDirection(MarsRover marsRover) {
        this.marsRover = marsRover;
        this.marsRover.setPosition(marsRover.getPosition().setDirection("N"));
    }


    @Override
    public DirectionState action(char command) {
        if(command == 'M') {
            marsRover.setPosition(marsRover.getPosition().addY(1));
            return new NorthDirection(marsRover);
        }

        if(command == 'L') {
            return new WestDirection(marsRover);
        }

        if(command == 'E') {
            return new EastDirection(marsRover);
        }

        return null;
    }
}
