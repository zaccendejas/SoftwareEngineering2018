import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChipsChallenge extends Application {

    private ImageView tileImage;
    private Image tileImageSrc;
    private int scale;
    private Scene scene;
    private BorderPane rootMain;
    private AnchorPane rootMap;
    private VBox       rootInventory;
    private Stage stage;

    private GameController controller;
    private LevelDisplay   display;
    private LevelBuilder   levelBuilder;

    @Override
    public void start(Stage primaryStage) throws Exception {
        startChipsChallenge(primaryStage, 0);
    }

    private void startChipsChallenge(Stage stage, int level){
        this.stage = stage;
        this.rootMap = new AnchorPane();
        this.rootInventory = new VBox();
        this.rootInventory.setSpacing(5);
        this.scale = 30;
        this.rootMain = new BorderPane();
        this.levelBuilder = new LevelBuilder();
        this.levelBuilder.BuildLevel(level, scale);
        this.display = new LevelDisplay(this.levelBuilder.getTileMap(), this.levelBuilder.getCollectables(), this.levelBuilder.getObstacles(), this.levelBuilder.getChip(), scale);
        this.controller = new GameController(this.levelBuilder.getTileMap(), this.levelBuilder.getCollectables(), this.levelBuilder.getObstacles(), this.levelBuilder.getChip(), this.display, this);
        this.display.Display(this.rootMap, this.rootInventory);
        this.rootMain.setCenter(this.rootMap);
        this.rootMain.setRight(this.rootInventory);

        this.scene = new Scene(this.rootMain, 25 * scale *1.5, 25 * scale);
        this.scene.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> {
            switch (key.getCode()){
                case UP:
                    this.controller.AttemptUp();
                    break;
                case DOWN:
                    this.controller.AttemptDown();
                    break;
                case LEFT:
                    this.controller.AttemptLeft();
                    break;
                case RIGHT:
                    this.controller.AttemptRight();
                    break;
                case ESCAPE:
                    Platform.exit();
                    System.exit(0);
            }
        });
        this.stage.setTitle("Chip's Challenge!");
        this.stage.setScene(this.scene);

        this.stage.show();
    }

    public void ClearLevelOne(){
        this.levelBuilder.clear();
        this.rootMap.getChildren().removeAll();
        this.rootInventory.getChildren().clear();
        this.levelBuilder.BuildLevel(1, this.scale);
        this.display = new LevelDisplay(this.levelBuilder.getTileMap(), this.levelBuilder.getCollectables(), this.levelBuilder.getObstacles(), this.levelBuilder.getChip(), this.scale);
        this.controller = new GameController(this.levelBuilder.getTileMap(), this.levelBuilder.getCollectables(), this.levelBuilder.getObstacles(), this.levelBuilder.getChip(), this.display, this);
        this.display.Display(this.rootMap, this.rootInventory);
    }

    public static void main(String args[]){
        launch(args);
    }
}
