import java.util.Scanner;

public class Ejercicio3_2 {
    public static void main(String[] args) {
        // Ingresar el número cifrado
        // Intercambiar el primero con el tercero
        // Intercambiar el segundo con el cuarto
        // Realizar la operación inversa

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        String numero;
        numero = s.nextLine();

        int[] cadena = new int[numero.length()];
        int[] cadenaNueva = new int[numero.length()];

        for(int i = 0; i < cadena.length; i++){
            cadena[i] = Integer.parseInt(String.valueOf(numero.charAt(i)));
        }

        // Intercambiando el primero con el tercero
        int aux = cadena[0];
        int aux2 = cadena[2];
        cadena[0] = aux2;
        cadena[2] = aux;

        // Intercambiando el segundo con el cuarto
        int aux1 = cadena[1];
        int aux3 = cadena[3];
        cadena[1] = aux3;
        cadena[3] = aux1;

        for(int i = 0; i < cadena.length; i++){
            // Sumando 10 y restando 7 al número
            int al = 0, sum = 0, res = 0;
            al = cadena[i]; // 1
            sum = al+10; // 11
            res = sum-7; // 4
            cadenaNueva[i] = res;
        }

        for (int i = 0; i < cadenaNueva.length; i++){
            System.out.println(cadenaNueva[i]);
        }
    }
}
