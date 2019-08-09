package marsrover.direction;

import marsrover.MarsRover;

public class NorthState implements State {

    private final MarsRover marsRover;

    public NorthState(MarsRover marsRover) {
        this.marsRover = marsRover;
        this.marsRover.setPosition(marsRover.getPosition().setDirection("N"));
    }


    @Override
    public State action(char command) {

        if(command == 'L') {
            return new WestState(marsRover);
        }

        if(command == 'R') {
            return new EastState(marsRover);
        }

        marsRover.setPosition(marsRover.getPosition().addY(1));
        return new NorthState(marsRover);
    }
}
