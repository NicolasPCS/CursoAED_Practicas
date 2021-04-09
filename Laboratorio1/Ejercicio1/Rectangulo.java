package Laboratorio1.Ejercicio1;

public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(Coordenada c1, Coordenada c2){
        setEsquina1(c1);
        setEsquina2(c2);
    }

    public Coordenada getEsquina1() {
        return this.esquina1;
    }

    public void setEsquina1(Coordenada esquina1) {
        this.esquina1 = esquina1;
    }

    public Coordenada getEsquina2() {
        return this.esquina2;
    }

    public void setEsquina2(Coordenada esquina2) {
        this.esquina2 = esquina2;
    }

    @Override
    public String toString() {
        return "(" + this.esquina1 + ", " + this.esquina2 + ")";
    }
}
