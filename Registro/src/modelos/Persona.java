package modelos;

public class Persona {
    String nombre, estudios;
    
    public Persona() {
        
    }
    public Persona(String nombre, String estudios) {
        this.nombre = nombre;
        this.estudios = estudios;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEstudios() {
        return estudios;
    }
}
