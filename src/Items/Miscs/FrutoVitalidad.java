package Items.Miscs;

import Player.*;
import Enums.Stats;

public class FrutoVitalidad extends Misc {
    private int healingAmount;

    public FrutoVitalidad() {
        super("Fruto de Vitalidad", "Restaura 50 puntos de salud.");
        this.healingAmount = 50;
    }

    public void use(Player player) {
        int currentHealth = player.getStat(Stats.HP);
        player.putStat(Stats.HP, currentHealth + healingAmount);
        System.out.println("Has usado un Fruto de Vitalidad. Salud restaurada en " + healingAmount);
    }
}
