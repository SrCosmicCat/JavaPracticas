package com.utsjr.Servicios;

public class Cuenta extends Servicio{
    private Double saldo;

    public Cuenta() {
    }
    
    public Cuenta(Double saldo, int id, String servicioAlta, String nombreCliente) {
        super(id, servicioAlta, nombreCliente);
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "---------------------------------\nID: "+Integer.toString(super.getId()) + "\nServicio Alta: " + super.getServicioAlta() + 
                "\nNombre del cliente: " + super.getNombreCliente() + "\nsaldo: $" + saldo;
    }
    
    @Override
    public String despedida() {
        return "Gracias por tu preferencia, estás en Cuenta \n---------------------------------";
    }
}
