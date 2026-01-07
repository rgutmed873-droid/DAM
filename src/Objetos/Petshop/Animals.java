package Objetos.Petshop;

import java.util.Scanner;

public abstract class Animals {
    //Atributos Principales

    protected Genero sex;
    protected int edad;
    protected int codigoEAN;
    protected boolean vendido;


    /**
     * Constructor con los atributos principales
     * @param sex
     * @param edadAnios
     * @param codigoEAN
     */
    public Animals(Genero sex, int edadAnios, int codigoEAN) {
        this.sex = sex;
        this.edad = convertidorEdad(edadAnios);
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

    protected int convertidorEdad(int edadAnios) {
        return edad * 365;
    }

}
