import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ChipsChallenge extends Application {

    private ImageView tileImage;
    private Image tileImageSrc;
    private int scale;
    private Scene scene;
    private BorderPane rootMain;
    private AnchorPane rootMap;
    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        startChipsChallenge(primaryStage, 0);
    }

    private void startChipsChallenge(Stage stage, int Level){
        this.stage = stage;
        this.rootMap = new AnchorPane();
        this.scale = 30;
        this.tileImageSrc = new Image("file:textures/BlankTile.png", scale, scale, true, true);
        ImageView[][] tileImages = new ImageView[25][25];
        for (int i = 0; i < 25; i++){
            for (int j = 0; j < 25; j++){
                tileImages[i][j] = new ImageView(tileImageSrc);
                tileImages[i][j].setX(i * scale);
                tileImages[i][j].setY(j * scale);
                rootMap.getChildren().add(tileImages[i][j]);
            }
        }
        this.rootMain = new BorderPane();
        this.rootMain.setCenter(this.rootMap);

        this.scene = new Scene(this.rootMain, 25 * scale *1.5, 25 * scale);
        this.stage.setTitle("Chip's Challenge!");
        this.stage.setScene(this.scene);

        this.stage.show();
    }

    public void ClearLevelOne(){

    }

    public static void main(String args[]){
        launch(args);
    }
}
