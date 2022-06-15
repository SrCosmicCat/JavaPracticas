package com.utsjr.Servicios;

public abstract class Servicio {
    private int id;
    private String servicioAlta, nombreCliente;

    public Servicio() {
    }

    public Servicio(int id, String servicioAlta, String nombreCliente) {
        this.id = id;
        this.servicioAlta = servicioAlta;
        this.nombreCliente = nombreCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServicioAlta() {
        return servicioAlta;
    }

    public void setServicioAlta(String servicioAlta) {
        this.servicioAlta = servicioAlta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    public abstract String despedida();
}
