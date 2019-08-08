package marsrover;

public class Position {

    private final int x;
    private final int y;
    private final String direction;

    public Position(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Position addY(int modifier) {
        return new Position(x,y+modifier, direction);
    }

    public Position subtractY(int modifier) {
        return new Position(x,y-modifier, direction);
    }

    public Position setDirection(String direction) {
        return new Position(this.x,this.y, direction);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (x != position.x) return false;
        if (y != position.y) return false;
        return direction != null ? direction.equals(position.direction) : position.direction == null;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MarsRover{" +
                "x=" + x +
                ", y=" + y +
                ", direction='" + direction + '\'' +
                '}';
    }
}
