import javafx.scene.image.Image;

public class RedKey extends Collectable{

    public RedKey(Image image, int scale, Position position){
        super(image, scale, position);
    }
    @Override
    void addCollectable(Chip chip) {
        chip.addKey(Key.RED);
    }
}
