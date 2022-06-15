package tienda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tienda {

    public static void main(String[] args) throws IOException {
        /*String respuesta = "si";
        double pago, precioProducto, total = 0;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        
        while (respuesta.equalsIgnoreCase("si")) {
            System.out.println("¿Cuál es el precio del producto?");
            precioProducto = Double.parseDouble(leer.readLine());
            
            total += precioProducto;            
            
            System.out.println("¿Desea continuar? [si/no]");
            respuesta = leer.readLine();
        }
        
        System.out.println("¿Con cuánto va a pagar?");
            pago = Integer.parseInt(leer.readLine());
            
        //Caso donde sobra cambio
        if (pago > total) {
            System.out.println("El total a pagar es de: $" + total);
            System.out.println("Su cambio es de: $" + (pago - total));
            System.out.println("Gracias por su compra :3");
        }
        //Caso donde no alcanza con lo que el cliente paga
        else if (pago < total) {
            System.out.println("Error: No tiene fondos suficientes para realizar la compra");
        }
        //Caso donde el cliente paga exacto
        else {
            System.out.println("El total a pagar es de: $" + total);
            System.out.println("Gracias por su compra :3");
        }*/
           int i = 0;
           while (i<10+1) {
               System.out.println(i);
               i++;
           }
    }
    
}
