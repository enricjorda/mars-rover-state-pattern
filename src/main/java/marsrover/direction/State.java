package marsrover.direction;

public interface State {
    State action(char command);
}
