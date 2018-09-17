package Homework4;

import javafx.application.*;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class OceanExplorer extends Application {

	ImageView shipImageView;
	Image shipImage;
	AnchorPane root;
	int scale;
	OceanMap map;
	Ship ship;
	Scene scene;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		root = new AnchorPane();
		scale = 30;
		
		map = new OceanMap();
		map.drawMap(root.getChildren(), scale);
		
		ship = new Ship();
		shipImage = new Image("images\\ColumbusShip.png",50,50,true,true);
		shipImageView = new ImageView(shipImage);
		shipImageView.setX(ship.getShipLocation().x * scale);
		shipImageView.setY(ship.getShipLocation().y * scale);
		root.getChildren().add(shipImageView);
		
		scene = new Scene(root, 25*scale, 25*scale);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Homework4");
		primaryStage.show();
		
		startSailing();
		
		
	}
	
	public void startSailing() {
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent ke) {
				// TODO Auto-generated method stub
				int x = ship.getShipLocation().x;
				int y = ship.getShipLocation().y;
				switch(ke.getCode()) {
				case RIGHT:
					if (x < 25) {
						ship.setX(x+1);
						// Possibly clear screen
						shipImageView.setX(ship.getShipLocation().x * scale);
						root.getChildren().add(shipImageView);
					}
					break;
				case LEFT:
					if (x > 0) {
						ship.setX(x-1);
						// Possibly clear screen
						shipImageView.setX(ship.getShipLocation().x * scale);
						root.getChildren().add(shipImageView);
					}
					break;
				case UP:
					if (y > 0) {
						ship.setY(y-1);
						// Possibly clear screen
						shipImageView.setY(ship.getShipLocation().y * scale);
						root.getChildren().add(shipImageView);
					}
					break;
				case DOWN:
					if (y < 25) {
						ship.setY(y+1);
						// Possibly clear screen
						shipImageView.setY(ship.getShipLocation().y * scale);
						root.getChildren().add(shipImageView);
					}
					break;
				default:
					break;
				}
			}
			
		});
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
