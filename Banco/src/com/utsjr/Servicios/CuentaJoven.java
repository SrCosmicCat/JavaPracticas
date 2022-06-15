package com.utsjr.Servicios;

public class CuentaJoven extends Servicio{
    private Double saldo;
    private String nombreTutor;

    public CuentaJoven() {
    }
    
    public CuentaJoven(Double saldo, String nombreTutor, int id, String servicioAlta, String nombreCliente) {
        super(id, servicioAlta, nombreCliente);
        this.saldo = saldo;
        this.nombreTutor = nombreTutor;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNombreTutor() {
        return nombreTutor;
    }

    public void setNombreTutor(String nombreTutor) {
        this.nombreTutor = nombreTutor;
    }
    
    @Override
    public String toString() {
        return "---------------------------------\nID: "+Integer.toString(getId()) + "\nServicio Alta: " + super.getServicioAlta() + "\nNombre del cliente: " + super.getNombreCliente()+ "\nNombre del tutor: " + nombreTutor + "\nsaldo: $" + saldo;
    }
    
    @Override
    public String despedida(){
        return "Gracias por tu preferencia, estás en Cuenta Joven\n---------------------------------";
    }
    
}
