package Items;

import Personajes.Jugador;

public class Gato extends Item{
    
    public Gato() {
    }

    public Gato(String nombre, int cantidad, Jugador jugador) {
        super(nombre, cantidad, jugador);
    }
    
    @Override
    public void usarItem(){
        //Usar gato
    }
}
