package sumannumeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumaNNumeros {

    public static void main(String[] args) throws IOException {
        
        int i = 0, num, suma = 0;
        String respuesta = "si";
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        while (respuesta.equals("si")) {
            System.out.println("Escribe un número");
            num = Integer.parseInt(leer.readLine());
            suma += num;
            System.out.println("¿Quieres seguir sumando números?");
            respuesta = leer.readLine();
        }
        System.out.println("La suma es: " + suma);
    }
    
}
