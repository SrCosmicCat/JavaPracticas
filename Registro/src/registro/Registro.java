package registro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import modelos.Persona;

public class Registro {


    public static void main(String[] args) {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        Persona persona = new Persona();
        persona.setNombre("Pepe");
        persona.setEstudios("Ingenieria");
    }
    
}
