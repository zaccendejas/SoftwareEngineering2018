import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LevelTwoTileBuilder implements ITileBuilder {

    private Image landImage;
    private Image waterImage;
    private Image portalImage;
    private Map<Integer, List<Integer>> waterTiles;
    private Tile[][] tileMap;

    @Override
    public Tile[][] buildTiles(int scale)
    {
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

                    } else if (x == 18 && y == 2) {
                        tileMap[y][x] = new Tile(this.portalImage, scale, x, y, TileType.GOAL);

                    } else {
                        tileMap[y][x] = new Tile(this.landImage, scale, x, y, TileType.LAND);
                    }
                }
                else if (x == 18 && y == 2){
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
        columnsRow1.add(new Integer(9));
        columnsRow1.add(new Integer(10));
        this.waterTiles.put(new Integer(1), columnsRow1);

        List<Integer> columnsRow2 = new ArrayList<>();
        columnsRow2.add(new Integer(9));
        columnsRow2.add(new Integer(10));
        this.waterTiles.put(new Integer(2), columnsRow2);

        List<Integer> columnsRow3 = new ArrayList<>();
        columnsRow3.add(new Integer(2));
        columnsRow3.add(new Integer(3));
        columnsRow3.add(new Integer(4));
        columnsRow3.add(new Integer(5));
        columnsRow3.add(new Integer(6));
        columnsRow3.add(new Integer(7));
        columnsRow3.add(new Integer(9));
        columnsRow3.add(new Integer(10));
        this.waterTiles.put(new Integer(3), columnsRow3);

        List<Integer> columnsRow4 = new ArrayList<>();
        columnsRow4.add(new Integer(7));
        columnsRow4.add(new Integer(10));
        this.waterTiles.put(new Integer(4), columnsRow4);

        List<Integer> columnsRow5 = new ArrayList<>();
        columnsRow5.add(new Integer(1));
        columnsRow5.add(new Integer(2));
        columnsRow5.add(new Integer(3));
        columnsRow5.add(new Integer(4));
        columnsRow5.add(new Integer(5));
        columnsRow5.add(new Integer(6));
        columnsRow5.add(new Integer(7));
        columnsRow5.add(new Integer(10));
        columnsRow5.add(new Integer(11));
        this.waterTiles.put(new Integer(5), columnsRow5);

        List<Integer> columnsRow6 = new ArrayList<>();
        columnsRow6.add(new Integer(10));
        columnsRow6.add(new Integer(11));
        this.waterTiles.put(new Integer(6), columnsRow6);

        List<Integer> columnsRow7 = new ArrayList<>();
        columnsRow7.add(new Integer(10));
        columnsRow7.add(new Integer(11));
        columnsRow7.add(new Integer(12));
        columnsRow7.add(new Integer(13));
        columnsRow7.add(new Integer(14));
        columnsRow7.add(new Integer(15));
        columnsRow7.add(new Integer(16));
        columnsRow7.add(new Integer(17));
        columnsRow7.add(new Integer(18));
        columnsRow7.add(new Integer(19));
        columnsRow7.add(new Integer(20));
        columnsRow7.add(new Integer(21));
        columnsRow7.add(new Integer(22));
        columnsRow7.add(new Integer(23));
        this.waterTiles.put(new Integer(7), columnsRow7);

        List<Integer> columnsRow8 = new ArrayList<>();
        columnsRow8.add(new Integer(10));
        columnsRow8.add(new Integer(11));
        this.waterTiles.put(new Integer(8), columnsRow8);

        List<Integer> columnsRow9 = new ArrayList<>();
        columnsRow9.add(new Integer(10));
        columnsRow9.add(new Integer(11));
        columnsRow9.add(new Integer(12));
        columnsRow9.add(new Integer(13));
        columnsRow9.add(new Integer(14));
        columnsRow9.add(new Integer(15));
        columnsRow9.add(new Integer(16));
        columnsRow9.add(new Integer(17));
        columnsRow9.add(new Integer(18));
        columnsRow9.add(new Integer(19));
        columnsRow9.add(new Integer(20));
        columnsRow9.add(new Integer(21));
        columnsRow9.add(new Integer(22));
        columnsRow9.add(new Integer(23));
        this.waterTiles.put(new Integer(9), columnsRow9);

        List<Integer> columnsRow10 = new ArrayList<>();
        columnsRow10.add(new Integer(2));
        columnsRow10.add(new Integer(8));
        columnsRow10.add(new Integer(10));
        columnsRow10.add(new Integer(11));
        columnsRow10.add(new Integer(12));
        columnsRow10.add(new Integer(13));
        columnsRow10.add(new Integer(14));
        columnsRow10.add(new Integer(15));
        columnsRow10.add(new Integer(16));
        columnsRow10.add(new Integer(17));
        columnsRow10.add(new Integer(18));
        columnsRow10.add(new Integer(19));
        columnsRow10.add(new Integer(20));
        columnsRow10.add(new Integer(21));
        columnsRow10.add(new Integer(22));
        columnsRow10.add(new Integer(23));
        this.waterTiles.put(new Integer(10), columnsRow10);

        List<Integer> columnsRow11 = new ArrayList<>();
        columnsRow11.add(new Integer(2));
        columnsRow11.add(new Integer(8));
        columnsRow11.add(new Integer(9));
        columnsRow11.add(new Integer(10));
        columnsRow11.add(new Integer(11));
        columnsRow11.add(new Integer(12));
        columnsRow11.add(new Integer(15));
        columnsRow11.add(new Integer(16));
        columnsRow11.add(new Integer(17));
        columnsRow11.add(new Integer(18));
        columnsRow11.add(new Integer(19));
        this.waterTiles.put(new Integer(11), columnsRow11);

        List<Integer> columnsRow12 = new ArrayList<>();
        columnsRow12.add(new Integer(2));
        columnsRow12.add(new Integer(8));
        columnsRow12.add(new Integer(9));
        columnsRow12.add(new Integer(10));
        columnsRow12.add(new Integer(11));
        columnsRow12.add(new Integer(12));
        columnsRow12.add(new Integer(15));
        columnsRow12.add(new Integer(16));
        columnsRow12.add(new Integer(17));
        columnsRow12.add(new Integer(18));
        columnsRow12.add(new Integer(19));
        this.waterTiles.put(new Integer(12), columnsRow12);

        List<Integer> columnsRow13 = new ArrayList<>();
        columnsRow13.add(new Integer(2));
        columnsRow13.add(new Integer(8));
        columnsRow13.add(new Integer(9));
        columnsRow13.add(new Integer(10));
        columnsRow13.add(new Integer(11));
        columnsRow13.add(new Integer(12));
        columnsRow13.add(new Integer(13));
        columnsRow13.add(new Integer(14));
        columnsRow13.add(new Integer(15));
        columnsRow13.add(new Integer(16));
        columnsRow13.add(new Integer(17));
        columnsRow13.add(new Integer(18));
        columnsRow13.add(new Integer(19));
        this.waterTiles.put(new Integer(13), columnsRow13);

        List<Integer> columnsRow14 = new ArrayList<>();
        columnsRow14.add(new Integer(1));
        columnsRow14.add(new Integer(2));
        columnsRow14.add(new Integer(6));
        columnsRow14.add(new Integer(7));
        columnsRow14.add(new Integer(8));
        columnsRow14.add(new Integer(11));
        columnsRow14.add(new Integer(12));
        columnsRow14.add(new Integer(13));
        columnsRow14.add(new Integer(14));
        columnsRow14.add(new Integer(15));
        columnsRow14.add(new Integer(16));
        columnsRow14.add(new Integer(17));
        columnsRow14.add(new Integer(18));
        columnsRow14.add(new Integer(19));
        this.waterTiles.put(new Integer(14), columnsRow14);

        List<Integer> columnsRow15 = new ArrayList<>();
        columnsRow15.add(new Integer(6));
        columnsRow15.add(new Integer(11));
        columnsRow15.add(new Integer(15));
        columnsRow15.add(new Integer(16));
        columnsRow15.add(new Integer(17));
        columnsRow15.add(new Integer(18));
        columnsRow15.add(new Integer(19));
        columnsRow15.add(new Integer(20));
        columnsRow15.add(new Integer(21));
        columnsRow15.add(new Integer(22));
        columnsRow15.add(new Integer(23));
        this.waterTiles.put(new Integer(15), columnsRow15);

        List<Integer> columnsRow16 = new ArrayList<>();
        columnsRow16.add(new Integer(6));
        columnsRow16.add(new Integer(11));
        columnsRow16.add(new Integer(17));
        columnsRow16.add(new Integer(18));
        columnsRow16.add(new Integer(19));
        columnsRow16.add(new Integer(20));
        columnsRow16.add(new Integer(21));
        columnsRow16.add(new Integer(22));
        columnsRow16.add(new Integer(23));
        this.waterTiles.put(new Integer(16), columnsRow16);

        List<Integer> columnsRow17 = new ArrayList<>();
        columnsRow17.add(new Integer(6));
        columnsRow17.add(new Integer(11));
        columnsRow17.add(new Integer(17));
        columnsRow17.add(new Integer(18));
        columnsRow17.add(new Integer(19));
        columnsRow17.add(new Integer(20));
        columnsRow17.add(new Integer(21));
        columnsRow17.add(new Integer(22));
        columnsRow17.add(new Integer(23));
        this.waterTiles.put(new Integer(17), columnsRow17);

        List<Integer> columnsRow18 = new ArrayList<>();
        columnsRow18.add(new Integer(1));
        columnsRow18.add(new Integer(2));
        columnsRow18.add(new Integer(3));
        columnsRow18.add(new Integer(4));
        columnsRow18.add(new Integer(5));
        columnsRow18.add(new Integer(6));
        columnsRow18.add(new Integer(7));
        columnsRow18.add(new Integer(8));
        columnsRow18.add(new Integer(9));
        columnsRow18.add(new Integer(10));
        columnsRow18.add(new Integer(11));
        columnsRow18.add(new Integer(17));
        columnsRow18.add(new Integer(18));
        columnsRow18.add(new Integer(19));
        columnsRow18.add(new Integer(20));
        columnsRow18.add(new Integer(21));
        columnsRow18.add(new Integer(22));
        columnsRow18.add(new Integer(23));
        this.waterTiles.put(new Integer(18), columnsRow18);

        List<Integer> columnsRow19 = new ArrayList<>();
        columnsRow19.add(new Integer(5));
        columnsRow19.add(new Integer(6));
        columnsRow19.add(new Integer(7));
        columnsRow19.add(new Integer(17));
        columnsRow19.add(new Integer(18));
        columnsRow19.add(new Integer(19));
        columnsRow19.add(new Integer(20));
        columnsRow19.add(new Integer(21));
        columnsRow19.add(new Integer(22));
        columnsRow19.add(new Integer(23));
        this.waterTiles.put(new Integer(19), columnsRow19);

        List<Integer> columnsRow20 = new ArrayList<>();
        columnsRow20.add(new Integer(5));
        columnsRow20.add(new Integer(6));
        columnsRow20.add(new Integer(7));
        columnsRow20.add(new Integer(16));
        columnsRow20.add(new Integer(17));
        columnsRow20.add(new Integer(18));
        columnsRow20.add(new Integer(19));
        columnsRow20.add(new Integer(20));
        columnsRow20.add(new Integer(21));
        columnsRow20.add(new Integer(22));
        columnsRow20.add(new Integer(23));
        this.waterTiles.put(new Integer(20), columnsRow20);

        List<Integer> columnsRow21 = new ArrayList<>();
        columnsRow21.add(new Integer(5));
        columnsRow21.add(new Integer(6));
        columnsRow21.add(new Integer(7));
        columnsRow21.add(new Integer(16));
        columnsRow21.add(new Integer(17));
        columnsRow21.add(new Integer(18));
        columnsRow21.add(new Integer(19));
        columnsRow21.add(new Integer(20));
        columnsRow21.add(new Integer(21));
        columnsRow21.add(new Integer(22));
        columnsRow21.add(new Integer(23));
        this.waterTiles.put(new Integer(21), columnsRow21);

        List<Integer> columnsRow23 = new ArrayList<>();
        columnsRow23.add(new Integer(5));
        columnsRow23.add(new Integer(6));
        columnsRow23.add(new Integer(7));
        columnsRow23.add(new Integer(8));
        columnsRow23.add(new Integer(9));
        columnsRow23.add(new Integer(10));
        columnsRow23.add(new Integer(11));
        columnsRow23.add(new Integer(12));
        columnsRow23.add(new Integer(13));
        columnsRow23.add(new Integer(14));
        columnsRow23.add(new Integer(15));
        columnsRow23.add(new Integer(16));
        columnsRow23.add(new Integer(17));
        columnsRow23.add(new Integer(18));
        columnsRow23.add(new Integer(19));
        columnsRow23.add(new Integer(20));
        columnsRow23.add(new Integer(21));
        columnsRow23.add(new Integer(22));
        columnsRow23.add(new Integer(23));
        this.waterTiles.put(new Integer(23), columnsRow23);

        List<Integer> columnsRow24 = new ArrayList<>();
        columnsRow24.add(new Integer(5));
        columnsRow24.add(new Integer(6));
        columnsRow24.add(new Integer(7));
        columnsRow24.add(new Integer(8));
        columnsRow24.add(new Integer(9));
        columnsRow24.add(new Integer(10));
        columnsRow24.add(new Integer(11));
        columnsRow24.add(new Integer(12));
        columnsRow24.add(new Integer(13));
        columnsRow24.add(new Integer(14));
        columnsRow24.add(new Integer(15));
        columnsRow24.add(new Integer(16));
        columnsRow24.add(new Integer(17));
        columnsRow24.add(new Integer(18));
        columnsRow24.add(new Integer(19));
        columnsRow24.add(new Integer(20));
        columnsRow24.add(new Integer(21));
        columnsRow24.add(new Integer(22));
        columnsRow24.add(new Integer(23));
        this.waterTiles.put(new Integer(24), columnsRow24);
    }
}
