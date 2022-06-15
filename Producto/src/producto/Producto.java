package producto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Producto {
    
 
    public static void main(String[] args) throws IOException {
        String producto;
        int cantidad;
        double precio, totalPagar;
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Introduzca el nombre del producto");
        producto = leer.readLine();
        
        System.out.println("Introduzca el precio del producto");
        precio = Double.parseDouble(leer.readLine());
        
        System.out.println("Introduzca la cantidad de productos adquiridos");
        cantidad = Integer.parseInt(leer.readLine());
        
        /*------------------------------------------------------------------------*/
        
        totalPagar = precio * cantidad;
        System.out.println("El total a pagar es de: $" + totalPagar);
        
    }
    
}
