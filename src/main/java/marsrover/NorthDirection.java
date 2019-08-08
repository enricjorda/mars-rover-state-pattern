package marsrover;

public class NorthDirection implements DirectionState {

    private final MarsRover marsRover;

    public NorthDirection(MarsRover marsRover) {

        this.marsRover = marsRover;
    }


    @Override
    public void move() {
        marsRover.setPosition(marsRover.getPosition().addY(1));
    }
}
