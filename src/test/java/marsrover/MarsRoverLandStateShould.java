package marsrover;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverLandStateShould {

    @Test
    void rover_should_land_facing_North() {
        MarsRover rover = new MarsRover(4,4, "N");
        assertEquals(new Position(4,4, "N"), rover.getPosition());
    }

    @Test
    void rover_should_land_facing_West() {
        MarsRover rover = new MarsRover(4,4, "W");
        assertEquals(new Position(4,4, "W"), rover.getPosition());
    }

    @Test
    void rover_should_land_facing_East() {
        MarsRover rover = new MarsRover(4,4, "E");
        assertEquals(new Position(4,4, "E"), rover.getPosition());
    }

    @Test
    void rover_should_land_facing_South() {
        MarsRover rover = new MarsRover(4,4, "S");
        assertEquals(new Position(4,4, "S"), rover.getPosition());
    }
}
