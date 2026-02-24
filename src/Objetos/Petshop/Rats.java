package Objetos.Petshop;

public class Rats extends Animals{

    //Atributos principales
    public int weight;
    public int size;

    //Comprobar tamaño y peso
    //Precio por KG

    public Rats() {
        super(sex, edad, codigoEAN);
        this.weight = weight;
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    protected int convertidorEdad(int edad) {
        return super.convertidorEdad(edad);
    }
}
