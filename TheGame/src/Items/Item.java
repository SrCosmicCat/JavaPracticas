package Items;

import Personajes.Jugador;

public abstract class Item {
    private String nombre;
    private int cantidad;
    private Jugador jugador;
    
    public Item() {
    }
    
    public Item(String nombre, int cantidad, Jugador jugador) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.jugador = jugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    //Funciones
    public abstract void usarItem();
}
