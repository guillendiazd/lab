package lab7_davidguillen;

import java.awt.Color;
import java.util.ArrayList;

public class Jefes extends Persona{
    private String seccion_trabajo;
    ArrayList<Venta> venta = new ArrayList();
    ArrayList<Empleados> empleado = new ArrayList();
    private int numero_clientes;
    private int ganancias;

    public Jefes() {
        super();
    }

    public Jefes(String seccion_trabajo, int numero_clientes, int ganancias, int edad, String id, String nacionalidad, String lugar_nacimiento, String nombre, Color color_piel, Familiar familiar) {
        super(edad, id, nacionalidad, lugar_nacimiento, nombre, color_piel, familiar);
        this.seccion_trabajo = seccion_trabajo;
        this.numero_clientes = numero_clientes;
        this.ganancias = ganancias;
    }
    
    public String getSeccion_trabajo() {
        return seccion_trabajo;
    }

    public void setSeccion_trabajo(String seccion_trabajo) {
        this.seccion_trabajo = seccion_trabajo;
    }

    public ArrayList<Venta> getVenta() {
        return venta;
    }

    public void setVenta(ArrayList<Venta> venta_gatos) {
        this.venta = venta_gatos;
    }

    public ArrayList<Empleados> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ArrayList<Empleados> empleado) {
        this.empleado = empleado;
    }

    public int getNumero_clientes() {
        return numero_clientes;
    }

    public void setNumero_clientes(int numero_clientes) {
        this.numero_clientes = numero_clientes;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    @Override
    public String toString() {
        return "Jefes{" + "seccion_trabajo=" + seccion_trabajo + ", venta=" + venta + ", empleado=" + empleado + ", numero_clientes=" + numero_clientes + ", ganancias=" + ganancias + '}';
    }
    
}
