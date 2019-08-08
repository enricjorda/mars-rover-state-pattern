package marsrover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverContextShould {

    @Test
    void receiveLandingPosition() {

        MarsRover rover = new MarsRover(1, 1, "N");
        assertEquals(new Position(1, 1, "N"), rover.getPosition());
    }
}
