import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

enum Presence {
    NONE, COLLECTABLE, OBSTACLE;
}

enum TileType {
    LAND, WATER, GOAL;
}

public class Tile {
    private Image displayImage;
    private ImageView tileImage;
    private Presence object;
    private TileType type;
    private Position position;
    private Obstacle obstacle;
    private Collectable collectable;

    public Tile(Image tileImage, int scale, int x, int y, TileType type){
        this.displayImage = tileImage;
        this.tileImage = new ImageView(this.displayImage);
        this.tileImage.setX(x*scale);
        this.tileImage.setY(y*scale);
        this.object = Presence.NONE;
        this.type = type;
        this.position = new Position(x,y);
    }

    public boolean processLanding(Chip chip){
        return chip.attemptTerrain(this.type);
    }

    public Obstacle getObstacle(){return this.obstacle;}
    public Collectable getCollectable(){return this.collectable;}
    public Presence getPresence(){return this.object;}
    public Position getPosition(){return this.position;}
    public ImageView getTileImage(){return this.tileImage;}

    public void setObstacle(Obstacle obstacle){
        this.obstacle = obstacle;
    }

    public void setCollectable(Collectable collectable){
        this.collectable = collectable;
    }

    public void setPresence(Presence object){
        this.object =  object;
    }
}
