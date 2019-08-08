package marsrover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverContextShould {

    @Test
    void receiveLandingPosition() {

        MarsRover rover = new MarsRover(1, 1, "N");
        assertEquals(new Position(1, 1, "N"), rover.getPosition());
    }

    @Test
    void move_one_position_to_North() {

        MarsRover rover = new MarsRover(1, 1, "N");
        rover.doAction("M");

        assertEquals(new Position(1, 2, "N"), rover.getPosition());
    }
}
