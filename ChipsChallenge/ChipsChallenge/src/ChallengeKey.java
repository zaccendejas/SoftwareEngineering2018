public class ChallengeKey extends Collectable{
    @Override
    void addCollectable(Chip chip) {
        chip.addKey(Key.CHALLENGE);
    }
}
