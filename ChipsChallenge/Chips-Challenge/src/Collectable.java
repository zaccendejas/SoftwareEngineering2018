import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

abstract class Collectable {
    private Image displayImage;
    private ImageView collectableImage;
    private Position position;

    public Collectable(){}

    public Collectable(Image image, int scale, Position position){
        this.position = position;
        this.displayImage = image;
        this.collectableImage = new ImageView(displayImage);
        this.collectableImage.setX(this.position.getX() * scale);
        this.collectableImage.setY(this.position.getY() * scale);
    }

    public ImageView getImageView(){return this.collectableImage;}

    abstract void addCollectable(Chip chip);
}
