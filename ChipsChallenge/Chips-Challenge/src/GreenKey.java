import javafx.scene.image.Image;

public class GreenKey extends Collectable{


    public GreenKey(Image image, int scale, Position position){
        super(image, scale, position);
    }
    @Override
    void addCollectable(Chip chip) {
        chip.addKey(Key.GREEN);
    }
}
