package Items.Miscs;

import Player.*;

public class GemaFuerza extends Misc {
    private int attackBoost;
    private int defenseBoost;
    private int duration;

    public GemaFuerza() {
        super("Gema de Fuerza", "Aumenta el ataque y la defensa por 3 turnos.");
        this.attackBoost = 10;
        this.defenseBoost = 5;
        this.duration = 3;
    }

    public void use(Player player) {
        System.out.println("Has consumido la Gema de Fuerza. Ataque aumentado en " + attackBoost +
                " y defensa aumentada en " + defenseBoost + " por " + duration + " turnos.");
        // Aquí aplicaríamos lógica para aumentar temporalmente ataque y defensa
        // Puede implicar un seguimiento de turnos y reducción de los efectos al expirar
    }
}
