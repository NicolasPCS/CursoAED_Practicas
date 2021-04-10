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
        String nombre;
        String apellido;
        String fechaNac;

        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        nombre = s.nextLine();
        System.out.print("Ingrese su apellido: ");
        apellido = s.nextLine();
        System.out.print("Ingrese su fecha de nacimiento (dia mes anio): ");
        fechaNac = s.nextLine();

        FrecuenciasCardiacas f = new FrecuenciasCardiacas(nombre,apellido,fechaNac);
        System.out.println(f);

    }
}
