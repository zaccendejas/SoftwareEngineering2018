public class ChallengeGate extends Obstacle{

    private int keysNeeded;

    public void setKeysNeeded(int keysNeeded){this.keysNeeded = keysNeeded;}
    @Override
    boolean ClearObstacle(Chip chip) {
        return chip.removeChallenge(this.keysNeeded);
    }
}
