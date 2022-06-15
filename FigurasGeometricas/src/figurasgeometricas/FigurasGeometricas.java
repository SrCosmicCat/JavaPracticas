package figurasgeometricas;

import com.utsjr.figuras.Circulo;
import com.utsjr.figuras.Rectangulo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FigurasGeometricas {

static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("Elija una opción: \n 1. Capturar Círculo \n 2. Capturar Rectángulo \n 3. Salir");
            opcion = Integer.parseInt(leer.readLine());
            
            switch (opcion) {
                case 1: capturarCirculo(); break;
                case 2: capturarRectangulo(); break;
                case 3: break;
                default: System.out.println("Opción no válida");
            }
        }
        
    }
    public static void capturarRectangulo() throws IOException{
        Rectangulo rectangulo = new Rectangulo();
        
        System.out.println("Color:");
        rectangulo.setColor(leer.readLine());
        System.out.println("Base:");
        rectangulo.setBase(Double.parseDouble(leer.readLine()));
        System.out.println("Altura:");
        rectangulo.setAltura(Double.parseDouble(leer.readLine()));
        System.out.println("Número de lados:");
        rectangulo.setNumLados(Integer.parseInt(leer.readLine()));
        
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
        
        System.out.println("Area: "+rectangulo.getArea());
        System.out.println("Perimetro: "+rectangulo.getPerimetro());
    }
    public static void capturarCirculo() throws IOException{
        Circulo circulo = new Circulo();
        
        System.out.println("Color:");
        circulo.setColor(leer.readLine());
        System.out.println("Radio:");
        circulo.setRadio(Double.parseDouble(leer.readLine()));
        
        circulo.calcularArea();
        circulo.calcularPerimetro();
        
        System.out.println("Area: "+circulo.getArea());
        System.out.println("Perimetro: "+circulo.getPerimetro());
    }
    
    
}
