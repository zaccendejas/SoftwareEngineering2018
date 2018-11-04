import javafx.scene.image.Image;


public class ChallengeGate extends Obstacle{

    private int keysNeeded;

    public ChallengeGate(Image image, int scale, Position position){
        super(image, scale, position);
    }

    public void setKeysNeeded(int keysNeeded){this.keysNeeded = keysNeeded;}
    @Override
    boolean ClearObstacle(Chip chip) {
        return chip.removeChallenge(this.keysNeeded);
    }
}
