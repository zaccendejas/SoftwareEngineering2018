public class YellowKey extends Collectable {
    @Override
    void addCollectable(Chip chip) {
        chip.addKey(Key.YELLOW);
    }
}
