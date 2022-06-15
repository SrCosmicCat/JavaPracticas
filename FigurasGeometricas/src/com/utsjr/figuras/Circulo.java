package com.utsjr.figuras;

public class Circulo extends Figura{
    private Double radio;

    public Circulo() {
    }

    public Circulo(Double radio, Double perimetro, Double area, String color) {
        super(perimetro, area, color);
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        super.setArea(Math.PI*Math.pow(radio,2));
    }
    @Override
    public void calcularPerimetro() {
        super.setPerimetro(2*Math.PI*radio);
    }
    
}
