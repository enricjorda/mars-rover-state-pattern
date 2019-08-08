package marsrover.direction;

import marsrover.MarsRover;

public class WestDirection implements DirectionState {

    private final MarsRover marsRover;

    public WestDirection(MarsRover marsRover) {
        this.marsRover = marsRover;
        this.marsRover.setPosition(marsRover.getPosition().setDirection("W"));
    }

    @Override
    public DirectionState action(char command) {

        if(command == 'L') {
            return new SouthDirection(marsRover);
        }

        if(command == 'R') {
            return new NorthDirection(marsRover);
        }

        marsRover.setPosition(marsRover.getPosition().addX(-1));
        return new WestDirection(marsRover);

    }
}
