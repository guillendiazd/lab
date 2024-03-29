package lab7_davidguillen;

import java.awt.Color;
import java.util.ArrayList;

public class Clientes extends Persona{
    private int ticket;
    private int dinero;
    ArrayList<Ordenes> ordenes = new ArrayList();

    public Clientes() {
        super();
    }

    public Clientes(int ticket, int dinero, int edad, String id, String nacionalidad, String lugar_nacimiento, String nombre, Color color_piel, Familiar familiar) {
        super(edad, id, nacionalidad, lugar_nacimiento, nombre, color_piel, familiar);
        this.ticket = ticket;
        this.dinero = dinero;
    }
    
    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Ordenes> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<Ordenes> ordenes) {
        this.ordenes = ordenes;
    }

    @Override
    public String toString() {
        return "Clientes{" + "ticket=" + ticket + ", dinero=" + dinero + ", ordenes=" + ordenes + '}';
    }
    
}
