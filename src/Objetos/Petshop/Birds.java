package Objetos.Petshop;

public class Birds extends Animals{
    //Atributos principales
    public String color;
    public String type;

    public Birds(String sex, int edad, int codigoEAN, String color, String type) {
        super(sex, edad, codigoEAN);
        this.color = color;
        this.type = type;
    }
}
