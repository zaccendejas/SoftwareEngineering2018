import javafx.scene.image.Image;

public class YellowGate extends Obstacle{

    public YellowGate(Image image, int scale, Position position){
        super(image, scale, position);
    }

    @Override
    boolean ClearObstacle(Chip chip) {
        return chip.removeKey(Key.YELLOW);
    }
}
