package Enemy.Enemys;

/*
   Esta clase representa un enemigo específico en el juego, el CursedKnight.
   Extiende la clase Enemy y personaliza las estadísticas y el comportamiento de ataque del CursedKnight.
*/

import Player.Player;
import Enemy.Enemys.Enemy;

public class CursedKnight extends Enemy { // Cambiado el nombre de QuimeraMutante a CursedKnight
    public CursedKnight() {
        super("CursedKnight", 110, 50, 15, "Un caballero maldito, lleno de odio y poder oscuro.");
    }

    @Override
    public void attack(Player player) {
        System.out.println(getName() + " golpea con su espada maldita!");
        player.takeDamage(getAttackPower());
    }
}
