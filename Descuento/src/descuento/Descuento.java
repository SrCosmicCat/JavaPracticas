package descuento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Descuento {

    public static void main(String[] args) throws IOException {
        String dia;
        double precio, precioTotal;
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Introduzca el precio del producto: $");
        precio = Integer.parseInt(leer.readLine());
        
        System.out.print("Introduzca el día de hoy: ");
        dia = leer.readLine();
        
        if (dia.equals("lunes")) {
            precioTotal = precio * 0.9;
        } 
        else {
            precioTotal = precio;
        }
        
        System.out.println("El costo total es de: $"+precioTotal);
        
    }
    
}
