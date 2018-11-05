import javafx.scene.image.Image;

import java.util.ArrayList;

public class LevelTwoObstacleBuilder implements IObstacleBuilder {

    private Image wallImage;
    private Image finalGateImage;
    private Image greenGateImage;
    private Image blueGateImage;
    private Image redGateImage;
    private Image yellowGateImage;
    private ArrayList<Obstacle> obstacles;

    @Override
    public ArrayList<Obstacle> buildObstacles(Tile[][] tileMap, int scale) {
        this.wallImage = new Image("file:textures/Wall.png", scale, scale, true, true);
        this.finalGateImage = new Image("file:textures/FinalBarrier.png", scale, scale, true, true);
        this.greenGateImage = new Image("file:textures/greenKeyWall.png", scale, scale, true, true);
        this.blueGateImage = new Image("file:textures/blueKeyWall.png", scale, scale, true, true);
        this.redGateImage = new Image("file:textures/redKeyWall.png", scale, scale, true, true);
        this.yellowGateImage = new Image("file:textures/yellowKeyWall.png", scale, scale, true, true);
        this.obstacles = new ArrayList<>();

        ChallengeGate challengeGate = new ChallengeGate(this.finalGateImage, scale, new Position(18, 3));
        challengeGate.setKeysNeeded(18);
        this.obstacles.add(challengeGate);
        tileMap[3][18].setPresence(Presence.OBSTACLE);
        tileMap[3][18].setObstacle(challengeGate);

        YellowGate yellowGate = new YellowGate(this.yellowGateImage, scale, new Position(18, 8));
        this.obstacles.add(yellowGate);
        tileMap[8][18].setPresence(Presence.OBSTACLE);
        tileMap[8][18].setObstacle(yellowGate);

        BlueGate blueGate = new BlueGate(this.blueGateImage, scale, new Position(6, 7));
        this.obstacles.add(blueGate);
        tileMap[7][6].setPresence(Presence.OBSTACLE);
        tileMap[7][6].setObstacle(blueGate);

        GreenGate greenGate = new GreenGate(this.greenGateImage, scale, new Position(16, 6));
        this.obstacles.add(greenGate);
        tileMap[6][16].setPresence(Presence.OBSTACLE);
        tileMap[6][16].setObstacle(greenGate);

        RedGate redGate = new RedGate(this.redGateImage, scale, new Position(1, 10));
        this.obstacles.add(redGate);
        tileMap[10][1].setPresence(Presence.OBSTACLE);
        tileMap[10][1].setObstacle(redGate);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
        //                  BUILD HORIZONTAL WALLS                //
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

        for (int i = 0; i < 25; i++) {
            Wall wallTop = new Wall(this.wallImage, scale, new Position(i, 0));
            this.obstacles.add(wallTop);
            tileMap[0][i].setPresence(Presence.OBSTACLE);
            tileMap[0][i].setObstacle(wallTop);

            Wall wallBot = new Wall(this.wallImage, scale, new Position(i, 24));
            this.obstacles.add(wallBot);
            tileMap[24][i].setPresence(Presence.OBSTACLE);
            tileMap[24][i].setObstacle(wallBot);
        }

        for (int i = 17; i < 20; i++){
            Wall wall = new Wall(this.wallImage, scale, new Position(i, 1));
            this.obstacles.add(wall);
            tileMap[1][i].setPresence(Presence.OBSTACLE);
            tileMap[1][i].setObstacle(wall);
        }

        for (int i = 12; i < 24; i++) {
            if (i == 16) continue;
            Wall wall = new Wall(this.wallImage, scale, new Position(i, 6));
            this.obstacles.add(wall);
            tileMap[6][i].setPresence(Presence.OBSTACLE);
            tileMap[6][i].setObstacle(wall);
        }

        for (int i = 12; i < 24; i++) {
            if (i == 18) continue;
            Wall wall = new Wall(this.wallImage, scale, new Position(i, 8));
            this.obstacles.add(wall);
            tileMap[8][i].setPresence(Presence.OBSTACLE);
            tileMap[8][i].setObstacle(wall);
        }

        for (int i = 6; i < 8; i++) {
            Wall wall = new Wall(this.wallImage, scale, new Position(i, 9));
            this.obstacles.add(wall);
            tileMap[9][i].setPresence(Presence.OBSTACLE);
            tileMap[9][i].setObstacle(wall);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
        //                  BUILD VERTICAL WALLS                //
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

        for (int i = 1; i < 24; i++) {
            Wall wallLeft = new Wall(this.wallImage, scale, new Position(0, i));
            this.obstacles.add(wallLeft);
            tileMap[i][0].setPresence(Presence.OBSTACLE);
            tileMap[i][0].setObstacle(wallLeft);

            Wall wallRight = new Wall(this.wallImage, scale, new Position(24, i));
            this.obstacles.add(wallRight);
            tileMap[i][24].setPresence(Presence.OBSTACLE);
            tileMap[i][24].setObstacle(wallRight);
        }

        for (int i = 6; i < 9; i++) {
            if (i == 7) continue;
            Wall wall = new Wall(this.wallImage, scale, new Position(6, i));
            this.obstacles.add(wall);
            tileMap[i][6].setPresence(Presence.OBSTACLE);
            tileMap[i][6].setObstacle(wall);
        }

        for (int i = 2; i < 4; i++) {
            Wall wall = new Wall(this.wallImage, scale, new Position(17, i));
            this.obstacles.add(wall);
            tileMap[i][17].setPresence(Presence.OBSTACLE);
            tileMap[i][17].setObstacle(wall);
        }

        for (int i = 2; i < 4; i++) {
            Wall wall = new Wall(this.wallImage, scale, new Position(19, i));
            this.obstacles.add(wall);
            tileMap[i][19].setPresence(Presence.OBSTACLE);
            tileMap[i][19].setObstacle(wall);
        }

        for (int i = 1; i < 6; i++){
            Wall wall = new Wall(this.wallImage, scale, new Position(10, i));
            this.obstacles.add(wall);
            tileMap[i][10].setPresence(Presence.OBSTACLE);
            tileMap[i][10].setObstacle(wall);
        }

        for (int i = 5; i < 9; i++){
            Wall wall = new Wall(this.wallImage, scale, new Position(11, i));
            this.obstacles.add(wall);
            tileMap[i][11].setPresence(Presence.OBSTACLE);
            tileMap[i][11].setObstacle(wall);
        }

        return this.obstacles;
    }
}
