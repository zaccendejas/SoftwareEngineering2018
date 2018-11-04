import javafx.scene.image.Image;

public class Wall extends Obstacle{

    public Wall(Image image, int scale, Position position){
        super(image, scale, position);
    }
    @Override
    boolean ClearObstacle(Chip chip) {
        chip.Block();
        return false;
    }
}
