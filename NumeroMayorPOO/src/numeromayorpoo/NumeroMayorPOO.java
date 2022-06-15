package numeromayorpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumeroMayorPOO {
    public static String numeroMayor(int numero1, int numero2) {
        
        return numero1 == numero2 ? "Ambos números son iguales" : numero1 > numero2 ? "El primer número es mayor al segundo": "El segundo número es mayor al primero";
        
    } 

    public static void main(String[] args) throws IOException {
        int numero1, numero2;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Introduzca el valor del primer número");
        numero1 = Integer.parseInt(leer.readLine());
        System.out.println("Introduzca el valor del segundo número");
        numero2 = Integer.parseInt(leer.readLine());
        
        System.out.println(numeroMayor(numero1,numero2));
        
    }
    
}
