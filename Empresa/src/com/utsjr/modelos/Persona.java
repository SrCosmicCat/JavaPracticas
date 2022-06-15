package com.utsjr.modelos;
    

public class Persona {
    private String nombre, direccion, celular;

    public Persona() {
    }

    public Persona(String nombre, String direccion, String celular) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.celular = celular;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
}
