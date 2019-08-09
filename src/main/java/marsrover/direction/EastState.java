package marsrover.direction;

import marsrover.MarsRover;

public class EastState implements State {

    private final MarsRover marsRover;

    public EastState(MarsRover marsRover) {
        this.marsRover = marsRover;
        this.marsRover.setPosition(marsRover.getPosition().setDirection("E"));
    }

    @Override
    public State action(char command) {

        if(command == 'L') {
            return new NorthState(marsRover);
        }

        if(command == 'R') {
            return new SouthState(marsRover);
        }

        marsRover.setPosition(marsRover.getPosition().addX(1));
        return new EastState(marsRover);
    }
}
