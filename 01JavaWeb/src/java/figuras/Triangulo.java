package figuras;

public class Triangulo {
    double base, altura, area;

    public Triangulo() {
        
    }
    public Triangulo(double base, double altura, double area) {
        this.base = base;
        this.altura = altura;
        this.area = area;
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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public void calculateArea() {
        area = base * altura / 2;
    }
    
}
