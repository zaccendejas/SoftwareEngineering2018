import javafx.scene.image.Image;

public class GreenGate extends Obstacle{

    public GreenGate(Image image, int scale, Position position){
        super(image, scale, position);
    }

    @Override
    boolean ClearObstacle(Chip chip) {
        return chip.removeKey(Key.GREEN);

    }
}
