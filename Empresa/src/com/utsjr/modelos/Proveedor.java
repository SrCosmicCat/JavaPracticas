package com.utsjr.modelos;


public class Proveedor extends Persona{
    private String materiaServicio;
    private int provisionMaxima;

    public Proveedor(){
        
    }
    public Proveedor(String materiaServicio, int provisionMaxima, String nombre, String direccion, String celular) {
        super(nombre, direccion, celular);
        this.materiaServicio = materiaServicio;
        this.provisionMaxima = provisionMaxima;
    }

    public String getMateriaServicio() {
        return materiaServicio;
    }

    public void setMateriaServicio(String materiaServicio) {
        this.materiaServicio = materiaServicio;
    }

    public int getProvisionMaxima() {
        return provisionMaxima;
    }

    public void setProvisionMaxima(int provisionMaxima) {
        this.provisionMaxima = provisionMaxima;
    }
    
    public void texto(){
        String nuevoTexto = super.getNombre() + " proveedor de"+materiaServicio;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "materiaServicio=" + materiaServicio + ", provisionMaxima=" + provisionMaxima + '}';
    }
    
    
}
