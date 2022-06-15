package Eventos;

import Personajes.Jugador;

public abstract class Evento {
    private int id;
    private String descripcion;
    private Jugador jugador;

    public Evento(){
    }
    
    public Evento(int id, String descripcion, Jugador jugador) {
        this.id = id;
        this.descripcion = descripcion;
        this.jugador = jugador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    //Funciones
    public abstract void activarEvento();
    public abstract String getRespuesta();
}
