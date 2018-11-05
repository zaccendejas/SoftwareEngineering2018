public class LevelTwoChipBuilder implements IChipBuilder {
    private Inventory inventory;
    private Chip chip;

    @Override
    public Chip buildChip(int scale) {
        this.inventory = new Inventory();
        this.chip = new Chip(this.inventory, new Position(6, 4), scale);
        return this.chip;
    }
}
