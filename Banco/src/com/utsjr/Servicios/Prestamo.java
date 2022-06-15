package com.utsjr.Servicios;

public class Prestamo extends Servicio{
    private Double montoSolicitado;

    public Prestamo() {
    }
    
    public Prestamo(Double montoSolicitado, int id, String servicioAlta, String nombreCliente) {
        super(id, servicioAlta, nombreCliente);
        this.montoSolicitado = montoSolicitado;
    }

    public Double getMontoSolicitado() {
        return montoSolicitado;
    }

    public void setMontoSolicitado(Double montoSolicitado) {
        this.montoSolicitado = montoSolicitado;
    }
    
    @Override
    public String toString() {
        return "---------------------------------\nID: "+Integer.toString(getId()) + "\nServicio Alta: " + super.getServicioAlta() + "\nNombre del cliente: " + super.getNombreCliente() + "\nMonto Solicitado: $" + montoSolicitado;
    }
    
    @Override
    public String despedida(){
        return "Gracias por tu preferencia, estás en Préstamo\n---------------------------------";
    }
    
}
