package Laboratorio1.Ejercicio1;

public class Coordenada {
    private double x;
    private double y;

    public Coordenada() {
        this(0,0);
    }

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordenada(Coordenada c) {
        this.x = c.x;
        this.y = c.y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // De instancia
    public double distancia(Coordenada c){
        // Utilizamos la distancia euclidiana
        return Math.sqrt((Math.pow((c.x - this.x),2))+(Math.pow((c.y - this.y),2)));
    }

    public static double distancia(Coordenada c1, Coordenada c2) {
        return Math.sqrt((Math.pow((c2.x - c1.x),2))+(Math.pow((c2.y - c1.y),2)));
    }

    @Override
    public String toString() {
        return "["+this.x+", "+this.y+"]";
    }
}
