public class Flippers extends Collectable{
    @Override
    void addCollectable(Chip chip) {
        chip.addFlippers();
    }
}
