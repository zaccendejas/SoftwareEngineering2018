public class RedKey extends Collectable{
    @Override
    void addCollectable(Chip chip) {
        chip.addKey(Key.RED);
    }
}
