public class BlueKey extends Collectable {
    @Override
    void addCollectable(Chip chip) {
        chip.addKey(Key.BLUE);
    }
}
