package Items;

import Personajes.Jugador;

public class Slime extends Item{
    
    public Slime(){
    }
    
    public Slime(String nombre, int cantidad, Jugador jugador) {
        super(nombre, cantidad, jugador);
    }
    
    @Override
    public void usarItem(){
        //Usar slime
    }
}
