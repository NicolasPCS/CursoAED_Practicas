package Laboratorio1.Ejercicio1;

public class Principal {
    public static void main(String[] args) {
        Coordenada p1 = new Coordenada(1,2);
        Coordenada p2 = new Coordenada(2,1);

        Coordenada q1 = new Coordenada(3,4);
        Coordenada q2 = new Coordenada(4,3);

        Rectangulo A = new Rectangulo(p1,p2);
        Rectangulo B = new Rectangulo(q1,q2);

        // invocando método de instancia
        //System.out.println(p1.distancia(p2));
        //System.out.println(Coordenada.distancia(p1,p2));

        // Rectángulo
        //System.out.println("\nRectángulo A = " + A);
        //System.out.println("Rectángulo B = " + B);

        // Verificador v = new Verificador();

        System.out.println(Verificador.esSobrePos(A,B));
        System.out.println(Verificador.esJunto(A,B));
        System.out.println(Verificador.esDisjunto(A,B));

    }
}
