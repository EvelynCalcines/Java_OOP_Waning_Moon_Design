package Modules.Functions.CRUD;

import javax.swing.JOptionPane;
import Modules.Design.Clases.Singleton;
import Modules.utils.find_functions;
import Modules.Design.Clases.InvitationCard;
import Modules.Design.Clases.LogoDesign;

public class create_functions {
	
	public static void create_LogoDesign(LogoDesign log) {
		
		int location = -1;
		
		log = functions_service.asklogoDesign_id("¿Cuál es el identificador del servicio que quieres crear?");    
				
		location = find_functions.find_logoDesign(log);
		
		if (location != -1) {

			JOptionPane.showMessageDialog(null, "Ya existe este código en otro servicio", "Error", JOptionPane.ERROR_MESSAGE);

		}else {

			log = functions_service.create_logoDesign();

			Singleton.LogoDesign.add(log);

		}

	}

	// TARJETA DE INVITACIÓN //


	public static void create_InvitationCard(InvitationCard inv) {
		
		int location = -1;
		
		inv = functions_service.askinvitationCard_id("¿Cuál es el identificador del servicio que quieres crear?");    
				
		location = find_functions.find_invitationCard(inv);
		
		if (location != -1) {

			JOptionPane.showMessageDialog(null, "Ya existe este código en otro servicio", "Error", JOptionPane.ERROR_MESSAGE);

		}else {

			inv = functions_service.create_InvitationCard();

			Singleton.InvitationCard.add(inv);

		}

	}

}