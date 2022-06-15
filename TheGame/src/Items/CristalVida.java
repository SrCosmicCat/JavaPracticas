package Items;

import Personajes.Jugador;

public class CristalVida extends Item{
    
    public CristalVida(String nombre, int cantidad, Jugador jugador) {
        super(nombre, cantidad, jugador);
    }
    
    @Override
    public void usarItem(){
        super.getJugador().ganarVida(1);
    }
}
