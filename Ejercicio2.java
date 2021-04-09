import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        String numero = s.nextLine();

        String[] cadena = new String[numero.length()];

        for(int i = 0; i < cadena.length; i++){
            cadena[i] = String.valueOf(numero.charAt(i));
        }

        for(int j = 0; j < cadena.length-1; j++){
            System.out.print(cadena[j]+" "+" "+" ");
        }
        System.out.print(cadena[cadena.length-1]);
        System.exit(0);
    }
}
