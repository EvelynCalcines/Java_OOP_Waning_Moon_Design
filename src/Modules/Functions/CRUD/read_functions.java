package Modules.Functions.CRUD;

import javax.swing.JOptionPane;

import Modules.Design.Clases.Singleton;
import Modules.Design.Clases.SocialNetworks;
import Modules.utils.find_functions;
import Modules.utils.functions_menu;
import Modules.Design.Clases.InvitationCard;
import Modules.Design.Clases.LogoDesign;


public class read_functions {

	// LOGOTIPO //

	public static void read_logoDesign(LogoDesign log) {
		String[] menu = { "All", "One to one", "Atrás" };
		int option_menu_logo = 0;
		int location = -1;
		String cad = "";
		String atributo = "";
		String[] atributos = { "Identificador", "Nombre del propietario", "Nombre del curso", "Precio", "Colores", "Tipo de plantilla", "Volver", "Todos" };
		boolean key_read = false;
		boolean key_volver = false;

		if (Singleton.LogoDesign.isEmpty()) {

			JOptionPane.showMessageDialog(null, "No existe ningún logo para poder leer", "Error", JOptionPane.ERROR_MESSAGE);	

		}else {

			do {

				option_menu_logo = functions_menu.menubuttons(menu, "¿Qué opción desea ver?", "Elige opción deseada" );

				switch (option_menu_logo) {

				case 0: 

					key_read = true;

					for (int i = 0; i < Singleton.LogoDesign.size(); i ++) {
						cad = (Singleton.LogoDesign.get(i).toString());
						JOptionPane.showMessageDialog(null, cad, "Diseño de logo", JOptionPane.INFORMATION_MESSAGE);				
					}

					break;

				case 1: 

					key_read = true;

					location = -1;

					log = functions_service.asklogoDesign_id("¿Cuál es el identificador del servicio que quieres leer?");

					location = find_functions.find_logoDesign(log);

					if (location != -1) {

						log = Singleton.LogoDesign.get(location);
						
						int	option_atributo = functions_menu.menubuttons(atributos, "¿Qué característica quiere leer?", "Elige opción deseada");
						
						do {

							switch (option_atributo) {
							
							case 0: 
								
								atributo = ("Identificador: " + log.getId());
								break;
								
							case 1:
								
								atributo = ("Nombre del propietario: " + log.getOwner_name());
								break;
								
							case 2:
							
								atributo = ("Nombre de la marca/empresa: " + log.getCourse_name());
								break;
								
							case 3: 
								
								atributo = ("Precio: " + log.getPrice());
								break;
								
							case 4: 
								
								atributo = ("Colores: " + log.getColors());
								break;
								
							case 5: 
								
								atributo = ("Tipo de plantilla: " + log.getTemplate_type());
								break;

							case 6:
							
								atributo = ("Volver");
								key_volver = false;
								break;	

							case 7:
								
								atributo = (log.toString());

							default: 

								key_read = false;
								break;

							}
							
							JOptionPane.showMessageDialog(null, atributo, "Características", JOptionPane.INFORMATION_MESSAGE);

					}while (key_volver != false);

					}else {

						JOptionPane.showMessageDialog(null, "No existe ningún identificador para poder leer", "Error", JOptionPane.ERROR_MESSAGE);

					}

					break;
				
				default:

					key_read = false;
					break;
				}  

			}while (key_read == true);
		}
	}

