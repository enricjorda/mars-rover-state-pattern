package marsrover.direction;

import marsrover.MarsRover;

public class SouthState implements State {
    private final MarsRover marsRover;

    public SouthState(MarsRover marsRover) {

        this.marsRover = marsRover;
        this.marsRover.setPosition(marsRover.getPosition().setDirection("S"));
    }

    @Override
    public State execute(char command) {

        if(command == 'L') {
            return new EastState(marsRover);
        }

        if(command == 'R') {
            return new WestState(marsRover);
        }

        marsRover.setPosition(marsRover.getPosition().addY(-1));
        return new SouthState(marsRover);

    }
}
