package Armadura.Armor;

public class Armor {
    private String name;
    private int defense;
    private ArmorType type;
    private int durability;
    private int maxDurability; // Valor opcional para límite de durabilidad

    // Constructor con durabilidad máxima opcional
    public Armor(String name, int defense, ArmorType type, int durability, int maxDurability) {
        this.name = name;
        this.defense = Math.max(defense, 0); // Asegurar defensa no negativa
        this.type = type;
        this.durability = Math.max(durability, 0); // Evitar durabilidad negativa al crear
        this.maxDurability = maxDurability > 0 ? maxDurability : Integer.MAX_VALUE; // Máximo opcional
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getDefense() {
        return defense;
    }

    public ArmorType getType() {
        return type;
    }

    public int getDurability() {
        return durability;
    }

    public int getMaxDurability() {
        return maxDurability;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDefense(int defense) {
        if (defense >= 0) {
            this.defense = defense;
        }
    }

    public void setType(ArmorType type) {
        this.type = type;
    }

    public void setDurability(int durability) {
        this.durability = Math.min(Math.max(durability, 0), maxDurability); // Asegurar durabilidad dentro de los límites
    }

    public void setMaxDurability(int maxDurability) {
        this.maxDurability = maxDurability > 0 ? maxDurability : Integer.MAX_VALUE;
    }

    // Reducir durabilidad al recibir daño
    public void takeDamage(int damage) {
        if (damage > 0) {
            this.durability = Math.max(this.durability - damage, 0);
        }
    }

    // Reparar la armadura sin sobrepasar la durabilidad máxima
    public void repair(int amount) {
        if (amount > 0) {
            this.durability = Math.min(this.durability + amount, maxDurability); // Asegura que no sobrepase el máximo
        }
    }

    @Override
    public String toString() {
        return "Armor{" +
                "name='" + name + '\'' +
                ", defense=" + defense +
                ", type=" + type +
                ", durability=" + durability +
                ", maxDurability=" + maxDurability +
                '}';
    }
}