	// TARJETA DE INVITACIÓN // 

public static void read_InvitationCard(InvitationCard inv) {

		String[] menu = { "All", "One to one", "Atrás" };
		int option_menu_invitation_card = 0;
		int location = -1;
		String cad = "";
		String atributo = "";
		String[] atributos = { "Identificador", "Nombre del propietario", "Nombre del curso", "Nombre del invitado/a", "Precio", "Colores", "Forma", "Volver", "Todos" };
		boolean key_read = false;
		boolean key_volver = false;

		if (Singleton.InvitationCard.isEmpty()) {

			JOptionPane.showMessageDialog(null, "No existe ninguna tarjeta de invitación para poder leer", "Error", JOptionPane.ERROR_MESSAGE);	

		}else {
		
			do {

				option_menu_invitation_card = functions_menu.menubuttons(menu, "¿Qué opción desea ver?", "Elige opción deseada" );

				switch (option_menu_invitation_card) {

				case 0: 

					key_read = true;

					for (int i = 0; i < Singleton.InvitationCard.size(); i ++) {
						cad = (Singleton.InvitationCard.get(i).toString());
						JOptionPane.showMessageDialog(null, cad, "Tarjeta de invitación", JOptionPane.INFORMATION_MESSAGE);				
					}

					break;

				case 1: 

					key_read = true;

					location = -1;

					inv = functions_service.askinvitationCard_id("¿Cuál es el identificador del servicio que quieres leer?");

					location = find_functions.find_invitationCard(inv);

					if (location != -1) {

						inv = Singleton.InvitationCard.get(location);
						
						int	option_atributo = functions_menu.menubuttons(atributos, "¿Qué característica quiere leer?", "Elige opción deseada");
						
						do {

							switch (option_atributo) {
							
							case 0: 
								
								atributo = ("Identificador: " + inv.getId());
								break;
								
							case 1:
								
								atributo = ("Nombre del propietario: " + inv.getOwner_name());
								break;
								
							case 2:
							
								atributo = ("Nombre de la marca/empresa: " + inv.getCourse_name());
								break;

							case 3: 
								
								atributo = ("Nombre del invitado/a: " + inv.getInvited_name());
								break;
								
							case 4: 
								
								atributo = ("Precio: " + inv.getPrice());
								break;
								
							case 5: 
								
								atributo = ("Colores: " + inv.getColors());
								break;
								

							case 6:

								atributo = ("Forma: " + inv.getShape());
								break;

							case 7:
							
								atributo = ("Volver");
								key_volver = false;
								break;	

							case 8:
								
								atributo = (inv.toString());

							default: 

								key_read = false;
								break;

							}
							
							JOptionPane.showMessageDialog(null, atributo, "Características", JOptionPane.INFORMATION_MESSAGE);

					}while (key_volver != false);

					}else {

						JOptionPane.showMessageDialog(null, "No existe ningún identificador para poder leer", "Error", JOptionPane.ERROR_MESSAGE);

					}

					break;
				
				default:

					key_read = false;
					break;
				}  

			}while (key_read == true);
		}
	}

	// REDES SOCIALES //

	public static void read_SocialNetworks(SocialNetworks soc) {

		String[] menu = { "All", "One to one", "Atrás" };
		int option_menu_social_networks = 0;
		int location = -1;
		String cad = "";
		String atributo = "";
		String[] atributos = { "Identificador", "Nombre del propietario", "Nombre del curso", "Precio", "Colores", "Tipo de diseño", "Volver", "Todos" };
		boolean key_read = false;
		boolean key_volver = false;

		if (Singleton.SocialNetworks.isEmpty()) {

			JOptionPane.showMessageDialog(null, "No existe ningún tipo de diseño para poder leer", "Error", JOptionPane.ERROR_MESSAGE);	

		}else {
		
			do {

				option_menu_social_networks = functions_menu.menubuttons(menu, "¿Qué opción desea ver?", "Elige opción deseada" );

				switch (option_menu_social_networks) {

				case 0: 

					key_read = true;

					for (int i = 0; i < Singleton.SocialNetworks.size(); i ++) {
						cad = (Singleton.SocialNetworks.get(i).toString());
						JOptionPane.showMessageDialog(null, cad, "Redes Sociales", JOptionPane.INFORMATION_MESSAGE);				
					}

					break;

				case 1: 

					key_read = true;

					location = -1;

					soc = functions_service.asksocialNetworks_id("¿Cuál es el identificador del servicio que quieres leer?");

					location = find_functions.find_socialNetworks(soc);

					if (location != -1) {

						soc = Singleton.SocialNetworks.get(location);
						
						int	option_atributo = functions_menu.menubuttons(atributos, "¿Qué característica quiere leer?", "Elige opción deseada");
						
						do {

							switch (option_atributo) {
							
							case 0: 
								
								atributo = ("Identificador: " + soc.getId());
								break;
								
							case 1:
								
								atributo = ("Nombre del propietario: " + soc.getOwner_name());
								break;
								
							case 2:
							
								atributo = ("Nombre de la marca/empresa: " + soc.getCourse_name());
								break;

							case 3: 
								
								atributo = ("Precio: " + soc.getPrice());
								break;
								
							case 4: 
								
								atributo = ("Colores: " + soc.getColors());
								break;
								

							case 5:

								atributo = ("Tipo de diseño: " + soc.getDesign_type());
								break;

							case 6:
							
								atributo = ("Volver");
								key_volver = false;
								break;	

							case 7:
								
								atributo = (soc.toString());

							default: 

								key_read = false;
								break;

							}
							
							JOptionPane.showMessageDialog(null, atributo, "Características", JOptionPane.INFORMATION_MESSAGE);

					}while (key_volver != false);

					}else {

						JOptionPane.showMessageDialog(null, "No existe ningún identificador para poder leer", "Error", JOptionPane.ERROR_MESSAGE);

					}

					break;
				
				default:

					key_read = false;
					break;
				}  

			}while (key_read == true);
		}
	}
}
