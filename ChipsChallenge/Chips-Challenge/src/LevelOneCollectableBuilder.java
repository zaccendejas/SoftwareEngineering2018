import javafx.scene.image.Image;

import java.util.ArrayList;

public class LevelOneCollectableBuilder implements  ICollectableBuilder{

    private Image greenKey;
    private Image blueKey;
    private Image yellowKey;
    private Image redKey;
    private Image challengeKey;
    private ArrayList<Collectable> collectables;
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

    @Override
    public ArrayList<Collectable> buildCollectables(Tile[][] tileMap, int scale) {
        this.greenKey = new Image("file:textures/greenKey.png", scale, scale, true, true);
        this.blueKey = new Image("file:textures/blueKey.png", scale, scale, true, true);
        this.yellowKey = new Image("file:textures/yellowKey.png", scale, scale, true, true);
        this.redKey = new Image("file:textures/redKey.png", scale, scale, true, true);
        this.challengeKey = new Image("file:textures/chipItem.png", scale, scale, true, true);

        this.collectables = new ArrayList<>();

        this.gKey = new GreenKey(this.greenKey, scale, new Position(10, 14));
        this.collectables.add(gKey);
        tileMap[14][10].setPresence(Presence.COLLECTABLE);
        tileMap[14][10].setCollectable(gKey);

        this.bKey = new BlueKey(this.blueKey, scale, new Position(22, 16));
        this.collectables.add(bKey);
        tileMap[16][22].setPresence(Presence.COLLECTABLE);
        tileMap[16][22].setCollectable(bKey);

        this.yKey = new YellowKey(this.yellowKey, scale, new Position(9, 19));
        this.collectables.add(yKey);
        tileMap[19][9].setPresence(Presence.COLLECTABLE);
        tileMap[19][9].setCollectable(yKey);

        this.rKey = new RedKey(this.redKey, scale, new Position(12, 16));
        this.collectables.add(rKey);
        tileMap[16][12].setPresence(Presence.COLLECTABLE);
        tileMap[16][12].setCollectable(rKey);

        this.cKey1 = new ChallengeKey(this.challengeKey, scale, new Position(22, 2));
        this.collectables.add(cKey1);
        tileMap[2][22].setPresence(Presence.COLLECTABLE);
        tileMap[2][22].setCollectable(cKey1);

        this.cKey2 = new ChallengeKey(this.challengeKey, scale, new Position(23, 2));
        this.collectables.add(cKey2);
        tileMap[2][23].setPresence(Presence.COLLECTABLE);
        tileMap[2][23].setCollectable(cKey2);

        this.cKey3 = new ChallengeKey(this.challengeKey, scale, new Position(22, 3));
        this.collectables.add(cKey3);
        tileMap[3][22].setPresence(Presence.COLLECTABLE);
        tileMap[3][22].setCollectable(cKey3);

        this.cKey4 = new ChallengeKey(this.challengeKey, scale, new Position(23, 3));
        this.collectables.add(cKey4);
        tileMap[3][23].setPresence(Presence.COLLECTABLE);
        tileMap[3][23].setCollectable(cKey4);

        this.cKey5 = new ChallengeKey(this.challengeKey, scale, new Position(22, 13));
        this.collectables.add(cKey5);
        tileMap[13][22].setPresence(Presence.COLLECTABLE);
        tileMap[13][22].setCollectable(cKey5);

        this.cKey6 = new ChallengeKey(this.challengeKey, scale, new Position(20, 18));
        this.collectables.add(cKey6);
        tileMap[18][20].setPresence(Presence.COLLECTABLE);
        tileMap[18][20].setCollectable(cKey6);

        this.cKey7 = new ChallengeKey(this.challengeKey, scale, new Position(20, 20));
        this.collectables.add(cKey7);
        tileMap[20][20].setPresence(Presence.COLLECTABLE);
        tileMap[20][20].setCollectable(cKey7);


        this.cKey8 = new ChallengeKey(this.challengeKey, scale, new Position(3, 22));
        this.collectables.add(cKey8);
        tileMap[22][3].setPresence(Presence.COLLECTABLE);
        tileMap[22][3].setCollectable(cKey8);

        this.cKey9 = new ChallengeKey(this.challengeKey, scale, new Position(4, 22));
        this.collectables.add(cKey9);
        tileMap[22][4].setPresence(Presence.COLLECTABLE);
        tileMap[22][4].setCollectable(cKey9);

        this.cKey10 = new ChallengeKey(this.challengeKey, scale, new Position(3, 23));
        this.collectables.add(cKey10);
        tileMap[23][3].setPresence(Presence.COLLECTABLE);
        tileMap[23][3].setCollectable(cKey10);

        this.cKey11 = new ChallengeKey(this.challengeKey, scale, new Position(4, 23));
        this.collectables.add(cKey11);
        tileMap[23][4].setPresence(Presence.COLLECTABLE);
        tileMap[23][4].setCollectable(cKey11);


        return this.collectables;
    }
}
