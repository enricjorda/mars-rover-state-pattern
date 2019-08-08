package marsrover;

public class MarsRover {


    private Position position;

    private DirectionState currentState;
    /*
    private State currentState;
    private State north = new NorthDirection();
    private State south = ....;
    private State east;
    private State west;
     */

    public MarsRover(int x, int y, String direction) {

        position = new Position(x,y,direction);

        if(direction.equals("N")) this.currentState = new NorthDirection(this);
        if(direction.equals("S")) this.currentState = new SouthDirection(this);
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void doAction(String commands) {

        for (char command: commands.toCharArray()) {
            if(command == 'M'){
                this.currentState.action();
            }
        }
    }
}
