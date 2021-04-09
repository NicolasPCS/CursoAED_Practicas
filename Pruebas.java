import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Pruebas {
    public static void main (String[]args) {

        Scanner s = new Scanner(System.in);
        String cadena = s.nextLine();
        
        String[] fechaP = cadena.split(" ");
        String fechaP1 = fechaP[0]; // 123
        String fechaP2 = fechaP[1]; // 654321
        String fechaP3 = fechaP[2]; // 654321

        Date miFecha= new Date(115, 2, 2);
        System.out.println("Ahora hemos creado un objeto date con la fecha indicada, "+miFecha);

    }
}