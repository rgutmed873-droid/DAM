package Objetos.Petshop;

public abstract class Animals {
    //Atributos Principales

    public String sex;
    public int edad;
    public int codigoEAN;


    /**
     * Constructor con los atributos principales
     * @param sex
     * @param edad
     * @param codigoEAN
     */
    public Animals(String sex, int edad, int codigoEAN) {
        this.sex = sex;
        this.edad = edad;
        this.codigoEAN = codigoEAN;
    }

    /**
     * Constructor Vacio
     */
    public Animals (){

    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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
                "sex='" + sex + '\'' +
                ", edad=" + edad +
                ", codigoEAN=" + codigoEAN +
                '}';
    }

    //Crear metodo para saber si es macho o hembra
    //Crear metodo para edad del animal
}
