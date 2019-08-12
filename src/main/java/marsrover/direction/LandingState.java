package marsrover.direction;

import marsrover.MarsRover;

public class LandingState implements State {

    private final MarsRover marsRover;

    public LandingState(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public State execute(char direction) {

        if(direction == 'N') return new NorthState(this.marsRover);
        if(direction == 'S') return new SouthState(this.marsRover);
        if(direction == 'E') return new EastState(this.marsRover);
        return new WestState(this.marsRover);
    }

}
