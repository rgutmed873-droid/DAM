package Objetos.Petshop;

import java.util.Scanner;

public abstract class Animals {
    //Atributos Principales

    public Genero sex;
    public int edad;
    public int codigoEAN;


    /**
     * Constructor con los atributos principales
     * @param sex
     * @param edad
     * @param codigoEAN
     */
    public Animals(Genero sex, int edad, int codigoEAN) {
        this.sex = sex;
        this.edad = convertidorEdad(edad);
        this.codigoEAN = codigoEAN;
    }

    /**
     * Constructor Vacio
     */
    public Animals (){

    }


    public Genero getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = Genero.valueOf(sex);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodigoEAN() {
        return codigoEAN;
    }

    public void setCodigoEAN(int codigoEAN) {
        this.codigoEAN = codigoEAN;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "sex='" + getSex() + '\'' +
                ", edad=" + getEdad() +
                ", codigoEAN=" + codigoEAN +
                '}';
    }

    /**
     * Metodo para determinar el sexo del animal
     * MIRAR MEJOR EL METODO E INTENTAR RETOCARLO
     * @param sex
     */
    protected void sexoAnimal (String sex){

        if (sex.equals("Macho")){
           this.sex = Genero.MACHO;
        }else if (sex.equals("Hembra")){
            this.sex = Genero.HEMBRA;
        }else {
            System.out.println("No has escogido sexo para el animal");
        }

    }


    /**
     * Metodo para determinar la edad de un animal
     * @param edad
     */
    protected int convertidorEdad (int edad){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los años que tiene el animal");
        int años = sc.nextInt();

        int edadDias = 365;

        int edadAnimal;
        edadAnimal = edadDias * años;

        System.out.println("La edad del animal en dias es: " + edadAnimal);

        return edadAnimal;
    }
}
