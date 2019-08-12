package marsrover.direction;

public interface State {
    State execute(char command);
}
