package Items.Miscs;

import Player.*;
import Enums.Stats;

public class ElixirRenovacion extends Misc {
    private int healingAmount;

    public ElixirRenovacion() {
        super("Elixir de Renovación", "Recupera 20 de salud.");
        this.healingAmount = 20;
    }

    public void use(Player player) {
        int currentHealth = player.getStat(Stats.HP);
        player.putStat(Stats.HP, currentHealth + healingAmount);
        System.out.println("Has usado un Elixir de Renovación. Salud restaurada en " + healingAmount);
    }
}
