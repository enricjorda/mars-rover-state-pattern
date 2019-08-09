package marsrover;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverLandStateShould {

    @Test
    void rover_should_land_facing_North() {
        MarsRover rover = new MarsRover(4,4, "N");
        assertEquals(new Position(4,4, "N"), rover.getPosition());
    }
}
