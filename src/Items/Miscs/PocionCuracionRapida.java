package Items.Miscs;

import Player.*;
import Enums.Stats;

public class PocionCuracionRapida extends Misc {
    private int healingAmount;

    public PocionCuracionRapida() {
        super("Poción de Curación Rápida", "Recupera 35 de salud.");
        this.healingAmount = 35;
    }

    public void use(Player player) {
        int currentHealth = player.getStat(Stats.HP);
        player.putStat(Stats.HP, currentHealth + healingAmount);
        System.out.println("Has usado una Poción de Curación Rápida. Salud restaurada en " + healingAmount);
    }
}
