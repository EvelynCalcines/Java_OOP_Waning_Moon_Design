package Modules.Functions.CRUD;

import javax.swing.JOptionPane;
import Modules.Design.Clases.Singleton;
import Modules.Design.Clases.SocialNetworks;
import Modules.utils.find_functions;
import Modules.Design.Clases.InvitationCard;
import Modules.Design.Clases.LogoDesign;

public class delete_functions {
    
    // LOGOTIPO //

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

    // TARJETA DE INVITACIÓN //

    public static void delete_InvitationCard(InvitationCard inv) {

        int location = -1;

        if (Singleton.InvitationCard.isEmpty()) {

            JOptionPane.showMessageDialog(null, "No existe este servicio para poder eliminarlo", "Error", JOptionPane.ERROR_MESSAGE);

        } else {

            location = -1;

            inv = functions_service.askinvitationCard_id("¿Cuál es el identificador del servicio que quieres borrar?");

            location = find_functions.find_invitationCard(inv);

            if (location != -1) {

                Singleton.InvitationCard.remove(location);

                JOptionPane.showMessageDialog(null, "Has borrado el servicio", "Borrado", JOptionPane.INFORMATION_MESSAGE);

            } else {

                JOptionPane.showMessageDialog(null, "No existe ningún servicio con este identificador", "No existe", JOptionPane.ERROR_MESSAGE);

            }

        }
    }
    
    // REDES SOCIALES //

    public static void delete_SocialNetworks(SocialNetworks soc) {

        int location = -1;

        if (Singleton.SocialNetworks.isEmpty()) {

            JOptionPane.showMessageDialog(null, "No existe este servicio para poder eliminarlo", "Error", JOptionPane.ERROR_MESSAGE);

        } else {

            location = -1;

            soc = functions_service.asksocialNetworks_id("¿Cuál es el identificador del servicio que quieres borrar?");

            location = find_functions.find_socialNetworks(soc);

            if (location != -1) {

                Singleton.SocialNetworks.remove(location);

                JOptionPane.showMessageDialog(null, "Has borrado el servicio", "Borrado", JOptionPane.INFORMATION_MESSAGE);

            } else {

                JOptionPane.showMessageDialog(null, "No existe ningún servicio con este identificador", "No existe", JOptionPane.ERROR_MESSAGE);

            }

        }
    }

}
