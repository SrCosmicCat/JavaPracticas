package com.utsjr.modelos;


public class Empleado extends Persona{
    String puesto, area;
    Double sueldo;
    int subordinados;

    public Empleado() {
    }

    public Empleado(String puesto, String area, Double sueldo, int subordinados, String nombre, String direccion, String celular) {
        super(nombre, direccion, celular);
        this.puesto = puesto;
        this.area = area;
        this.sueldo = sueldo;
        this.subordinados = subordinados;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public int getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(int subordinados) {
        this.subordinados = subordinados;
    }
    
    
    public void texto(){
        String nuevoTexto = super.getNombre()+" es un "+this.puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "puesto=" + puesto + ", area=" + area + ", sueldo=" + sueldo + ", subordinados=" + subordinados + '}';
    }
    
    
    
}
