package lab7_davidguillen;
public class Gatos {
    private int precio;
    private int peso;
    private int altura;

    public Gatos() {
    }

    public Gatos(int precio, int peso, int altura) {
        this.precio = precio;
        this.peso = peso;
        this.altura = altura;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Gatos{" + "precio=" + precio + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
}
