package Armadura.Armor;

public class Main {
    public static void main(String[] args) {
        Armor helmet = new Armor("Iron Helmet", 5, ArmorType.HELMET, 100, 100); // Se añade maxDurability en el constructor
        Armor chestplate = new Armor("Steel Chestplate", 15, ArmorType.CHESTPLATE, 200, 200); // maxDurability añadido

        displayArmorInfo(helmet);
        displayArmorInfo(chestplate);

        // Simula que el casco recibe 20 de daño
        helmet.takeDamage(20);
        System.out.println("After taking damage: " + helmet);

        // Repara el casco
        helmet.repair(10);
        System.out.println("After repairing: " + helmet);
    }

    private static void displayArmorInfo(Armor armor) {
        System.out.println(armor);
    }
}
