package Objetos.recap;

public class Usuario {

    //Atributos principales
    private String nombreUsuario;
    private long password;

    /**
     * Constructor con los atributos
     * @param nombreUsuario
     * @param password
     */
    public Usuario(String nombreUsuario, long password) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    //GETTER AND SETTER DE LOS ATRIBUTOS PRINCIPALES
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public long getPassword() {
        return password;
    }

    public void setPassword(long password) {
        this.password = password;
    }

    public boolean comprobarPassword(long password){
        return this.password == password;

    }
}
