import Enemy.Enemys.DarkwoodStalker;
import Enemy.Enemys.CursedKnight;
import Enemy.Enemys.CrimsonSerpent;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import Enemy.Enemys.*;
import Game.Game;
import Player.Player;

public class Main {
    public static void main(String[] args) {
        // Crear un jugador
        String playerName = JOptionPane.showInputDialog("Introduce el nombre del jugador:");
        if (playerName == null || playerName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nombre no válido. El juego se cerrará.");
            System.exit(0);
        }

        // Crear el jugador con nombre, salud, poder de ataque y defensa
        Player player = new Player(playerName, 100, 30, 50); // Salud, ataque, defensa

        // Crear una lista de enemigos
        List<Enemy> enemies = new ArrayList<>();
        try {
            enemies.add(new DarkwoodStalker());  // Instancia de la subclase Sombra Viviente
            enemies.add(new CursedKnight());      // Instancia de la subclase Quimera Mutante
            enemies.add(new CrimsonSerpent());    // Instancia de la subclase Sirena Venenosa
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear enemigos: " + e.getMessage());
            System.exit(1);
        }

        // Inicializar el juego
        Game game = new Game(player, enemies); // Asegúrate de que Game acepte una lista de enemigos

        // Iniciar el juego
        game.startGame();
    }
}
