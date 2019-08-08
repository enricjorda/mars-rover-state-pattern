package marsrover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverEastStateShould {

    private MarsRover rover;

    @BeforeEach
    void initRover() {
        rover = new MarsRover(4, 4, "E");
    }

    @Test
    void receiveLandingPosition() {

        assertEquals(new Position(4, 4, "E"), rover.getPosition());
    }

    @ParameterizedTest
    @CsvSource({
            "M,       5, 4, E",
            "MM,      6, 4, E",
            "MMM,     7, 4, E",
            "L,       4, 4, N",
            "R,       4, 4, S",
    })
    void applyOneActionToNorth(String action, int x, int y, String direction) {

        rover.doAction(action);
        assertEquals(new Position(x, y, direction), rover.getPosition());
    }
}
