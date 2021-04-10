package Laboratorio0.Ejercicio4;

import java.util.Date;

public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido;
    private int edad;
    Fecha fechaNac;

    public FrecuenciasCardiacas(String nombre, String apellido, String fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = new Fecha(fecha);
        this.edad = fechaNac.calcularEdad();
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int calcularFrecuenciaCardMaxima(){
        return (int) ((220-(this.edad))*0.7);
    }

    public double calcularFrecuenciaCardEsperada(){
        double PORCENTAJE_TRABAJO = 0.8;
        int FREC_REPOSO = 84;
        return ((this.calcularFrecuenciaCardMaxima()- FREC_REPOSO) * (PORCENTAJE_TRABAJO))+ FREC_REPOSO;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre +
                "\nApellido: " + this.apellido +
                "\nFecha de Nacimiento: " + this.fechaNac +
                "\nEdad: " + this.edad +
                "\nFrecuencia cardíaca máxima: " + this.calcularFrecuenciaCardMaxima() + "ppm" +
                "\nFrecuencia cardíaca esperada: " + this.calcularFrecuenciaCardEsperada() + "ppm";
    }
}
