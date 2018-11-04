public class LevelOneChipBuilder implements IChipBuilder {
    private Inventory inventory;
    private Chip chip;

    @Override
    public Chip buildChip(int scale) {
        this.inventory = new Inventory();
        this.chip = new Chip(this.inventory, new Position(18, 19), scale);
        return this.chip;
    }
}
