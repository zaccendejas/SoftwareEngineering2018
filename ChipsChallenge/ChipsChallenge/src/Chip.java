import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

enum Direction{
    LEFT, UP, RIGHT, DOWN
}
enum Transition{
    PROCEED, BLOCK, RESPAWN, NEXTLEVEL
}

public class Chip {
    private Inventory inventory;
    private Position startingPosition;
    private Position currentPosition;
    private Direction direction;
    private Transition transition;
    private TileType currentTerrain;
    private Image[][] images;
    private ImageView chipImage;
    private int outfitSelector;
    private int directionSelector;

    public Chip(Inventory inventory, Position start, int scale){
        this.inventory = inventory;
        this.startingPosition = start;
        this.currentPosition = start;
        this.images = new Image[2][4];
        images[0][0] = new Image("textures\\chipLeft.png", scale, scale, true, true);
        images[0][1] = new Image("textures\\chipUp.png", scale, scale, true, true);
        images[0][2] = new Image("textures\\chipRight.png", scale, scale, true, true);
        images[0][3] = new Image("textures\\chipDown.png", scale, scale, true, true);
        images[1][0] = new Image("textures\\SwimLeft.png", scale, scale, true, true);
        images[1][1] = new Image("textures\\SwimUp.png", scale, scale, true, true);
        images[1][2] = new Image("textures\\SwimRight.png", scale, scale, true, true);
        images[1][3] = new Image("textures\\SwimDown.png", scale, scale, true, true);
        this.outfitSelector = 0;
        this.directionSelector = 3;
        this.chipImage = new ImageView(this.images[outfitSelector][directionSelector]);
        this.currentTerrain = TileType.LAND;
    }

    public void attemptTerrain(TileType terrain){
        if (terrain == TileType.LAND){
            if (currentTerrain != TileType.LAND){
                SwitchToLand();
            }
            this.transition = Transition.PROCEED;
        }
        if (terrain == TileType.WATER){
            if (!this.inventory.hasFlippers()){
                Respawn();
            }else{
                if (currentTerrain != TileType.WATER){
                    SwitchToWater();
                }
                this.transition = Transition.PROCEED;
            }
        }
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
