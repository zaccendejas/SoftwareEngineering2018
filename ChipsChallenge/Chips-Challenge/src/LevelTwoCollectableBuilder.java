import javafx.scene.image.Image;

import java.util.ArrayList;

public class LevelTwoCollectableBuilder implements  ICollectableBuilder{

    private Image greenKey;
    private Image blueKey;
    private Image yellowKey;
    private Image redKey;
    private Image challengeKey;
    private Image flippersImage;
    private ArrayList<Collectable> collectables;
    private Flippers flippers;
    private GreenKey gKey;
    private BlueKey bKey;
    private YellowKey yKey;
    private RedKey rKey;
    private ChallengeKey cKey1;
    private ChallengeKey cKey2;
    private ChallengeKey cKey3;
    private ChallengeKey cKey4;
    private ChallengeKey cKey5;
    private ChallengeKey cKey6;
    private ChallengeKey cKey7;
    private ChallengeKey cKey8;
    private ChallengeKey cKey9;
    private ChallengeKey cKey10;
    private ChallengeKey cKey11;
    private ChallengeKey cKey12;
    private ChallengeKey cKey13;
    private ChallengeKey cKey14;
    private ChallengeKey cKey15;
    private ChallengeKey cKey16;
    private ChallengeKey cKey17;
    private ChallengeKey cKey18;

