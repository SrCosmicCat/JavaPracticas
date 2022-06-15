package com.utsjr.figuras;

public class Figura {
    private String colorRelleno, colorLinea;
    private int numeroLados;
    private double area;

    public Figura() {
    }

    public Figura(String colorRelleno, String colorLinea, int numeroLados, double area) {
        this.colorRelleno = colorRelleno;
        this.colorLinea = colorLinea;
        this.numeroLados = numeroLados;
        this.area = area;
    }

    public String getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    public String getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(String colorLinea) {
        this.colorLinea = colorLinea;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
}
