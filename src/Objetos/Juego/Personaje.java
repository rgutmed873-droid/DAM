package Objetos.Juego;

public class Personaje {

    int vida;
    int golpe = 5;
    int habilidad;
    boolean estaVivo = true;

    public int getGolpe() {
        return golpe;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public int getVida() {
        return vida;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "estaVivo=" + estaVivo +
                ", vida=" + vida +
                ", golpe=" + golpe +
                ", habilidad=" + habilidad +
                '}';
    }
}
