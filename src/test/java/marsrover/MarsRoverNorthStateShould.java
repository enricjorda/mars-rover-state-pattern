package marsrover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverNorthStateShould {

    private MarsRover rover;

    @BeforeEach
    void initRover() {
        rover = new MarsRover(4, 4, "N");
    }

    @Test
    void receiveLandingPosition() {

        assertEquals(new Position(4, 4, "N"), rover.getPosition());
    }

    @ParameterizedTest
    @CsvSource({
            "M,       4, 5, N",
            "MM,      4, 6, N",
            "MMM,     4, 7, N",
            "L,       4, 4, W",
            "R,       4, 4, E",
    })
    void applyOneActionToNorth(String action, int x, int y, String direction) {

        rover.doAction(action);
        assertEquals(new Position(x, y, direction), rover.getPosition());
    }

}
