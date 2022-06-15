package Personajes;

public class Jugador extends Personaje{
    private String datos;
    private boolean estadoMuerte = false;
    
    public Jugador() {
    }
    
    public Jugador(String nombre, int vida, int ataque) {
        super(nombre, vida, ataque);
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
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
    
    public void atacar(Enemigo enemigo) {
        enemigo.perderVida(super.getAtaque());
    }
}
