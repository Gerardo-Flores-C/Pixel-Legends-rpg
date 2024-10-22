package Inventory;

import Items.Item;
import Items.Armaduras.Armor;
import Items.Miscs.Misc;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private final List<Item> items; // Cambiado a List para mayor flexibilidad
    private int capacity;

    public Inventory(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (items.size() < capacity) {
            items.add(item);
        } else {
            JOptionPane.showMessageDialog(null, "El inventario está lleno."); // Notificación visual
        }
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public Item getItem(int index) {
        if (index < 0 || index >= items.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de los límites del inventario.");
        }
        return items.get(index);
    }

    public int getItemCount() {
        return items.size();
    }

    public boolean isFull() {
        return items.size() >= capacity;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void clear() {
        items.clear();
    }

    public void increaseCapacity(int amount) {
        capacity += amount;
        items.isEmpty();
    }

    public ArrayList<Armor> getArmors() {
        ArrayList<Armor> armors = new ArrayList<>();
        for (Item item : items) {
            if (item instanceof Armor) {
                armors.add((Armor) item);
            }
        }
        return armors;
    }

    public ArrayList<Misc> getMiscs() {
        ArrayList<Misc> miscs = new ArrayList<>();
        for (Item item : items) {
            if (item instanceof Misc) {
                miscs.add((Misc) item);
            }
        }
        return miscs;
    }
}
