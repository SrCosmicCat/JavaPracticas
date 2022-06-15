package Items;

import Personajes.Jugador;

public class Inventory {
    Jugador jugador;
    
    /* 
        0 - gato
        1 - slime
        3 - cristal de vida
        4 - cristal de ataque
        5 - llave
    */

    public Inventory(Jugador jugador) {
        this.jugador = jugador;
    }
    
    //Contadores de Objetos
    Item[] items = new Item[3];
    
    public void actualizar() {
        Item[] up = { new Gato("Gato",4,jugador), new Slime("Slime",0,jugador), new CristalVida("Cristal de vida",10,jugador) };
        
        items = up;
    }
    
    public String[] getItem(int id) {
        String[] item = {items[id].getNombre(),Integer.toString(items[id].getCantidad())};
        return item;
    }
    
    public Item[] getAllItems() {
        return items;
    }
    
    public String getInventory() {
        String listaItems = "Item | Nombre | Cantidad \n----------------------------\n";
        for (int i=0;i<items.length;i++) {
            listaItems = listaItems + Integer.toString(i)+ "    | " + items[i].getNombre() + " | " + Integer.toString(items[i].getCantidad()) + "\n";
        }
        return listaItems;
    }
    
    public void vaciarInventario() {
        for (Item item : items) {
            item.setCantidad(0);
        }
    }
    
    public void agregarItem(int id) {
        items[id].setCantidad(items[id].getCantidad()+1);
    }
    
    public void quitarItem(int id) {
        if (items[id].getCantidad() > 0) {
            items[id].setCantidad(items[id].getCantidad()-1);
        }
    }
}
