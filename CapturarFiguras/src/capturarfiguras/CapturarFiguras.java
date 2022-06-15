package capturarfiguras;

import com.utsjr.figuras.Circulo;
import com.utsjr.figuras.Cuadrado;
import com.utsjr.figuras.Triangulo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CapturarFiguras {
static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        var opcion = 0;
        
        while (opcion != 4) {
            System.out.println("Calcular el área de figuras");
            System.out.println("1. Circulo");
            System.out.println("2. Triángulo");
            System.out.println("3. Cuadrado");
            System.out.println("4. Salir");
            System.out.println("Escoja una opción");
            opcion = Integer.parseInt(leer.readLine());
            
            switch (opcion){
                case 1: capturarCirculo(); break;
                case 2: capturarTriangulo(); break;
                case 3: capturarCuadrado(); break;
                case 4: break;
                default: System.out.println("Opción no válida");
            }
        }        
    }
    
    //Capture Functions
    public static void capturarCirculo() throws IOException {
        Circulo circulo = new Circulo();
        
        System.out.println("Color de relleno: ");
        circulo.setColorRelleno(leer.readLine());
        System.out.println("Color de línea: ");
        circulo.setColorLinea(leer.readLine());
        System.out.println("Número de lados: ");
        circulo.setNumeroLados(Integer.parseInt(leer.readLine()));
        System.out.println("Radio: ");
        circulo.setRadio(Double.parseDouble(leer.readLine()));
        
        circulo.calcularArea();
        
        System.out.println("Area: "+ circulo.getArea());
    }
    
    public static void capturarTriangulo() throws IOException {
        Triangulo triangulo= new Triangulo();
        
        System.out.println("Color de relleno: ");
        triangulo.setColorRelleno(leer.readLine());
        System.out.println("Color de línea: ");
        triangulo.setColorLinea(leer.readLine());
        System.out.println("Número de lados: ");
        triangulo.setNumeroLados(Integer.parseInt(leer.readLine()));
        System.out.println("Base: ");
        triangulo.setBase(Double.parseDouble(leer.readLine()));
        System.out.println("Altura: ");
        triangulo.setAltura(Double.parseDouble(leer.readLine()));
        
        triangulo.calcularArea();
        
        System.out.println("Area: "+ triangulo.getArea());
    }
    
    public static void capturarCuadrado() throws IOException {
        Cuadrado cuadrado = new Cuadrado();
        
        System.out.println("Color de relleno: ");
        cuadrado.setColorRelleno(leer.readLine());
        System.out.println("Color de línea: ");
        cuadrado.setColorLinea(leer.readLine());
        System.out.println("Número de lados: ");
        cuadrado.setNumeroLados(Integer.parseInt(leer.readLine()));
        System.out.println("Lado: ");
        cuadrado.setLado(Double.parseDouble(leer.readLine()));
        
        cuadrado.calcularArea();
        
        System.out.println("Area: "+ cuadrado.getArea());
    }
}
