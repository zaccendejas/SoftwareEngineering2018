import javafx.scene.image.Image;

public class RedGate extends Obstacle{

    public RedGate(Image image, int scale, Position position){
        super(image, scale, position);
    }

    @Override
    boolean ClearObstacle(Chip chip) {
        return chip.removeKey(Key.RED);
    }
}
