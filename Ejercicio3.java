import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Leer un entero de 4 digitos
        // A cada numero sumarle 7 y obtener el residuo despues de dividir el nuevo valor /10
        // Intercambiar el primer numero con el tercero
        // El segundo digito con el cuarto
        // Imprimir el entero cifrado

        // Inverso
        // Multiplicar x10 y sumar 7
        // Intercambiar el primer numero con el tercero
        // El segundo digito con el cuarto

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        String numero;
        numero = s.nextLine();

        int[] cadena = new int[numero.length()];
        int[] cadenaNueva = new int[numero.length()];

        for(int i = 0; i < cadena.length; i++){
            cadena[i] = Integer.parseInt(String.valueOf(numero.charAt(i)));
        }

        for(int i = 0; i < cadena.length; i++){
            // Sumando 7 a cada numero y obteniendo el res después de dividir por 10
            int al = 0, mul = 0, res = 0;
            al = cadena[i];
            mul = al+7;
            res = mul%10;
            cadenaNueva[i] = res;
        }

        // Intercambiando el primero con el tercero
        int aux = cadenaNueva[0];
        int aux2 = cadenaNueva[2];
        cadenaNueva[0] = aux2;
        cadenaNueva[2] = aux;

        // Intercambiando el segundo con el cuarto
        int aux1 = cadenaNueva[1];
        int aux3 = cadenaNueva[3];
        cadenaNueva[1] = aux3;
        cadenaNueva[3] = aux1;

        for (int i = 0; i < cadenaNueva.length; i++){
            System.out.println(cadenaNueva[i]);
        }
    }
}
