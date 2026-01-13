package Objetos.recap;

public class PasswordException extends Exception {

    TipoErrorPassword tipoError = null;
    int codigoError = 3456;

    public PasswordException(String message, TipoErrorPassword tipoError) {
        super(message);
        this.tipoError = tipoError;
    }

    public TipoErrorPassword getTipoError (){
        return tipoError;
    }

    public int getCodigoError (){
        return  codigoError;
    }
}
