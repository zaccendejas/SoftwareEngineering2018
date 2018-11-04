import javafx.scene.image.Image;

import java.util.ArrayList;

public class LevelOneObstacleBuilder implements IObstacleBuilder {

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

        ChallengeGate challengeGate = new ChallengeGate(this.finalGateImage, scale, new Position(6, 5));
        challengeGate.setKeysNeeded(11);
        this.obstacles.add(challengeGate);
        tileMap[5][6].setPresence(Presence.OBSTACLE);
        tileMap[5][6].setObstacle(challengeGate);

        YellowGate yellowGate = new YellowGate(this.yellowGateImage, scale, new Position(11, 7));
        this.obstacles.add(yellowGate);
        tileMap[7][11].setPresence(Presence.OBSTACLE);
        tileMap[7][11].setObstacle(yellowGate);

        BlueGate blueGate = new BlueGate(this.blueGateImage, scale, new Position(4, 16));
        this.obstacles.add(blueGate);
        tileMap[16][4].setPresence(Presence.OBSTACLE);
        tileMap[16][4].setObstacle(blueGate);

        GreenGate greenGate = new GreenGate(this.greenGateImage, scale, new Position(22, 8));
        this.obstacles.add(greenGate);
        tileMap[8][22].setPresence(Presence.OBSTACLE);
        tileMap[8][22].setObstacle(greenGate);

        RedGate redGate = new RedGate(this.redGateImage, scale, new Position(18, 14));
        this.obstacles.add(redGate);
        tileMap[14][18].setPresence(Presence.OBSTACLE);
        tileMap[14][18].setObstacle(redGate);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
        //                  BUILD HORIZONTAL WALLS                //
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

        for (int i = 0; i < 25; i++){
            Wall wallTop = new Wall(this.wallImage, scale, new Position(i, 0));
            this.obstacles.add(wallTop);
            tileMap[0][i].setPresence(Presence.OBSTACLE);
            tileMap[0][i].setObstacle(wallTop);

            Wall wallBot = new Wall(this.wallImage, scale, new Position(i, 24));
            this.obstacles.add(wallBot);
            tileMap[24][i].setPresence(Presence.OBSTACLE);
            tileMap[24][i].setObstacle(wallBot);
        }

        for (int i = 16; i < 24; i++){
            Wall wall = new Wall(this.wallImage, scale, new Position(i, 11));
            this.obstacles.add(wall);
            tileMap[11][i].setPresence(Presence.OBSTACLE);
            tileMap[11][i].setObstacle(wall);
        }

        for (int i = 1; i < 5; i++){
            Wall wall = new Wall(this.wallImage, scale, new Position(i, 15));
            this.obstacles.add(wall);
            tileMap[15][i].setPresence(Presence.OBSTACLE);
            tileMap[15][i].setObstacle(wall);
        }

        for (int i = 18; i < 22; i++){
            Wall wall = new Wall(this.wallImage, scale, new Position(i, 17));
            this.obstacles.add(wall);
            tileMap[17][i].setPresence(Presence.OBSTACLE);
            tileMap[17][i].setObstacle(wall);
        }

        for (int i = 2; i < 5; i++){
            Wall wall = new Wall(this.wallImage, scale, new Position(i, 20));
            this.obstacles.add(wall);
            tileMap[20][i].setPresence(Presence.OBSTACLE);
            tileMap[20][i].setObstacle(wall);
        }

        for (int i = 2; i < 7; i++){
            Wall wall = new Wall(this.wallImage, scale, new Position(i, 21));
            this.obstacles.add(wall);
            tileMap[21][i].setPresence(Presence.OBSTACLE);
            tileMap[21][i].setObstacle(wall);
        }

