package marsrover;

public class SouthDirection implements DirectionState {
    private final MarsRover marsRover;

    public SouthDirection(MarsRover marsRover) {

        this.marsRover = marsRover;
    }

    @Override
    public void move() {
        marsRover.setPosition(marsRover.getPosition().subtractY(1));
    }
}
