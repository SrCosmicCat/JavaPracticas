package modelos;

public class Triangulo {
    //Atributos
    double altura, base, area;
    
    //Constructor
    public Triangulo() {
        altura = base = area = 0;
        
    }
    //Metodos set
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setArea(double area) {
        this.area = area;
    }
    
    //Metodos get
    public double getArea() {
        return this.area;
    }
    public double getBase() {
        return this.base;
    }
    public double getAltura() {
        return this.altura;
    }
    
    //Metodo de cálculo
    public void calcularArea() {
        area = base * altura / 2;
    }
}
