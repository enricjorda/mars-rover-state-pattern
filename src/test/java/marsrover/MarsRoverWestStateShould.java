package marsrover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverWestStateShould {

    private MarsRover rover;

    @BeforeEach
    void initRover() {
        rover = new MarsRover(4, 4, "W");
    }

    @Test
    void receiveLandingPosition() {

        assertEquals(new Position(4, 4, "W"), rover.getPosition());
    }

    @ParameterizedTest
    @CsvSource({
            "M,       3, 4, W",
            "MM,      2, 4, W",
            "MMM,     1, 4, W",
            "L,       4, 4, S",
            "R,       4, 4, N",
    })
    void applyOneActionToNorth(String action, int x, int y, String direction) {

        rover.doAction(action);
        assertEquals(new Position(x, y, direction), rover.getPosition());
    }
}
