package com.utsjr.figuras;

public abstract class Figura {
    private Double perimetro, area;
    private String color;

    public Figura() {
    }
    
    public Figura(Double perimetro, Double area, String color) {
        this.perimetro = perimetro;
        this.area = area;
        this.color = color;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract void calcularArea();
    public abstract void calcularPerimetro();
    
}
