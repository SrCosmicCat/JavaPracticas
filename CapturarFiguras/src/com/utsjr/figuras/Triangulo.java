package com.utsjr.figuras;


public class Triangulo extends Figura{
    private double base, altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura, String colorRelleno, String colorLinea, int numeroLados, double area) {
        super(colorRelleno, colorLinea, numeroLados, area);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void calcularArea() {
        super.setArea(base * altura / 2);
    }
}
