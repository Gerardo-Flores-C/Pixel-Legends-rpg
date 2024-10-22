package Enemy.Enemys;

/*
   Esta clase representa un enemigo específico en el juego, la CrimsonSerpent.
   Extiende la clase Enemy y personaliza las estadísticas y el comportamiento de ataque de la CrimsonSerpent.
*/

import Player.Player;
import Enemy.Enemys.Enemy;

public class CrimsonSerpent extends Enemy { // Cambiado el nombre de SirenaVenenosa a CrimsonSerpent
    public CrimsonSerpent() {
        super("CrimsonSerpent", 80, 30, 10, "Una criatura hermosa pero letal, con veneno y un cuerpo serpenteante.");
    }

    @Override
    public void attack(Player player) {
        System.out.println(getName() + " lanza un ataque venenoso!");
        player.takeDamage(getAttackPower());
    }
}
