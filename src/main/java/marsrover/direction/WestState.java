package marsrover.direction;

import marsrover.MarsRover;

public class WestState implements State {

    private final MarsRover marsRover;

    public WestState(MarsRover marsRover) {
        this.marsRover = marsRover;
        this.marsRover.setPosition(marsRover.getPosition().setDirection("W"));
    }

    @Override
    public State action(char command) {

        if(command == 'L') {
            return new SouthState(marsRover);
        }

        if(command == 'R') {
            return new NorthState(marsRover);
        }

        marsRover.setPosition(marsRover.getPosition().addX(-1));
        return new WestState(marsRover);

    }
}
