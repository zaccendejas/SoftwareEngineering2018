import javafx.scene.image.Image;

public class ChallengeKey extends Collectable{

    public ChallengeKey(Image image, int scale, Position position){
        super(image, scale, position);
    }

    @Override
    void addCollectable(Chip chip) {
        chip.addKey(Key.CHALLENGE);
    }
}
