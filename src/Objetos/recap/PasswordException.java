package Objetos.recap;

import java.sql.SQLOutput;

public class PasswordException extends Exception {

   public PasswordException(String message, TipoErrorPassword tipo) {
        super(message);
        switch (tipo){
            case TipoErrorPassword.ERROR_PASSWORD_LETRAS:
            break;
            case TipoErrorPassword.ERROR_PASSWORD_NUM:
            break;
            case TipoErrorPassword.ERROR_PASSWORD_SIMBOLOS:
            break;
            case TipoErrorPassword.ERROR_PASSWORD_LONGITUD:
            break;
        }
   }


}
