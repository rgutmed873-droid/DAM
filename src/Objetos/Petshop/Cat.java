package Objetos.Petshop;

public class Cat extends Animals{

    //Atributos Principales
    public String color;
    public String breed;
    public String typeHair;

    public Cat(String sex, int edad, int codigoEAN, String color, String breed, String typeHair) {
        super(sex, edad, codigoEAN);
        this.color = color;
        this.breed = breed;
        this.typeHair = typeHair;
    }

    @Override
    protected int convertidorEdad(int edad) {
        return super.convertidorEdad(edad);
    }
}
