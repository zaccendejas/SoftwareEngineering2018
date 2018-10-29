public class GreenGate extends Obstacle{
    @Override
    boolean ClearObstacle(Chip chip) {
        return chip.removeKey(Key.GREEN);

    }
}
