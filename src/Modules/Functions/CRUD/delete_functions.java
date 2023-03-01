package Modules.Functions.CRUD;

import javax.swing.JOptionPane;
import Modules.Design.Clases.Singleton;
import Modules.utils.find_functions;
import Modules.Design.Clases.LogoDesign;

public class delete_functions {
    
    public static void delete_LogoDesign(LogoDesign log) {

        int location = -1;

        if (Singleton.LogoDesign.isEmpty()) {

            JOptionPane.showMessageDialog(null, "No existe este servicio para poder eliminarlo", "Error", JOptionPane.ERROR_MESSAGE);

        } else {

            location = -1;

            log = functions_service.asklogoDesign_id("¿Cuál es el identificador del servicio que quieres borrar?");

            location = find_functions.find_logoDesign(log);

            if (location != -1) {

                Singleton.LogoDesign.remove(location);

                JOptionPane.showMessageDialog(null, "Has borrado el servicio", "Borrado", JOptionPane.INFORMATION_MESSAGE);

            } else {

                JOptionPane.showMessageDialog(null, "No existe ningún servicio con este identificador", "No existe", JOptionPane.ERROR_MESSAGE);

            }

        }
    }
}
