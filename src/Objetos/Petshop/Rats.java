package Objetos.Petshop;

public class Rats extends Animals{

    //Atributos principales
    public int weight;
    public int size;

    public Rats(String sex, int edad, int codigoEAN, int weight, int size) {
        super(sex, edad, codigoEAN);
        this.weight = weight;
        this.size = size;
    }

    @Override
    protected int convertidorEdad(int edad) {
        return super.convertidorEdad(edad);
    }
}