        for (int i = 17; i < 22; i++){
            Wall wall = new Wall(this.wallImage, scale, new Position(i, 21));
            this.obstacles.add(wall);
            tileMap[21][i].setPresence(Presence.OBSTACLE);
            tileMap[21][i].setObstacle(wall);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
        //                  BUILD VERTICAL WALLS                //
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

        for (int i = 1; i < 24; i++){
            Wall wallLeft= new Wall(this.wallImage, scale, new Position(0, i));
            this.obstacles.add(wallLeft);
            tileMap[i][0].setPresence(Presence.OBSTACLE);
            tileMap[i][0].setObstacle(wallLeft);

            Wall wallRight = new Wall(this.wallImage, scale, new Position(24, i));
            this.obstacles.add(wallRight);
            tileMap[i][24].setPresence(Presence.OBSTACLE);
            tileMap[i][24].setObstacle(wallRight);
        }

        for (int i = 1; i < 8; i++){
            Wall wall = new Wall(this.wallImage, scale, new Position(10, i));
            this.obstacles.add(wall);
            tileMap[i][10].setPresence(Presence.OBSTACLE);
            tileMap[i][10].setObstacle(wall);
        }

        for (int i = 12; i < 18; i++){
            if (i == 14) continue;

            Wall wall = new Wall(this.wallImage, scale, new Position(18, i));
            this.obstacles.add(wall);
            tileMap[i][18].setPresence(Presence.OBSTACLE);
            tileMap[i][18].setObstacle(wall);
        }

        for (int i = 17; i < 20; i++){
            Wall wall = new Wall(this.wallImage, scale, new Position(4, i));
            this.obstacles.add(wall);
            tileMap[i][4].setPresence(Presence.OBSTACLE);
            tileMap[i][4].setObstacle(wall);
        }

        for (int i = 18; i < 21; i++){
            Wall wall = new Wall(this.wallImage, scale, new Position(21, i));
            this.obstacles.add(wall);
            tileMap[i][21].setPresence(Presence.OBSTACLE);
            tileMap[i][21].setObstacle(wall);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
        //                  BUILD CONNECTING WALLS                //
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
        Wall wall1 = new Wall(this.wallImage, scale, new Position(5, 5));
        this.obstacles.add(wall1);
        tileMap[5][5].setPresence(Presence.OBSTACLE);
        tileMap[5][5].setObstacle(wall1);

        Wall wall2 = new Wall(this.wallImage, scale, new Position(5, 4));
        this.obstacles.add(wall2);
        tileMap[4][5].setPresence(Presence.OBSTACLE);
        tileMap[4][5].setObstacle(wall2);

        Wall wall3 = new Wall(this.wallImage, scale, new Position(5, 3));
        this.obstacles.add(wall3);
        tileMap[3][5].setPresence(Presence.OBSTACLE);
        tileMap[3][5].setObstacle(wall3);

        Wall wall4 = new Wall(this.wallImage, scale, new Position(6, 3));
        this.obstacles.add(wall4);
        tileMap[3][6].setPresence(Presence.OBSTACLE);
        tileMap[3][6].setObstacle(wall4);

        Wall wall7 = new Wall(this.wallImage, scale, new Position(7, 3));
        this.obstacles.add(wall7);
        tileMap[3][7].setPresence(Presence.OBSTACLE);
        tileMap[3][7].setObstacle(wall7);

        Wall wall8 = new Wall(this.wallImage, scale, new Position(7, 4));
        this.obstacles.add(wall8);
        tileMap[4][7].setPresence(Presence.OBSTACLE);
        tileMap[4][7].setObstacle(wall8);

        Wall wall9 = new Wall(this.wallImage, scale, new Position(7, 5));
        this.obstacles.add(wall9);
        tileMap[5][7].setPresence(Presence.OBSTACLE);
        tileMap[5][7].setObstacle(wall9);

        Wall wall10 = new Wall(this.wallImage, scale, new Position(12, 7));
        this.obstacles.add(wall10);
        tileMap[7][12].setPresence(Presence.OBSTACLE);
        tileMap[7][12].setObstacle(wall10);

        Wall wall11 = new Wall(this.wallImage, scale, new Position(13, 7));
        this.obstacles.add(wall11);
        tileMap[7][13].setPresence(Presence.OBSTACLE);
        tileMap[7][13].setObstacle(wall11);

        Wall wall12 = new Wall(this.wallImage, scale, new Position(13, 8));
        this.obstacles.add(wall12);
        tileMap[8][13].setPresence(Presence.OBSTACLE);
        tileMap[8][13].setObstacle(wall12);

        Wall wall13 = new Wall(this.wallImage, scale, new Position(14, 8));
        this.obstacles.add(wall13);
        tileMap[8][14].setPresence(Presence.OBSTACLE);
        tileMap[8][14].setObstacle(wall13);

        Wall wall14 = new Wall(this.wallImage, scale, new Position(15, 8));
        this.obstacles.add(wall14);
        tileMap[8][15].setPresence(Presence.OBSTACLE);
        tileMap[8][15].setObstacle(wall14);

        Wall wall15 = new Wall(this.wallImage, scale, new Position(15, 9));
        this.obstacles.add(wall15);
        tileMap[9][15].setPresence(Presence.OBSTACLE);
        tileMap[9][15].setObstacle(wall15);

        Wall wall16 = new Wall(this.wallImage, scale, new Position(15, 10));
        this.obstacles.add(wall16);
        tileMap[10][15].setPresence(Presence.OBSTACLE);
        tileMap[10][15].setObstacle(wall16);

        Wall wall17 = new Wall(this.wallImage, scale, new Position(16, 10));
        this.obstacles.add(wall17);
        tileMap[10][16].setPresence(Presence.OBSTACLE);
        tileMap[10][16].setObstacle(wall17);

        Wall wall18 = new Wall(this.wallImage, scale, new Position(21, 8));
        this.obstacles.add(wall18);
        tileMap[8][21].setPresence(Presence.OBSTACLE);
        tileMap[8][21].setObstacle(wall18);

        Wall wall19 = new Wall(this.wallImage, scale, new Position(23, 8));
        this.obstacles.add(wall19);
        tileMap[8][23].setPresence(Presence.OBSTACLE);
        tileMap[8][23].setObstacle(wall19);

        Wall wall20 = new Wall(this.wallImage, scale, new Position(22, 19));
        this.obstacles.add(wall20);
        tileMap[19][22].setPresence(Presence.OBSTACLE);
        tileMap[19][22].setObstacle(wall20);

        Wall wall21 = new Wall(this.wallImage, scale, new Position(23, 19));
        this.obstacles.add(wall21);
        tileMap[19][23].setPresence(Presence.OBSTACLE);
        tileMap[19][23].setObstacle(wall21);

        Wall wall22 = new Wall(this.wallImage, scale, new Position(6, 22));
        this.obstacles.add(wall22);
        tileMap[22][6].setPresence(Presence.OBSTACLE);
        tileMap[22][6].setObstacle(wall22);

        Wall wall23 = new Wall(this.wallImage, scale, new Position(6, 23));
        this.obstacles.add(wall23);
        tileMap[23][6].setPresence(Presence.OBSTACLE);
        tileMap[23][6].setObstacle(wall23);


        return this.obstacles;
    }
}
