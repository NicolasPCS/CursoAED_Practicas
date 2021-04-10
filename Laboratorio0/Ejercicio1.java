package Laboratorio0;

import java.util.Scanner;

public class Ejercicio1 {
    public static void cuadrado(){
        int i = 9;
        for (int j = 0; j < i; j++){
            System.out.print("*");
        }

        System.out.println();

        for (int j = 0; j < i-2; j++){
            System.out.print("*");
            for (int k = 0; k < i-2; k++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        for (int j = 0; j < i; j++){
            System.out.print("*");
        }

        System.out.println();
    }

    public static void circulo(){
        int i = 7;

        for (int j = 0; j < i-6; j++){
            System.out.print(" "+" ");
            for (int k = 0; k < i-4; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.print(" ");
        for (int j = 0; j < i-5; j++){
            System.out.print("*");
            for(int k = 0; k < i-4; k++){
                System.out.print(" ");
            }
        }
        System.out.print(" ");
        System.out.println();

        for (int j = 0; j < i-2; j++){
            System.out.print("*");
            for (int k = 0; k < i-2; k++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        System.out.print(" ");
        for (int j = 0; j < i-5; j++){
            System.out.print("*");
            for(int k = 0; k < i-4; k++){
                System.out.print(" ");
            }
        }
        System.out.print(" ");
        System.out.println();

        for (int j = 0; j < i-6; j++){
            System.out.print(" "+" ");
            for (int k = 0; k < i-4; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void flecha(){
        char[][] matriz = new char[3][5];
        int mid = matriz[0].length / 2;

        // System.out.println(mid);
        // System.out.println(matriz.length);
        // System.out.println(matriz[0].length);

        // Iteramos por el largo
        for (int j = 0; j < matriz.length; j++){
            // Iteramos por el ancho
            for (int k = 0; k < matriz[0].length; k++){
                if((j+k) >= mid && (k-j) <= mid){
                    matriz[j][k] = '*';
                } else {
                    matriz[j][k] = ' ';
                }
                System.out.print(matriz[j][k]+" ");
            }
            System.out.println();
        }

        int i = 6;

        for (int j = 0; j < i; j++){
            System.out.print("\t");
            for (int k = 0; k < 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void rombo(){
        int altRombo = 9;
        int espInternos = 0;
        int espDelante = altRombo/2;
        int alt = 1;
        while (alt <= (altRombo/2+1)){
            for(int i = 1; i <= espDelante; i++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int i = 1; i < espInternos; i++){
                System.out.print(" ");
            }
            if(alt>1){
                System.out.print("*");
            }
            System.out.println();
            alt++;
            espDelante--;
            espInternos+=2;
        }

        espInternos = altRombo-3;
        espDelante = 1;
        alt = 0;

        while (alt < altRombo/2){
            for(int i = 1; i <= espDelante; i++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int i = 1; i < espInternos; i++){
                System.out.print(" ");
            }
            if(alt < altRombo/2-1){
                System.out.print("*");
            }
            System.out.println();
            alt++;
            espDelante++;
            espInternos-=2;
        }
    }

    public static void main(String[] args) {
        System.out.println("Ingrese el número de la figura a mostrar: ");
        System.out.println("\t(1) Cuadrado");
        System.out.println("\t(2) Circulo");
        System.out.println("\t(3) Flecha");
        System.out.println("\t(4) Rombo");

        Scanner s = new Scanner(System.in);
        int valor = s.nextInt();

        switch (valor) {
            case 1 -> cuadrado();
            case 2 -> circulo();
            case 3 -> flecha();
            case 4 -> rombo();
            default -> System.out.println("No se introdujo un valor válido");
        }
    }
}