package lab7_davidguillen;

import java.util.ArrayList;

public class Clientes {
    private int ticket;
    private int dinero;
    ArrayList<Ordenes> ordenes = new ArrayList();

    public Clientes() {
    }

    public Clientes(int ticket, int dinero) {
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
