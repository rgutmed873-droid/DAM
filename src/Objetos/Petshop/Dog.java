package Objetos.Petshop;

import java.util.Random;

public class Dog extends pets{

    //Atributos principales
    public String color;
    public String breed;
    public String typeHair;
    public boolean pedigree;


    /**
     * Constructor Perro
     * @param sex
     * @param edad
     * @param codigoEAN
     * @param color
     * @param breed
     * @param typeHair
     */
    public Dog(Genero sex, int edad, int codigoEAN, String color, String breed, String typeHair) {
        super(sex, edad, codigoEAN);
        this.color = color;
        this.breed = breed;
        this.typeHair = typeHair;
        this.pedigree = generadorPedigree();
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

    public boolean isPedigree() {
        return pedigree;
    }

    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }

    @Override
    protected int convertidorEdad(int edad) {
        return super.convertidorEdad(edad);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", typeHair='" + typeHair + '\'' +
                ", pedigree=" + isPedigree() +
                ", sex='" + sex + '\'' +
                ", edad=" + edad +
                ", codigoEAN=" + codigoEAN +
                '}';
    }


    /**
     * Metodo para determinar aleatoriamente si un perro tiene pedigree
     * @return
     */
    public boolean generadorPedigree (){

        if (numerosAleatorios(0,1) == 1){
            System.out.println("El perro tiene pedigree");
            this.pedigree = true;
        }else {
            System.out.println("El perro no tiene pedigree");
            this.pedigree = false;
        }
        return pedigree;
    }

    public static int numerosAleatorios(int min, int max){

        Random random = new Random();
        return random.nextInt(max-min+1)+min;
    }
}
