package com.utsjr.figuras;

public class Rectangulo extends Figura{
    int numLados;
    private Double base, altura;

    public Rectangulo() {
    }

    public Rectangulo(int numLados, Double base, Double altura, Double perimetro, Double area, String color) {
        super(perimetro, area, color);
        this.numLados = numLados;
        this.base = base;
        this.altura = altura;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    @Override
    public void calcularArea() {
        super.setArea(base*altura);
    }
    @Override
    public void calcularPerimetro() {
        super.setPerimetro(base*2+altura*2);
    }
    
}
