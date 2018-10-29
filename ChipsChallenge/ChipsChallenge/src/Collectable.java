import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

abstract class Collectable {
    private Image displayImage;
    private ImageView collectableImage;
    private Position position;

    public Collectable(){}

    public Collectable(String image, int scale, Position position){
        this.position = position;
        this.displayImage = new Image(image, scale, scale, true, true);
        this.collectableImage = new ImageView(displayImage);
        this.collectableImage.setX(this.position.getX() * scale);
        this.collectableImage.setY(this.position.getY() * scale);
    }

    abstract void addCollectable(Chip chip);
}
