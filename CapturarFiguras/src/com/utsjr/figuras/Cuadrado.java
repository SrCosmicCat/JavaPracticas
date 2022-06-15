package com.utsjr.figuras;


public class Cuadrado extends Figura{
    private double lado;
    
    public Cuadrado(){    
    }

    public Cuadrado(String colorRelleno, String colorLinea, int numeroLados, double area, double lado) {
        super(colorRelleno, colorLinea, numeroLados, area);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public void calcularArea() {
        super.setArea(lado*lado);
    }
  
}
