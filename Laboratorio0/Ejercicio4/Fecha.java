package Laboratorio0.Ejercicio4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    private String cadenaFecha;

    public Fecha(String cadenaFecha) {
        this.cadenaFecha = cadenaFecha;
        convertirCadenaInt();
    }

    public String getCadenaFecha() {
        return cadenaFecha;
    }

    public void setCadenaFecha(String cadenaFecha) {
        this.cadenaFecha = cadenaFecha;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    private void convertirCadenaInt(){
        String[] partesFecha = this.cadenaFecha.split(" ");

        setMes(Integer.parseInt(partesFecha[0]));
        setDia(Integer.parseInt(partesFecha[1]));
        setAnio(Integer.parseInt(partesFecha[2]));
    }

    public int calcularEdad(){
        Calendar anioActual = new GregorianCalendar();
        return anioActual.get(Calendar.YEAR) - this.anio;
    }

    @Override
    public String toString() {
        return this.mes + "/" + this.dia + "/" + this.anio;
    }
}
