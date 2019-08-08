package marsrover;

import marsrover.direction.*;

public class MarsRover {


    private Position position;

    private DirectionState currentState;

    public MarsRover(int x, int y, String direction) {

        position = new Position(x,y,direction);

        if(direction.equals("N")) this.currentState = new NorthDirection(this);
        if(direction.equals("S")) this.currentState = new SouthDirection(this);
        if(direction.equals("E")) this.currentState = new EastDirection(this);
        if(direction.equals("W")) this.currentState = new WestDirection(this);
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
