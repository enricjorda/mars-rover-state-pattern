package marsrover;

public class SouthDirection implements DirectionState {
    private final MarsRover marsRover;

    public SouthDirection(MarsRover marsRover) {

        this.marsRover = marsRover;
    }

    @Override
    public DirectionState action() {

        marsRover.setPosition(marsRover.getPosition().subtractY(1));
        return new SouthDirection(marsRover);
    }
}
