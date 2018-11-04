import javafx.scene.image.Image;

public class BlueKey extends Collectable {

    public BlueKey(Image image, int scale, Position position){
        super(image, scale, position);
    }
    @Override
    void addCollectable(Chip chip) {
        chip.addKey(Key.BLUE);
    }
}
