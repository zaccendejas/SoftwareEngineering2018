import java.util.ArrayList;

public class LevelBuilder {

    private IChipBuilder[] chipBuilder;
    private ITileBuilder[] tileBuilder;
    private ICollectableBuilder[] collectableBuilder;
    private IObstacleBuilder[] obstacleBuilder;
    private Tile[][] tileMap;
    private ArrayList<Collectable> collectables;
    private ArrayList<Obstacle> obstacles;
    private Chip chip;

    public LevelBuilder(){
        this.chipBuilder = new IChipBuilder[2];
        this.chipBuilder[0] = new LevelOneChipBuilder();
        this.chipBuilder[1] = new LevelTwoChipBuilder();

        this.tileBuilder = new ITileBuilder[2];
        this.tileBuilder[0] = new LevelOneTileBuilder();
        this.tileBuilder[1] = new LevelTwoTileBuilder();

        this.collectableBuilder = new ICollectableBuilder[2];
        this.collectableBuilder[0] = new LevelOneCollectableBuilder();
        this.collectableBuilder[1] = new LevelTwoCollectableBuilder();

        this.obstacleBuilder = new IObstacleBuilder[2];
        this.obstacleBuilder[0] = new LevelOneObstacleBuilder();
        this.obstacleBuilder[1] = new LevelTwoObstacleBuilder();
    }

    public void BuildLevel(int level, int scale){
        this.tileMap = tileBuilder[level].buildTiles(scale);
        this.collectables = collectableBuilder[level].buildCollectables(this.tileMap, scale);
        this.obstacles = obstacleBuilder[level].buildObstacles(this.tileMap, scale);
        this.chip = chipBuilder[level].buildChip(scale);
    }

    public Tile[][] getTileMap() {
        return this.tileMap;
    }

    public ArrayList<Collectable> getCollectables(){
        return this.collectables;
    }

    public ArrayList<Obstacle> getObstacles(){
        return this.obstacles;
    }

    public Chip getChip(){
        return this.chip;
    }

    public void clear(){
        this.tileMap = null;
        this.collectables = null;
        this.obstacles = null;
        this.chip = null;
    }

    public Inventory getInventory(){
        return this.chip.getInventory();
    }
}
