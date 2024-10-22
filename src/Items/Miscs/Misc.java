package Items.Miscs;

import Enums.ItemCategory;
import Items.Item;

public abstract class Misc extends Item {
    private final boolean consumable;
    private final boolean stackable;

    public Misc(String consumable, String stackable) {
        super(ItemCategory.Miscelaneo);
        this.consumable = Boolean.parseBoolean(consumable);
        this.stackable = Boolean.parseBoolean(stackable);
    }

    public boolean isConsumable() {
        return consumable;
    }

    public boolean isStackable() {
        return stackable;
    }
}