    @Override
    public ArrayList<Collectable> buildCollectables(Tile[][] tileMap, int scale) {
        this.greenKey = new Image("file:textures/greenKey.png", scale, scale, true, true);
        this.blueKey = new Image("file:textures/blueKey.png", scale, scale, true, true);
        this.yellowKey = new Image("file:textures/yellowKey.png", scale, scale, true, true);
        this.redKey = new Image("file:textures/redKey.png", scale, scale, true, true);
        this.challengeKey = new Image("file:textures/chipItem.png", scale, scale, true, true);
        this.flippersImage = new Image("file:textures/Flippers.png", scale, scale, true, true);

        this.collectables = new ArrayList<>();

        this.flippers = new Flippers(this.flippersImage, scale, new Position(1, 13));
        this.collectables.add(flippers);
        tileMap[13][1].setPresence(Presence.COLLECTABLE);
        tileMap[13][1].setCollectable(flippers);

        this.gKey = new GreenKey(this.greenKey, scale, new Position(14, 18));
        this.collectables.add(gKey);
        tileMap[18][14].setPresence(Presence.COLLECTABLE);
        tileMap[18][14].setCollectable(gKey);

        this.bKey = new BlueKey(this.blueKey, scale, new Position(1, 2));
        this.collectables.add(bKey);
        tileMap[2][1].setPresence(Presence.COLLECTABLE);
        tileMap[2][1].setCollectable(bKey);

        this.yKey = new YellowKey(this.yellowKey, scale, new Position(21, 12));
        this.collectables.add(yKey);
        tileMap[12][21].setPresence(Presence.COLLECTABLE);
        tileMap[12][21].setCollectable(yKey);

        this.rKey = new RedKey(this.redKey, scale, new Position(9, 10));
        this.collectables.add(rKey);
        tileMap[10][9].setPresence(Presence.COLLECTABLE);
        tileMap[10][9].setCollectable(rKey);

        this.cKey1 = new ChallengeKey(this.challengeKey, scale, new Position(9, 4));
        this.collectables.add(cKey1);
        tileMap[4][9].setPresence(Presence.COLLECTABLE);
        tileMap[4][9].setCollectable(cKey1);

        this.cKey2 = new ChallengeKey(this.challengeKey, scale, new Position(2, 6));
        this.collectables.add(cKey2);
        tileMap[6][2].setPresence(Presence.COLLECTABLE);
        tileMap[6][2].setCollectable(cKey2);

        this.cKey3 = new ChallengeKey(this.challengeKey, scale, new Position(4, 10));
        this.collectables.add(cKey3);
        tileMap[10][4].setPresence(Presence.COLLECTABLE);
        tileMap[10][4].setCollectable(cKey3);

        this.cKey4 = new ChallengeKey(this.challengeKey, scale, new Position(4, 11));
        this.collectables.add(cKey4);
        tileMap[11][4].setPresence(Presence.COLLECTABLE);
        tileMap[11][4].setCollectable(cKey4);

        this.cKey5 = new ChallengeKey(this.challengeKey, scale, new Position(4, 12));
        this.collectables.add(cKey5);
        tileMap[12][4].setPresence(Presence.COLLECTABLE);
        tileMap[12][4].setCollectable(cKey5);

        this.cKey6 = new ChallengeKey(this.challengeKey, scale, new Position(4, 13));
        this.collectables.add(cKey6);
        tileMap[13][4].setPresence(Presence.COLLECTABLE);
        tileMap[13][4].setCollectable(cKey6);

        this.cKey7 = new ChallengeKey(this.challengeKey, scale, new Position(1, 22));
        this.collectables.add(cKey7);
        tileMap[22][1].setPresence(Presence.COLLECTABLE);
        tileMap[22][1].setCollectable(cKey7);

        this.cKey8 = new ChallengeKey(this.challengeKey, scale, new Position(2, 22));
        this.collectables.add(cKey8);
        tileMap[22][2].setPresence(Presence.COLLECTABLE);
        tileMap[22][2].setCollectable(cKey8);

        this.cKey9 = new ChallengeKey(this.challengeKey, scale, new Position(1, 23));
        this.collectables.add(cKey9);
        tileMap[23][1].setPresence(Presence.COLLECTABLE);
        tileMap[23][1].setCollectable(cKey9);

        this.cKey10 = new ChallengeKey(this.challengeKey, scale, new Position(2, 23));
        this.collectables.add(cKey10);
        tileMap[23][2].setPresence(Presence.COLLECTABLE);
        tileMap[23][2].setCollectable(cKey10);

        this.cKey11 = new ChallengeKey(this.challengeKey, scale, new Position(8, 16));
        this.collectables.add(cKey11);
        tileMap[16][8].setPresence(Presence.COLLECTABLE);
        tileMap[16][8].setCollectable(cKey11);

        this.cKey12 = new ChallengeKey(this.challengeKey, scale, new Position(9, 16));
        this.collectables.add(cKey12);
        tileMap[16][9].setPresence(Presence.COLLECTABLE);
        tileMap[16][9].setCollectable(cKey12);

        this.cKey13 = new ChallengeKey(this.challengeKey, scale, new Position(11, 20));
        this.collectables.add(cKey13);
        tileMap[20][11].setPresence(Presence.COLLECTABLE);
        tileMap[20][11].setCollectable(cKey13);

        this.cKey14 = new ChallengeKey(this.challengeKey, scale, new Position(14, 15));
        this.collectables.add(cKey14);
        tileMap[15][14].setPresence(Presence.COLLECTABLE);
        tileMap[15][14].setCollectable(cKey14);

        this.cKey15 = new ChallengeKey(this.challengeKey, scale, new Position(13, 12));
        this.collectables.add(cKey15);
        tileMap[12][13].setPresence(Presence.COLLECTABLE);
        tileMap[12][13].setCollectable(cKey15);

        this.cKey16 = new ChallengeKey(this.challengeKey, scale, new Position(14, 12));
        this.collectables.add(cKey16);
        tileMap[12][14].setPresence(Presence.COLLECTABLE);
        tileMap[12][14].setCollectable(cKey16);

        this.cKey17 = new ChallengeKey(this.challengeKey, scale, new Position(13, 11));
        this.collectables.add(cKey17);
        tileMap[11][13].setPresence(Presence.COLLECTABLE);
        tileMap[11][13].setCollectable(cKey17);

        this.cKey18 = new ChallengeKey(this.challengeKey, scale, new Position(14, 11));
        this.collectables.add(cKey18);
        tileMap[11][14].setPresence(Presence.COLLECTABLE);
        tileMap[11][14].setCollectable(cKey18);

        return this.collectables;
    }
}
