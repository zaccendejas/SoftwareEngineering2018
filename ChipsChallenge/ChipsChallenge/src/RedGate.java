public class RedGate extends Obstacle{
    @Override
    boolean ClearObstacle(Chip chip) {
        return chip.removeKey(Key.RED);
    }
}
