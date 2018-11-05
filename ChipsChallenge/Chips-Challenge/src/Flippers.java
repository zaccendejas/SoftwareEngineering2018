import javafx.scene.image.Image;

public class Flippers extends Collectable{

    public Flippers(Image image, int scale, Position position){ super(image, scale, position); }
    @Override
    void addCollectable(Chip chip) {
        chip.addFlippers();
    }
}
