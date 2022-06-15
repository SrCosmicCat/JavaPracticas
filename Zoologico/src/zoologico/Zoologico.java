package zoologico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zoologico {
    static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int opcion = 0;
        
        while (opcion != 3) {
            
            System.out.println("Seleccione una opción \n 1. Registrar animal doméstico \n 2. Registrar animal salvaje \n 3. Salir");
            opcion = Integer.parseInt(leer.readLine());
            
            switch (opcion) {
                case 1: registrarDomestico(); break;
                case 2: registrarSalvaje(); break;
                case 3: break;
                default: System.out.println("Opción no válida");
            }
        }
    }
    
    public static void registrarDomestico() {
        
    }
    
    public static void registrarSalvaje() {
        
    }
}
