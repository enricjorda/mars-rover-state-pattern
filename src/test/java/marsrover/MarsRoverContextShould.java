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

    @Test
    void move_two_position_to_North() {

        MarsRover rover = new MarsRover(1, 1, "N");
        rover.doAction("MM");

        assertEquals(new Position(1, 3, "N"), rover.getPosition());
    }

    @Test
    void move_one_position_to_South() {

        MarsRover rover = new MarsRover(3, 3, "S");
        rover.doAction("M");

        assertEquals(new Position(3, 2, "S"), rover.getPosition());
    }
}
