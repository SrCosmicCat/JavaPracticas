package empresa;

import com.utsjr.modelos.Empleado;
import com.utsjr.modelos.Proveedor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Empresa {
    static BufferedReader leer = new BufferedReader(new InputStreamReader((System.in)));

    public static void main(String[] args) throws IOException {
        
        int opcion = 0;
        
        while(opcion != 3){   
            System.out.println("1. Esclaviza Empleados");
            System.out.println("2. Esclaviza Proveedor");
            System.out.println("3. Salir");
            System.out.println("Escoja una opción");
            opcion = Integer.parseInt(leer.readLine());

            switch (opcion){
                case 1: capturarEmpleados(); break;
                case 2: capturarProveedores(); break;
                case 3: break;
                default: System.out.println("Opción no válida");
            }
        }
    }
    
    public static void capturarEmpleados() throws IOException{
        Empleado empleado = new Empleado();
        
        //Métodos clase padre
        System.out.println("Nombre ");
        empleado.setNombre(leer.readLine());
        System.out.println("Dirección ");
        empleado.setDireccion(leer.readLine());
        System.out.println("Celular ");
        empleado.setCelular(leer.readLine());
        
        //Métodos clase hija
        System.out.println("Area ");
        empleado.setArea(leer.readLine());
        System.out.println("Sueldo ");
        empleado.setSueldo(Double.parseDouble(leer.readLine()));
        System.out.println("Puesto ");
        empleado.setPuesto(leer.readLine());
        System.out.println("Subordinados ");
        empleado.setSubordinados(Integer.parseInt(leer.readLine()));
        
        System.out.println(empleado);
        
        
    }
    public static void capturarProveedores() throws IOException{
        Proveedor proveedor = new Proveedor();
        
        //Métodos clase padre
        System.out.println("Nombre ");
        proveedor.setNombre(leer.readLine());
        System.out.println("Dirección ");
        proveedor.setDireccion(leer.readLine());
        System.out.println("Celular ");
        proveedor.setCelular(leer.readLine());
        
        //Métodos clase hija
        System.out.println("Material o servicio ");
        proveedor.setMateriaServicio(leer.readLine());
        System.out.println("Provision máxima ");
        proveedor.setProvisionMaxima(Integer.parseInt(leer.readLine()));
    
        System.out.println(proveedor);
    }
    
}
