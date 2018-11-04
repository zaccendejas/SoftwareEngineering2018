import java.util.ArrayList;

public interface ICollectableBuilder {
    ArrayList<Collectable> buildCollectables(Tile[][] tileMap, int scale);
}
