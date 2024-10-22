package Items;

import Enums.ItemCategory;

public abstract class Item {
    protected String name;             // Nombre del ítem
    protected String description;      // Descripción del ítem
    protected ItemCategory itemCategory; // Categoría del ítem

    // Constructor por defecto
    public Item(ItemCategory itemCategory) {
        this.itemCategory = itemCategory; // Inicializa la categoría, pero deja nombre y descripción como nulos
    }

    // Constructor que inicializa el ítem con su categoría
    public Item(String name, String description, ItemCategory itemCategory) {
        this.name = name;
        this.description = description;
        this.itemCategory = itemCategory;
    }

    // Método para obtener el nombre del ítem
    public String getName() {
        return name;
    }

    // Método para obtener la descripción del ítem
    public String getDescription() {
        return description;
    }

    // Método para obtener la categoría del ítem
    public ItemCategory getItemCategory() {
        return itemCategory;
    }
}
