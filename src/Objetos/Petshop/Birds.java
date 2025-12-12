package Objetos.Petshop;

public class Birds extends Animals{

    //Atributos principales
    public String color;
    public String type;

    public Birds(Genero sex, int edad, int codigoEAN, String color, String type) {
        super(sex, edad, codigoEAN);
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected int convertidorEdad(int edad) {
        return super.convertidorEdad(edad);
    }
}
