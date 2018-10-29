public class Wall extends Obstacle{
    @Override
    boolean ClearObstacle(Chip chip) {
        chip.Block();
        return false;
    }
}
