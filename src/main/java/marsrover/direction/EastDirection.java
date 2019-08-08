package marsrover.direction;

import marsrover.MarsRover;

public class EastDirection implements DirectionState {

    private final MarsRover marsRover;

    public EastDirection(MarsRover marsRover) {
        this.marsRover = marsRover;
        this.marsRover.setPosition(marsRover.getPosition().setDirection("E"));
    }

    @Override
    public DirectionState action(char command) {

        if(command == 'L') {
            return new NorthDirection(marsRover);
        }

        if(command == 'R') {
            return new SouthDirection(marsRover);
        }

        marsRover.setPosition(marsRover.getPosition().addX(1));
        return new EastDirection(marsRover);
    }
}
