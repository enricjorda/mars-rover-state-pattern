package marsrover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverSouthStateShould {

    private MarsRover rover;

    @BeforeEach
    void initRover() {
        rover = new MarsRover(4, 4, "S");
    }

    @Test
    void receiveLandingPosition() {

        assertEquals(new Position(4, 4, "S"), rover.getPosition());
    }

    @ParameterizedTest
    @CsvSource({
            "M,       4, 3, S",
            "MM,      4, 2, S",
            "MMM,     4, 1, S",
            "L,       4, 4, E",
            "R,       4, 4, W",
    })
    void applyOneActionToNorth(String action, int x, int y, String direction) {

        rover.doAction(action);
        assertEquals(new Position(x, y, direction), rover.getPosition());
    }

}
