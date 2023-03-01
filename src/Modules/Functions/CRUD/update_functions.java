package Modules.Functions.CRUD;

import javax.swing.JOptionPane;

import Modules.Design.Clases.LogoDesign;
import Modules.Design.Clases.Singleton;
import Modules.utils.find_functions;

public class update_functions {
    
    public static void update_LogoDesign(LogoDesign log) {

        int location = -1;

        if (Singleton.LogoDesign.isEmpty()) {

            JOptionPane.showMessageDialog(null, "No existe ningún servicio para poder cambiar sus características", "Error", JOptionPane.ERROR_MESSAGE);
        
        }else {

            location = -1;

            log = functions_service.asklogoDesign_id("¿Cuál es el identificador del servicio que quieres modificar?");

            location = find_functions.find_logoDesign(log);

            if (location != -1) {

                log = Singleton.LogoDesign.get(location);

                functions_service.update(log);

                Singleton.LogoDesign.set(location, log);

            }else {

                JOptionPane.showMessageDialog(null, "No existe ningún logo con este código para poder cambiarlo", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }
    }

}
