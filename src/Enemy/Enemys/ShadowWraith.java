package Enemy.Enemys;

/*
   Esta clase representa un enemigo específico en el juego, el ShadowWraith.
   Extiende la clase Enemy y personaliza las estadísticas y el comportamiento de ataque del ShadowWraith.
*/

import Player.Player;
import Enemy.Enemys.Enemy;

public class ShadowWraith extends Enemy { // Cambiado el nombre de DragonHielo a ShadowWraith
    public ShadowWraith() {
        super("ShadowWraith", 100, 40, 20, "Una criatura espectral que ataca desde las sombras con poder oscuro.");
    }

    @Override
    public void attack(Player player) {
        System.out.println(getName() + " lanza un ataque sombrío!");
        player.takeDamage(getAttackPower());
    }
}
