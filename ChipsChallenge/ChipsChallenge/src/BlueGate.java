public class BlueGate extends Obstacle{
    @Override
    boolean ClearObstacle(Chip chip) {
        return chip.removeKey(Key.BLUE);
    }
}
