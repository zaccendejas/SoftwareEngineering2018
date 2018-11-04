import java.util.ArrayList;

public interface IObstacleBuilder {
    ArrayList<Obstacle> buildObstacles(Tile[][] tileMap, int scale);
}
