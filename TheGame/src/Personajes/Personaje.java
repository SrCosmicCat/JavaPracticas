package Personajes;

public class Personaje {
    private String nombre;
    private int vida;
    private int ataque;
    
    public Personaje() {
    }

    public Personaje(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    //Funciones 
    public void ganarVida(int value) {
        vida += value;
    }
    
    public void perderVida(int value) {
        vida -= value;
    }
}
