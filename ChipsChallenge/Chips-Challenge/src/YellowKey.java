import javafx.scene.image.Image;

public class YellowKey extends Collectable {

    public YellowKey(Image image, int scale, Position position){
        super(image, scale, position);
    }

    @Override
    void addCollectable(Chip chip) {
        chip.addKey(Key.YELLOW);
    }
}
