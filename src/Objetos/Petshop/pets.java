package Objetos.Petshop;

public abstract class pets extends Animals{

    protected int chip;
    protected String nombre;
    protected Owner owner;

    /**
     * Constructor de mascota
     */
    public pets (Genero sex, int edadAnios, int codigoEAN,
               int chip, String nombre) {

        super(sex, edadAnios, codigoEAN);
        this.chip = chip;
        this.nombre = nombre;
        this.owner = null; // Se asigna al vender
    }

    public pets(Genero sex, int edad, int codigoEAN) {
    }

    public int getChip() {
        return chip;
    }

    public String getNombre() {
        return nombre;
    }

    public Owner getOwner() {
        return owner;
    }

    /**
     * Asignar dueño al vender la mascota
     */
    public void asignarOwner(Owner owner) {
        this.owner = owner;
        this.vendido = true;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Chip=" + chip +
                ", Nombre=" + nombre +
                ", Dueño=" + (owner != null ? owner : "Sin dueño");
    }
}

