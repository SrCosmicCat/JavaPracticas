package Eventos;

import Personajes.Enemigo;
import Personajes.Jugador;

public class EnemigoEvento extends Evento{
    Enemigo enemigo = new Enemigo("Monstruo genérico",3,1,super.getJugador());
    
    public EnemigoEvento() {
    }

    public EnemigoEvento(int id, String descripcion, Jugador jugador) {
        super(id, descripcion, jugador);
    }
    
    public void setEnemigo(Enemigo enemigo) {
        this.enemigo = enemigo;
    }
    
    public Enemigo getEnemigo() {
        return enemigo;
    }
    
    
    @Override
    public String getRespuesta() {
        return "Te encuentras con un enemigo de frente... Pierdes 1 de vida!";
    }
    
    @Override
    public void activarEvento() {
        enemigo.atacarJugador();
    }
}
