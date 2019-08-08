package marsrover;

public class SouthDirection implements DirectionState {
    private final MarsRover marsRover;

    public SouthDirection(MarsRover marsRover) {

        this.marsRover = marsRover;
        this.marsRover.setPosition(marsRover.getPosition().setDirection("S"));
    }

    @Override
    public DirectionState action(char command) {

        marsRover.setPosition(marsRover.getPosition().subtractY(1));
        return new SouthDirection(marsRover);
    }
}
