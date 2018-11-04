import java.util.ArrayList;

public class GameController {

    private Tile[][] tileMap;
    private ArrayList<Collectable> collectables;
    private ArrayList<Obstacle> obstacles;
    private Chip chip;
    private LevelDisplay display;
    private ChipsChallenge chipsChallenge;

    public GameController(Tile[][] tileMap, ArrayList<Collectable> collectables, ArrayList<Obstacle> obstacles, Chip chip, LevelDisplay display, ChipsChallenge chipsChallenge){
        this.tileMap = tileMap;
        this.collectables = collectables;
        this.obstacles = obstacles;
        this.chip = chip;
        this.display = display;
        this.chipsChallenge = chipsChallenge;
    }

    public void AttemptUp(){
        int x = this.chip.getCurrentPosition().getX();
        int y = this.chip.getCurrentPosition().getY();
        this.chip.setDirectionSelector(1);
        AttemptMove(tileMap[y-1][x]);


    }

    public void AttemptDown(){
        int x = this.chip.getCurrentPosition().getX();
        int y = this.chip.getCurrentPosition().getY();
        this.chip.setDirectionSelector(3);
        AttemptMove(tileMap[y+1][x]);

    }

    public void AttemptLeft(){
        int x = this.chip.getCurrentPosition().getX();
        int y = this.chip.getCurrentPosition().getY();
        this.chip.setDirectionSelector(0);
        AttemptMove(tileMap[y][x-1]);

    }

    public void AttemptRight(){
        int x = this.chip.getCurrentPosition().getX();
        int y = this.chip.getCurrentPosition().getY();
        this.chip.setDirectionSelector(2);
        AttemptMove(tileMap[y][x+1]);

    }

    private void AttemptMove(Tile nextTile){
        if (nextTile.getPresence() == Presence.OBSTACLE){
            Obstacle obstacle = nextTile.getObstacle();
            if (obstacle.ClearObstacle(chip)){
                nextTile.setPresence(Presence.NONE);
                nextTile.setObstacle(null);
                this.display.RemoveGate(obstacle);
                this.obstacles.remove(obstacle);
            }else{
                TransitionChip(nextTile);
                return;
            }
        }

        if (!nextTile.processLanding(chip)){
            TransitionChip(nextTile);
            return;
        }

        if (nextTile.getPresence() == Presence.COLLECTABLE){
            Collectable collectable = nextTile.getCollectable();
            collectable.addCollectable(chip);
            nextTile.setPresence(Presence.NONE);
            nextTile.setCollectable(null);
            this.display.RemoveCollectable(collectable);
            this.collectables.remove(collectable);
        }

        TransitionChip(nextTile);
    }

    private void TransitionChip(Tile nextTile){
        switch (chip.getTransition()){
            case BLOCK:
                break;
            case PROCEED:
                chip.move(nextTile.getPosition().getX(), nextTile.getPosition().getY());
                break;
            case RESPAWN:
                chip.move(chip.getStartingPosition().getX(), chip.getStartingPosition().getY());
                break;
            case NEXTLEVEL:
                //todo
                chipsChallenge.ClearLevelOne();
                break;
        }
    }

}
