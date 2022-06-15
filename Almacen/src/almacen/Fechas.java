package almacen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Fechas {

    public static void main(String[] args) throws ParseException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/mm/dd");
        Almacen producto = new Almacen();
        
        producto.setProducto("Queso");
        producto.setCantidad(29);
        producto.setFecha(formato.parse("2022/01/31"));
        
        System.out.println("Fecha "+formato.format(producto.getFecha()));
    }
    
}
