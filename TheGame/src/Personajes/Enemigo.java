package Personajes;

public class Enemigo extends Personaje{
    private Jugador jugador;
    private boolean estadoMuerte = false;

    public Enemigo() {
    }

    public Enemigo(String nombre, int vida, int ataque, Jugador jugador) {
        super(nombre, vida, ataque);
        this.jugador = jugador;
    }
    
    //Funciones
    public void atacarJugador() {
        jugador.perderVida(super.getAtaque());
    }
    
    public boolean muerte() {
        return estadoMuerte;
    }
    
    @Override
    public void perderVida(int value) {
        if (super.getVida() > 1) {
            super.setVida(super.getVida()-value);
        }
        else {
            estadoMuerte = true;
        }
    }
}
