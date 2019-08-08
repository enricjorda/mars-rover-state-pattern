package marsrover;

import java.util.Objects;

public class MarsRover {

    private Position position;

    /*
    private State currentState;
    private State north = new NorthDirection();
    private State south = ....;
    private State east;
    private State west;
     */

    public MarsRover(int x, int y, String direction) {

        position = new Position(x,y,direction);
    }

    public Position getPosition() {
        return position;
    }

    public void doAction(String m) {
    }
}
