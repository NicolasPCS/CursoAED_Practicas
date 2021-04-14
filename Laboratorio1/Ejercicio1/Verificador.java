package Laboratorio1.Ejercicio1;

public class Verificador {
    public static boolean esSobrePos (Rectangulo r1, Rectangulo r2){
        // Coordenadas primer rectángulo
        double r1_x1 = r1.getEsquina1().getX();
        double r1_y1 = r1.getEsquina1().getY();
        double r1_x2 = r1.getEsquina2().getX();
        double r1_y2 = r1.getEsquina2().getY();

        // Coordenadas segundo rectángulo
        double r2_x1 = r2.getEsquina1().getX();
        double r2_y1 = r2.getEsquina1().getY();
        double r2_x2 = r2.getEsquina2().getX();
        double r2_y2 = r2.getEsquina2().getY();

        // Ancho y largo de la rectángulos
        double widthR1 = r1_x2 - r1_x1;
        double heightR1 = r1_y1 - r1_y2;
        double widthR2 = r2_x2 - r2_x1;
        double heightR2 = r2_y1 - r2_y2;

        /*return r1_x1 < r2_x1 + widthR2 &&
                r1_x1 + widthR1 > r2_x1 &&
                r1_y1 < r2_y1 + heightR2 &&
                heightR1 + r1_y1 > r2_y1;*/

        /*if (r1_x1 == r1_x2 || r1_y1 == r1_y2 || r2_x1 == r2_x2 || r2_y1 == r2_y2)
            return false;*/

        /*return !(r1_x2 <= r2_y1 || r1_y2 <= r2_y1 || r1_x1 >= r2_x2 || r1_y1 >= r2_y2 /*&&
                !(r1_x1 == r2_x1 || r1_x2 == r2_x2 && r1_y1 == r2_y1 || r1_y2 == r2_y2));*/

        if (r1_x1 == r1_x2 || r1_y1 == r2_y2 || r2_x1 == r2_x2 || r2_y1 == r2_y2)
        {
            // No debe tener una sobreposición positiva
            return false;
        }

        // Verificamos si un rectángulo esta a lado de otro
        if (r1_x1 >= r2_x2 || r2_x1 >= r1_x2) {
            return false;
        }

        // Verificamos si un rectángulo esta sobre otro
        if (r1_y1 <= r2_y2 || r2_y1 <= r1_y2) {
            return false;
        }

        return true;

    }
    public static boolean esJunto (Rectangulo r1, Rectangulo r2) {
        // Coordenadas primer rectángulo
        double r1_x1 = r1.getEsquina1().getX();
        double r1_y1 = r1.getEsquina1().getY();
        double r1_x2 = r1.getEsquina2().getX();
        double r1_y2 = r1.getEsquina2().getY();

        // Coordenadas segundo rectángulo
        double r2_x1 = r2.getEsquina1().getX();
        double r2_y1 = r2.getEsquina1().getY();
        double r2_x2 = r2.getEsquina2().getX();
        double r2_y2 = r2.getEsquina2().getY();

        // Punto inferior izquierdo del rectángulo de intersección
        double i1 = Math.max(r1_x1, r2_x1);
        double i2 = Math.max(r1_y1, r2_y1);

        // Punto superior derecho del rectángulo de intersección
        double i3 = Math.min(r1_x2, r2_x2);
        double i4 = Math.min(r1_y2, r2_y2);

        // Retorna verdadero si intersect y falso de lo contrario
        /*if (i1 > i3 || i2 > i4) {
            return false;
        } else {
            return true;
        }*/

        return !(i1 > i3) && !(i2 > i4);
    }
    public static boolean esDisjunto (Rectangulo r1, Rectangulo r2) {

        // Coordenadas primer rectángulo
        double r1_x1 = r1.getEsquina1().getX();
        double r1_y1 = r1.getEsquina1().getY();
        double r1_x2 = r1.getEsquina2().getX();
        double r1_y2 = r1.getEsquina2().getY();

        // Coordenadas segundo rectángulo
        double r2_x1 = r2.getEsquina1().getX();
        double r2_y1 = r2.getEsquina1().getY();
        double r2_x2 = r2.getEsquina2().getX();
        double r2_y2 = r2.getEsquina2().getY();

        return r1_x1 > r2_x2 || r1_x2 < r2_x1 || r1_y1 > r2_y2 || r1_y2 < r2_y1;
    }
}
