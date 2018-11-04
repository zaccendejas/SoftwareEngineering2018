import javafx.scene.image.Image;

public class BlueGate extends Obstacle{

    public BlueGate(Image image, int scale, Position position){
        super(image, scale, position);
    }

    @Override
    boolean ClearObstacle(Chip chip) {
        return chip.removeKey(Key.BLUE);
    }
}
