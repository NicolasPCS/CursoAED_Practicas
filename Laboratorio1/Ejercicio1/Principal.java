package Laboratorio1.Ejercicio1;

public class Principal {
    public static void main(String[] args) {
        Coordenada p1 = new Coordenada();
        Coordenada p2 = new Coordenada(10,-2);

        p1.setX(-34);

        Rectangulo A = new Rectangulo(p1,p2);
        Rectangulo B = new Rectangulo(new Coordenada(10,-5), new Coordenada(-4,12));

        // invocando método de instancia
        System.out.println(p1.distancia(p2));
        System.out.println(Coordenada.distancia(p1,p2));

        // Rectángulo
        System.out.println("\nRectángulo A = " + A);
        System.out.println("Rectángulo B = " + B);


    }
}
