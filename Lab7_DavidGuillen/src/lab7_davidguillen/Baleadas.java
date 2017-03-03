package lab7_davidguillen;

import java.util.ArrayList;

public class Baleadas {
    private int precio;
    ArrayList<String> ingredientes = new ArrayList();

    public Baleadas() {
    }

    public Baleadas(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Baleadas{" + "precio=" + precio + ", ingredientes=" + ingredientes + '}';
    }
    
}
