import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

abstract class Obstacle {
    private Image displayImage;
    private ImageView obstacleImage;
    private Position position;

    public Obstacle(){}

    public Obstacle(String image, int scale, Position position){
        this.position = position;
        this.displayImage = new Image(image, scale, scale, true, true);
        this.obstacleImage = new ImageView(displayImage);
        this.obstacleImage.setX(this.position.getX() * scale);
        this.obstacleImage.setY(this.position.getY() * scale);
    }

    abstract boolean ClearObstacle(Chip chip);
}
