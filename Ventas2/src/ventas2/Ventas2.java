package ventas2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ventas2 {


    public static void main(String[] args) throws IOException {
       int hora;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("¿Qué hora es? [Introduzca la hora en formato de 24 horas sin minutos]");
        hora = Integer.parseInt(leer.readLine());
        
        if (hora >= 8 && hora <= 18) { 
            System.out.println("Venta autorizada");
        }
        else {
            if (hora < 8) {
                System.out.println("Regresa en "+ (8 - hora) + " horas");
            }
            else {
                System.out.println("Regresa mañana");
            }
        }
    }
    
}
