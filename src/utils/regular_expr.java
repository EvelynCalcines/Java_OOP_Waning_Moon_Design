package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class regular_expr {

    private static final String Expresion_owner_name = "^[A-ZÁÉÍÓÚÜÑ][a-záéíóúüñ]*([ ][A-ZÁÉÍÓÚÜÑ][a-záéíóúüñ]*)?$";
    private static final String Expresion_course_name = "^[A-Za-záéíóúñÑ]+(\s?[A-Za-záéíóúñÑ0-9_-]+)*$";
    private static final String Expresion_invited_name = "^[A-Za-záéíóúñÑ]+(\s?[A-Za-záéíóúñÑ0-9_-]+)*$";
    private static final String Expresion_id = "^[a-zA-Z_][a-zA-Z0-9_]*$";

    // IDENTIFICADOR (VALIDAR) //

    public static boolean id(String id) {

        Pattern pattern = Pattern.compile(Expresion_id);
        Matcher matcher = pattern.matcher(id); 

        return matcher.matches();
    }

    // NOMBRE DEL PROPIETARIO //

    public static boolean owner_name(String owner_name) {

        Pattern pattern = Pattern.compile(Expresion_owner_name);
        Matcher matcher = pattern.matcher(owner_name); 

        return matcher.matches();

        // Eso de arriba es lo mismo que esto:
        // if (matcher.matches()) {
        //    return true;
        // }
        // return false;
    }

    // NOMBRE DEL CURSO //

    public static boolean course_name(String course_name) {

        Pattern pattern = Pattern.compile(Expresion_course_name);
        Matcher matcher = pattern.matcher(course_name); 

        return matcher.matches();

    }


    // TARJETA DE INVITACIÓN //

    // NOMBRE DEL INVITADO //

    public static boolean invited_name(String invited_name) {

        Pattern pattern = Pattern.compile(Expresion_invited_name);
        Matcher matcher = pattern.matcher(invited_name); 

        return matcher.matches();

    }


    
}