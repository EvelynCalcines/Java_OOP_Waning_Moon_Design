package Modules.Functions.CRUD;

import javax.swing.JOptionPane;

import Modules.Design.Clases.InvitationCard;
import Modules.Design.Clases.LogoDesign;
import Modules.Design.Clases.Singleton;
import Modules.Design.Clases.SocialNetworks;
import Modules.utils.find_functions;

public class update_functions {

    // LOGOTIPO //
    
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

    // TARJETA DE INVITACIÓN //

    public static void update_InvitationCard(InvitationCard inv) {

        int location = -1;

        if (Singleton.InvitationCard.isEmpty()) {

            JOptionPane.showMessageDialog(null, "No existe ningún servicio para poder cambiar sus características", "Error", JOptionPane.ERROR_MESSAGE);
        
        }else {

            location = -1;

            inv = functions_service.askinvitationCard_id("¿Cuál es el identificador del servicio que quieres modificar?");

            location = find_functions.find_invitationCard(inv);

            if (location != -1) {

                inv = Singleton.InvitationCard.get(location);

                functions_service.update_inv(inv);

                Singleton.InvitationCard.set(location, inv);

            }else {

                JOptionPane.showMessageDialog(null, "No existe ninguna tarjeta de invitación con este código para poder cambiarlo", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }
    }    

    // REDES SOCIALES // 

    public static void update_SocialNetworks(SocialNetworks soc) {

        int location = -1;

        if (Singleton.SocialNetworks.isEmpty()) {

            JOptionPane.showMessageDialog(null, "No existe ningún servicio para poder cambiar sus características", "Error", JOptionPane.ERROR_MESSAGE);
        
        }else {

            location = -1;

            soc = functions_service.asksocialNetworks_id("¿Cuál es el identificador del servicio que quieres modificar?");

            location = find_functions.find_socialNetworks(soc);

            if (location != -1) {

                soc = Singleton.SocialNetworks.get(location);

                functions_service.update_soc(soc);

                Singleton.SocialNetworks.set(location, soc);

            }else {

                JOptionPane.showMessageDialog(null, "No existe ninguna red social con este código para poder cambiarlo", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }
    }        

}
