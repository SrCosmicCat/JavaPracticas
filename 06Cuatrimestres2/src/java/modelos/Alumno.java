package modelos;

public class Alumno {
    String nombre, grupo;
    int cuatrimestre, cuatrimestreRestante;

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    

    public Alumno(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public int getCuatrimestreRestante() {
        return cuatrimestreRestante;
    }

    public void setCuatrimestreRestante() {
        this.cuatrimestreRestante = 11 - cuatrimestre;
    }
}
