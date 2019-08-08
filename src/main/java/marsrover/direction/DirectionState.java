package marsrover.direction;

public interface DirectionState {
    DirectionState action(char command);
}
