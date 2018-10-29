public class GreenKey extends Collectable{

    @Override
    void addCollectable(Chip chip) {
        chip.addKey(Key.GREEN);
    }
}
