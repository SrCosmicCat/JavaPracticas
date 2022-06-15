package com.utsjr.figuras;


public class Circulo extends Figura{
    private double radio;
    
    public Circulo(){
    }

    public Circulo(double radio, String colorRelleno, String colorLinea, int numeroLados, double area) {
        super(colorRelleno, colorLinea, numeroLados, area);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void calcularArea(){
        super.setArea(Math.PI * Math.pow(radio, 2)); 
    }
}
