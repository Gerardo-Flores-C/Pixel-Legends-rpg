package Items.Armaduras;

import Enums.ItemCategory;
import Items.Equipment;

import javax.swing.*;

public abstract class Armor extends Equipment {
    private final int defenseBonus;

    public Armor(String name, int defenseBonus) {
        super(name, Integer.parseInt("Armadura de tipo " + name), ItemCategory.Armadura);
        this.defenseBonus = defenseBonus;
    }

    public int getDefenseBonus() {
        return defenseBonus;
    }

    public void displayItemInfo() {
        JOptionPane.showMessageDialog(null,
                "Armadura: " + getName() + " | Bono de defensa: " + defenseBonus); // Usar JOptionPane
    }
}
