package lab7_davidguillen;

import java.util.Date;

public class Venta {
    private String nombre_cliente;
    private String nombre_empleado;
    private int cantidad_articulos;
    private int total;
    private Date fecha;

    public Venta() {
    }

    public Venta(String nombre_cliente, String nombre_empleado, int cantidad_articulos, int total, Date fecha) {
        this.nombre_cliente = nombre_cliente;
        this.nombre_empleado = nombre_empleado;
        this.cantidad_articulos = cantidad_articulos;
        this.total = total;
        this.fecha = fecha;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public int getCantidad_articulos() {
        return cantidad_articulos;
    }

    public void setCantidad_articulos(int cantidad_articulos) {
        this.cantidad_articulos = cantidad_articulos;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Venta{" + "nombre_cliente=" + nombre_cliente + ", nombre_empleado=" + nombre_empleado + ", cantidad_articulos=" + cantidad_articulos + ", total=" + total + ", fecha=" + fecha + '}';
    }
    
}
