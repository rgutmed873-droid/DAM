package Objetos.recap;

public class PasswordException extends Exception {

   public PasswordException(String message, TipoErrorPassword tipo) {
        super(message);
        switch (tipo){
            case TipoErrorPassword.ERROR_PASSWORD_LETRAS:
                System.out.println("Error de letras");
            break;
            case TipoErrorPassword.ERROR_PASSWORD_NUM:
                System.out.println("No se pueden introducir numero en la contraseña");
            break;
            case TipoErrorPassword.ERROR_PASSWORD_SIMBOLOS:
                System.out.println("Debe contener simbolos especiales");
            break;
            case TipoErrorPassword.ERROR_PASSWORD_LONGITUD:
                System.out.println("Error de longitud");
        }
   }


}
