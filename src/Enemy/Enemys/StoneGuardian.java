package Enemy.Enemys;

/*
   Esta clase representa un enemigo específico en el juego, el StoneGuardian.
   Extiende la clase Enemy y personaliza las estadísticas y el comportamiento de ataque del StoneGuardian.
*/

import Player.Player;
import Enemy.Enemys.Enemy;

public class StoneGuardian extends Enemy { // Cambiado el nombre de GolemCristal a StoneGuardian
    public StoneGuardian() {
        super("StoneGuardian", 150, 50, 25, "Una criatura robusta y resistente, formada por roca y minerales.");
    }

    @Override
    public void attack(Player player) {
        System.out.println(getName() + " lanza un poderoso golpe con sus puños de piedra!");
        player.takeDamage(getAttackPower());
    }
}
