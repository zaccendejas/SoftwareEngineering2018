public class YellowGate extends Obstacle{
    @Override
    boolean ClearObstacle(Chip chip) {
        return chip.removeKey(Key.YELLOW);
    }
}
