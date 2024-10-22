package Gui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    // Definición de constantes para el tamaño de la ventana
    private static final int WINDOW_WIDTH = 800;  // Ancho de la ventana
    private static final int WINDOW_HEIGHT = 600; // Alto de la ventana

    public MainWindow() {
        // Establecer el título de la ventana
        setTitle("Nebula Warriors RPG");

        // Establecer el tamaño de la ventana usando constantes
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Establecer la operación de cierre predeterminada
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Establecer el layout del panel principal
        setLayout(new BorderLayout());

        // Inicializar los paneles
        JPanel statusBar = new JPanel();
        JPanel gamePanel = new JPanel();
        JPanel actionBar = new JPanel();

        // Configurar los tamaños de los paneles
        statusBar.setPreferredSize(new Dimension(WINDOW_WIDTH, 150)); // Barra de Estado
        gamePanel.setPreferredSize(new Dimension(WINDOW_WIDTH, 370)); // Panel de Juego
        actionBar.setPreferredSize(new Dimension(WINDOW_WIDTH, 340)); // Barra de Acción

        // Establecer colores de fondo
        statusBar.setBackground(Color.ORANGE); // Color de fondo para la barra de estado
        gamePanel.setBackground(Color.WHITE); // Color de fondo para el panel de juego
        actionBar.setBackground(Color.RED); // Color de fondo para la barra de acción

        // Agregar los paneles al panel principal
        add(statusBar, BorderLayout.NORTH);
        add(gamePanel, BorderLayout.CENTER);
        add(actionBar, BorderLayout.SOUTH);

        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);

        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        // Crear la ventana principal en el hilo de despacho de eventos
        SwingUtilities.invokeLater(MainWindow::new);
    }
}
