import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class LevelDisplay implements Observer {
    private AnchorPane mapRoot;
    private VBox inventoryRoot;

    private Tile[][] tileMap;
    private Inventory inventory;
    private Chip chip;
    private ArrayList<Collectable> collectables;
    private ArrayList<Obstacle> obstacles;

    private HBox blueRoot;
    private HBox greenRoot;
    private HBox yellowRoot;
    private HBox redRoot;
    private HBox challengeRoot;
    private HBox flipperRoot;
    private Text inventoryTitle;
    private int greenCount;
    private int blueCount;
    private int yellowCount;
    private int redCount;
    private int challengeCount;
    private boolean hasFippers;
    private Text greenText;
    private Text blueText;
    private Text yellowText;
    private Text redText;
    private Text challengeText;
    private Text fippersText;
    private ImageView blueKey;
    private ImageView greenKey;
    private ImageView yellowKey;
    private ImageView redKey;
    private ImageView challengeKey;
    private ImageView flippers;

    public LevelDisplay(Tile[][] tileMap, ArrayList<Collectable> collectables, ArrayList<Obstacle> obstacles, Chip chip, int scale){
        this.tileMap = tileMap;
        this.collectables = collectables;
        this.obstacles = obstacles;
        this.chip = chip;
        this.inventory = chip.getInventory();
        this.inventory.addObserver(this);
        this.blueRoot = new HBox();
        this.greenRoot = new HBox();
        this.yellowRoot = new HBox();
        this.redRoot = new HBox();
        this.challengeRoot = new HBox();
        this.flipperRoot = new HBox();
        this.inventoryTitle = new Text();
        this.inventoryTitle.setText("Inventory");

        this.blueKey = new ImageView(new Image("file:textures/blueKey.png", scale, scale, true, true));
        this.blueCount = this.inventory.getBlueKeys();
        this.blueText = new Text();
        this.blueText.setText("x0");
        this.blueRoot.setSpacing(10);
        this.blueRoot.getChildren().addAll(this.blueKey, this.blueText);

        this.greenKey = new ImageView(new Image("file:textures/greenKey.png", scale, scale, true, true));
        this.greenCount = this.inventory.getGreenKeys();
        this.greenText = new Text();
        this.greenText.setText("x0");
        this.greenRoot.setSpacing(10);
        this.greenRoot.getChildren().addAll(this.greenKey, this.greenText);

        this.yellowKey = new ImageView(new Image("file:textures/yellowKey.png", scale, scale, true, true));
        this.yellowCount = this.inventory.getYellowKeys();
        this.yellowText = new Text();
        this.yellowText.setText("x0");
        this.yellowRoot.setSpacing(10);
        this.yellowRoot.getChildren().addAll(this.yellowKey, this.yellowText);

        this.redKey = new ImageView(new Image("file:textures/redKey.png", scale, scale, true, true));
        this.redCount = this.inventory.getRedKeys();
        this.redText = new Text();
        this.redText.setText("x0");
        this.redRoot.setSpacing(10);
        this.redRoot.getChildren().addAll(this.redKey, this.redText);

        this.challengeKey = new ImageView(new Image("file:textures/chipItem.png", scale, scale, true, true));
        this.challengeCount = this.inventory.getChallengeKeys();
        this.challengeText = new Text();
        this.challengeText.setText("x0");
        this.challengeRoot.setSpacing(10);
        this.challengeRoot.getChildren().addAll(this.challengeKey, this.challengeText);

        this.flippers = new ImageView(new Image("file:textures/Flippers.png", scale, scale, true, true));
        this.hasFippers = this.inventory.hasFlippers();
        this.fippersText = new Text();
        this.fippersText.setText("Unequipped");
        this.flipperRoot.setSpacing(5);
        this.flipperRoot.getChildren().addAll(this.flippers, this.fippersText);

    }

    public void Display(AnchorPane mapRoot, VBox inventoryRoot){
        this.mapRoot = mapRoot;
        this.inventoryRoot = inventoryRoot;
        for (int y = 0; y < 25; y++){
            for (int x = 0; x < 25; x++){
                mapRoot.getChildren().add(this.tileMap[y][x].getTileImage());
            }
        }

        for (Collectable collectable: this.collectables){
            mapRoot.getChildren().add(collectable.getImageView());
        }

        for (Obstacle obstacle: this.obstacles){
            mapRoot.getChildren().add(obstacle.getImageView());
        }

        mapRoot.getChildren().add(this.chip.getImageView());
        inventoryRoot.getChildren().addAll(this.inventoryTitle, this.blueRoot, this.greenRoot, this.yellowRoot, this.redRoot, this.challengeRoot, this.flipperRoot);
    }

    public void RemoveCollectable(Collectable collectable){
        mapRoot.getChildren().remove(collectable.getImageView());
    }

    public void RemoveGate(Obstacle gate){
        mapRoot.getChildren().remove(gate.getImageView());
    }

    @Override
    public void update(Observable o, Object arg) {
        String blueText = "x" + this.inventory.getBlueKeys();
        this.blueText.setText(blueText);

        String greenText = "x" + this.inventory.getGreenKeys();
        this.greenText.setText(greenText);

        String yellowText = "x"  + this.inventory.getYellowKeys();
        this.yellowText.setText(yellowText);

        String redText = "x" + this.inventory.getRedKeys();
        this.redText.setText(redText);

        String challengeText = "x" + this.inventory.getChallengeKeys();
        this.challengeText.setText(challengeText);

        if (this.inventory.hasFlippers()){
            this.fippersText.setText("Equipped");
        }else{
            this.fippersText.setText("Unequipped");
        }

    }
}
