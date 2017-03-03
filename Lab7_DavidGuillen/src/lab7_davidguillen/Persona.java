package lab7_davidguillen;

import java.awt.Color;

public class Persona {
    private int edad;
    private String nacionalidad;
    private String lugar_nacimiento;
    private String nombre;
    private Color color_piel;
    private Familiar familiar;

    public Persona() {
    }

    public Persona(int edad, String nacionalidad, String lugar_nacimiento, String nombre, Color color_piel, Familiar familiar) {
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.lugar_nacimiento = lugar_nacimiento;
        this.nombre = nombre;
        this.color_piel = color_piel;
        this.familiar = familiar;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor_piel() {
        return color_piel;
    }

    public void setColor_piel(Color color_piel) {
        this.color_piel = color_piel;
    }

    public Familiar getFamiliar() {
        return familiar;
    }

    public void setFamiliar(Familiar familiar) {
        this.familiar = familiar;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nacionalidad=" + nacionalidad + ", lugar_nacimiento=" + lugar_nacimiento + ", nombre=" + nombre + ", color_piel=" + color_piel + ", familiar=" + familiar + '}';
    }
    
}
