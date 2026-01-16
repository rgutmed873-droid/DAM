package Objetos.recap;

import java.sql.SQLOutput;

public class PasswordException extends Exception {

   public PasswordException(String message, TipoErrorPassword tipo) {
        super(message);
        switch (tipo){
            case TipoErrorPassword.ERROR_PASSWORD_LETRAS:
                System.out.println("La contraseña debe contener un caracter de tipo letra");
            break;
            case TipoErrorPassword.ERROR_PASSWORD_NUM:
                System.out.println("La contraseña no puede contener ningún valor numérico");
            break;
            case TipoErrorPassword.ERROR_PASSWORD_SIMBOLOS:
                System.out.println("La contraseña debe contener un símbolo especial");
            break;
            case TipoErrorPassword.ERROR_PASSWORD_LONGITUD:
                System.out.println("La longitud tiene que estar entre 8 y 12 caracteres ");
            break;
        }
   }


}
