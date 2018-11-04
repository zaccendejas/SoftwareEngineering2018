import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

enum Transition{
    PROCEED, BLOCK, RESPAWN, NEXTLEVEL
}

public class Chip {
    private Inventory inventory;
    private Position startingPosition;
    private Position currentPosition;
    private Transition transition;
    private TileType currentTerrain;
    private Image[][] images;
    private ImageView chipImage;
    private int outfitSelector; // 0 indicates land, 1 indicates water
    private int directionSelector; // 0 indicates left, 1 indicates up, 2 indicates right, 3 indicates down
    private int scale;

    public Chip(Inventory inventory, Position start, int scale){
        this.inventory = inventory;
        this.startingPosition = new Position(start.getX(), start.getY());
        this.currentPosition = start;
        this.scale = scale;
        this.images = new Image[2][4];
        images[0][0] = new Image("file:textures/chipLeft.png", scale, scale, true, true);
        images[0][1] = new Image("file:textures/chipUp.png", scale, scale, true, true);
        images[0][2] = new Image("file:textures/chipRight.png", scale, scale, true, true);
        images[0][3] = new Image("file:textures/chipDown.png", scale, scale, true, true);
        images[1][0] = new Image("file:textures/SwimLeft.png", scale, scale, true, true);
        images[1][1] = new Image("file:textures/SwimUp.png", scale, scale, true, true);
        images[1][2] = new Image("file:textures/SwimRight.png", scale, scale, true, true);
        images[1][3] = new Image("file:textures/SwimDown.png", scale, scale, true, true);
        this.outfitSelector = 0;
        this.directionSelector = 3;
        this.chipImage = new ImageView(this.images[outfitSelector][directionSelector]);
        this.chipImage.setX(this.startingPosition.getX() * scale);
        this.chipImage.setY(this.startingPosition.getY() * scale);
        this.currentTerrain = TileType.LAND;
    }

    public Inventory getInventory(){return this.inventory;}

    public ImageView getImageView(){return this.chipImage;}

    public Transition getTransition(){return this.transition;}

    public Position getCurrentPosition(){return this.currentPosition;}

    public Position getStartingPosition(){return this.startingPosition;}

    public void setDirectionSelector(int direction){this.directionSelector = direction;}

    public boolean attemptTerrain(TileType terrain){
        if (terrain == TileType.LAND){
            if (currentTerrain != TileType.LAND){
                SwitchToLand();
            }
            this.transition = Transition.PROCEED;
            return true;
        }
        if (terrain == TileType.WATER){
            if (!this.inventory.hasFlippers()){
                Respawn();
                return false;
            }else{
                if (currentTerrain != TileType.WATER){
                    SwitchToWater();
                }
                this.transition = Transition.PROCEED;
                return true;
            }
        }
        if (terrain == TileType.GOAL){
            this.transition = Transition.NEXTLEVEL;
            return false;
        }
        return true;
    }

    public void move(int x, int y){
        this.chipImage.setImage(images[this.outfitSelector][this.directionSelector]);
        this.chipImage.setX(x * this.scale);
        this.chipImage.setY(y * this.scale);
        this.currentPosition.setX(x);
        this.currentPosition.setY(y);

    }

    public void addKey(Key key){
        this.inventory.addKey(key);
    }

    public void addFlippers(){
        this.inventory.addFlippers();
    }

    public boolean removeKey(Key key){
        if (this.inventory.removeKey(key)){
            this.transition = Transition.PROCEED;
            return true;
        }else{
            Block();
            return false;
        }
    }

    public boolean removeChallenge(int keysNeeded){
        if (this.inventory.removeChallenge(keysNeeded)){
            this.transition = Transition.PROCEED;
            return true;
        }else{
            Block();
            return  false;
        }
    }

    public void Block(){
        this.transition = Transition.BLOCK;
    }

    public void Respawn(){
        this.transition = Transition.RESPAWN;
        this.directionSelector = 3;
        this.outfitSelector = 0;
    }

    private void SwitchToLand(){
        this.currentTerrain = TileType.LAND;
        this.outfitSelector = 0;
    }

    private void SwitchToWater(){
        this.currentTerrain = TileType.WATER;
        this.outfitSelector = 1;
    }



}
