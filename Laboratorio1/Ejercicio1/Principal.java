package Laboratorio1.Ejercicio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double[] num1 = new double[4];
        double[] num2 = new double[4];
        double n1, n2;

        for (int i = 0; i < num1.length; i++){
            n1 = 0; n2 = 0;
            System.out.print("Ingrese x" + (i + 1) + ": ");
            n1 = s.nextDouble();
            num1[i] = n1;
            System.out.print("Ingrese y" + (i + 1) + ": ");
            n2 = s.nextDouble();
            num2[i] = n2;
        }

        Coordenada p1 = new Coordenada(num1[0],num2[0]);
        Coordenada p2 = new Coordenada(num1[1],num2[1]);

        Coordenada q1 = new Coordenada(num1[2],num2[2]);
        Coordenada q2 = new Coordenada(num1[3],num2[3]);

        Rectangulo A = new Rectangulo(p1,p2);
        Rectangulo B = new Rectangulo(q1,q2);

        System.out.println("\n¿Se sobreponen?: " + Verificador.esSobrePos(A,B));
        // System.out.println("¿Son juntos?: " + Verificador.esJunto(A,B));
        // System.out.println("¿son disjuntos?: " + Verificador.esDisjunto(A,B));

    }
}
