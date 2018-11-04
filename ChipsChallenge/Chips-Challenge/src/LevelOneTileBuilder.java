import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LevelOneTileBuilder implements ITileBuilder{

    private Image landImage;
    private Image waterImage;
    private Image portalImage;
    private Map<Integer, List<Integer> > waterTiles;
    private Tile[][] tileMap;

    @Override
    public Tile[][] buildTiles(int scale) {
        this.addWater();
        this.landImage = new Image("file:textures/BlankTile.png", scale, scale, true, true);
        this.waterImage = new Image("file:textures/WaterTile.png", scale, scale, true, true);
        this.portalImage = new Image("file:textures/portal.png", scale, scale, true, true);
        this.tileMap = new Tile[25][25];
        for (int y = 0; y < 25; y++){
            for (int x = 0; x < 25; x++) {
                Integer row = new Integer(y);
                Integer column = new Integer(x);
                if (this.waterTiles.containsKey(row)) {
                    if (this.waterTiles.get(row).contains(column)) {
                        tileMap[y][x] = new Tile(this.waterImage, scale, x, y, TileType.WATER);

                    } else if (x == 6 && y == 4) {
                        tileMap[y][x] = new Tile(this.portalImage, scale, x, y, TileType.GOAL);

                    } else {
                        tileMap[y][x] = new Tile(this.landImage, scale, x, y, TileType.LAND);
                    }
                }
                else if (x == 6 && y == 4){
                    tileMap[y][x] = new Tile(this.portalImage, scale, x, y, TileType.GOAL);
                }else{
                    tileMap[y][x] = new Tile(this.landImage, scale, x, y, TileType.LAND);
                }
            }
        }

        return this.tileMap;
    }

    private void addWater(){
        this.waterTiles = new HashMap<>();
        List<Integer> columnsRow1 = new ArrayList<>();
        columnsRow1.add(new Integer(1));
        columnsRow1.add(new Integer(2));
        columnsRow1.add(new Integer(3));
        columnsRow1.add(new Integer(14));
        columnsRow1.add(new Integer(15));
        columnsRow1.add(new Integer(16));
        columnsRow1.add(new Integer(17));
        columnsRow1.add(new Integer(18));
        this.waterTiles.put(new Integer(1), columnsRow1);

        List<Integer> columnsRow2 = columnsRow1;
        this.waterTiles.put(2, columnsRow2);

        List<Integer> columnsRow3 = new ArrayList<>();
        columnsRow3.add(1);
        columnsRow3.add(2);
        columnsRow3.add(3);
        columnsRow3.add(15);
        columnsRow3.add(16);
        columnsRow3.add(17);
        columnsRow3.add(18);
        this.waterTiles.put(3, columnsRow3);

        List<Integer> columnsRow4 = new ArrayList<>();
        columnsRow4.add(1);
        columnsRow4.add(2);
        columnsRow4.add(3);
        columnsRow4.add(16);
        columnsRow4.add(17);
        columnsRow4.add(18);
        columnsRow4.add(19);
        this.waterTiles.put(4, columnsRow4);

        List<Integer> columnsRow5 = new ArrayList<>();
        columnsRow5.add(1);
        columnsRow5.add(2);
        columnsRow5.add(3);
        columnsRow5.add(17);
        columnsRow5.add(18);
        columnsRow5.add(19);
        this.waterTiles.put(5, columnsRow5);

        List<Integer> columnsRow6 = new ArrayList<>();
        columnsRow6.add(1);
        columnsRow6.add(2);
        columnsRow6.add(3);
        columnsRow6.add(18);
        columnsRow6.add(19);
        this.waterTiles.put(6, columnsRow6);

        List<Integer> columnsRow7 = new ArrayList<>();
        columnsRow7.add(1);
        columnsRow7.add(2);
        columnsRow7.add(3);
        columnsRow7.add(19);
        columnsRow7.add(20);
        this.waterTiles.put(7, columnsRow7);
        this.waterTiles.put(8, columnsRow7);

        List<Integer> columnsRow9 = new ArrayList<>();
        columnsRow9.add(1);
        columnsRow9.add(2);
        columnsRow9.add(3);
        this.waterTiles.put(9, columnsRow9);
        this.waterTiles.put(10, columnsRow9);
        this.waterTiles.put(11, columnsRow9);
        this.waterTiles.put(12, columnsRow9);
        this.waterTiles.put(13, columnsRow9);
        this.waterTiles.put(14, columnsRow9);
    }
}
