package Objetos.Petshop;

public class Cat extends Animals{

    //Atributos Principales
    public String color;
    public String breed;
    public String typeHair;

    //Añadir precio fijo

    public Cat(int edad, int codigoEAN) {
        super(sex, edad, codigoEAN);
        this.color = color;
        this.breed = breed;
        this.typeHair = typeHair;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getTypeHair() {
        return typeHair;
    }

    public void setTypeHair(String typeHair) {
        this.typeHair = typeHair;
    }

    @Override
    protected int convertidorEdad(int edad) {
        return super.convertidorEdad(edad);
    }

}
