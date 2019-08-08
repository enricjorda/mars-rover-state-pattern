package marsrover.direction;

import marsrover.MarsRover;

public class SouthDirection implements DirectionState {
    private final MarsRover marsRover;

    public SouthDirection(MarsRover marsRover) {

        this.marsRover = marsRover;
        this.marsRover.setPosition(marsRover.getPosition().setDirection("S"));
    }

    @Override
    public DirectionState action(char command) {

        if(command == 'L') {
            return new EastDirection(marsRover);
        }

        if(command == 'R') {
            return new WestDirection(marsRover);
        }

        marsRover.setPosition(marsRover.getPosition().addY(-1));
        return new SouthDirection(marsRover);

    }
}
