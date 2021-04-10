package Laboratorio0.Ejercicio4;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Crear clase FrecuenciasCardiaca

        // Atributos
            // nombre
            // apellido
            // fecha de nacimiento (hace referencia a un obj de una clase que incluya mes dia y año)
        // La clase debe tener un constructor que reciba dichos datos como parámetros
        // Cada atributo debe tener set y get (6 en total)

            // Methods
            // Calcula y devuelve la edad de la personas en años
            // Calcula y devuelve la frecuencia cardíaca maxima
            // Calcula y devuelve la frecuencia cardíaca esperada
                // Para calcular la frecuencia cardiaca esperada ver: https://www.vitonica.com/entrenamiento/calcula-tu-frecuencia-cardiaca-maxima
        FrecuenciasCardiacas f = new FrecuenciasCardiacas("Juan","Peres","4 12 2010");
        System.out.println(f);

    }
}
