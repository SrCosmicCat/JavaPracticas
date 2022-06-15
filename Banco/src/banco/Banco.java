package banco;

import com.utsjr.Servicios.Cuenta;
import com.utsjr.Servicios.CuentaJoven;
import com.utsjr.Servicios.Prestamo;
import com.utsjr.Servicios.Servicio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Banco {
static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
static Servicio servicio;
static int id = 651;

    public static void main(String[] args) throws IOException {
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("---BANCO LAS AMÉRICAS--- \nPor favor seleccione una opción: \n 1. Capturar Cuenta \n 2. Capturar Cuenta Joven \n 3. Capturar Préstamo \n 4. Salir");
            opcion = Integer.parseInt(leer.readLine());
            
            switch (opcion) {
                case 1: capturaCuenta(); break;
                case 2: capturaCuentaJoven(); break;
                case 3: capturaPrestamo(); break;
                case 4: break;
                default: System.out.println("Opción no válida");
            }
        }
    }
    
    public static void capturaCuenta() throws IOException{
        System.out.println("Saldo:");
        Double saldo = Double.parseDouble(leer.readLine());
        //System.out.println("Id:");   <--- Se introduce desde código para que incremente automáticamente
        System.out.println("Servicio Alta:");
        String servicioAlta = leer.readLine();
        System.out.println("Nombre del Cliente:");
        String nombreCliente = leer.readLine();
        
        servicio = new Cuenta(saldo,id,servicioAlta,nombreCliente);
        
        id++;
        
        System.out.println(servicio.toString());
        System.out.println(servicio.despedida());
    }
    
    public static void capturaCuentaJoven() throws IOException{
        System.out.println("Saldo:");
        Double saldo = Double.parseDouble(leer.readLine());
        System.out.println("Nombre del Tutor:");
        String nombreTutor = leer.readLine();
        //System.out.println("Id:");   <--- Se introduce desde código para que incremente automáticamente
        System.out.println("Servicio Alta:");
        String servicioAlta = leer.readLine();
        System.out.println("Nombre del Cliente:");
        String nombreCliente = leer.readLine();
        
        servicio = new CuentaJoven(saldo,nombreTutor,id,servicioAlta,nombreCliente);
        
        id++;
        
        System.out.println(servicio.toString());
        System.out.println(servicio.despedida());
    }
    
    public static void capturaPrestamo() throws IOException{
        System.out.println("Monto Solicitado:");
        Double montoSolicitado = Double.parseDouble(leer.readLine());
        //System.out.println("Id:");   <--- Se introduce desde código para que incremente automáticamente
        System.out.println("Servicio Alta:");
        String servicioAlta = leer.readLine();
        System.out.println("Nombre del Cliente:");
        String nombreCliente = leer.readLine();
        
        servicio = new Prestamo(montoSolicitado,id,servicioAlta,nombreCliente);
        
        id++;
        
        System.out.println(servicio.toString());
        System.out.println(servicio.despedida());
    }
}
