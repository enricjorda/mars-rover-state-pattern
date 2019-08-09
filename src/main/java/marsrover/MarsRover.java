package marsrover;

import marsrover.direction.*;

public class MarsRover {

    private Position position;

    private State currentState;

    public MarsRover(int x, int y, String direction) {

        position = new Position(x,y,direction);
        this.currentState = new LandingState(this);
        this.currentState = this.currentState.action(direction.charAt(0));
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void doAction(String commands) {

        for (char command: commands.toCharArray()) {
            this.currentState = this.currentState.action(command);
        }
    }
}
