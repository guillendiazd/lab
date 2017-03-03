package lab7_davidguillen;
public class Empleados {
    private String trabajo;
    private int hora_entrada;
    private int hora_salida;
    private int sueldo;
    private String estado;

    public Empleados() {
    }

    public Empleados(String trabajo, int hora_entrada, int hora_salida, int sueldo, String estado) {
        this.trabajo = trabajo;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
        this.sueldo = sueldo;
        this.estado = estado;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public int getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(int hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public int getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(int hora_salida) {
        this.hora_salida = hora_salida;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Empleados{" + "trabajo=" + trabajo + ", hora_entrada=" + hora_entrada + ", hora_salida=" + hora_salida + ", sueldo=" + sueldo + ", estado=" + estado + '}';
    }
    
}
