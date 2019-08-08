package marsrover;

public interface DirectionState {
    DirectionState action(char command);
}
