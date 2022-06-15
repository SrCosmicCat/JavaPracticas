package almacen;

import java.util.Date;

public class Almacen {
    String producto;
    int cantidad;
    Date fecha;
    
    public Almacen() {
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Date getFecha() {
        return fecha;
    }
    
    
    
}
