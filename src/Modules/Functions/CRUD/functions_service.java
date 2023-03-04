package Modules.Functions.CRUD;

import Modules.Design.Clases.Service;
import Modules.Design.Clases.Singleton;
import Modules.Design.Clases.SocialNetworks;
import Modules.utils.data_functions;
import Modules.utils.find_functions;
import Modules.utils.functions_menu;
import utils.validates;

import javax.swing.JOptionPane;

import Modules.Design.Clases.InvitationCard;
import Modules.Design.Clases.LogoDesign;

public class functions_service {
	
	//// CREAMOS LOGODESIGN//// 

	public static LogoDesign create_logoDesign() {
		
		String id = Singleton.id;
		
		String owner_name = data_functions.askowner_name("Escribe su nombre", "Nombre");
				
		String course_name = data_functions.askcourse_name("Nombre de la marca/empresa", "Nombre de la marca");
		
		int price = validates.number("¿Qué precio tiene el servicio?", "Precio");
		
		String[] option_colors = {"Pasteles", "Claros", "Oscuros" };
		String colors = validates.combo(option_colors, "¿Qué colores quiere elegir?", "Colores");
		
		String[] option_template_type = {"Básico", "Estándar", "Premium" };
		String template_type = validates.combo(option_template_type, "¿Qué tipo de plantilla desea?", "Plantillas");

		return new LogoDesign(id, owner_name, course_name, price, colors, template_type); 
		
	} /// END CREATE ///

	public static LogoDesign asklogoDesign_id(String message) { 

		Singleton.id = data_functions.askid(message, "Id");

		return new LogoDesign(Singleton.id); 
	}

	// CAMBIAMOS (UPDATE) //

	public static void update_LogoDesign_id(LogoDesign log, Service ser) {

		int location = -1;

		log = functions_service.asklogoDesign_id("¿Cuál es el identificador del servicio que quieres modificar?");

		location = find_functions.find_logoDesign(log);

		if (location != -1) {

			JOptionPane.showMessageDialog(null, "Ya existe este identificador", "Error", JOptionPane.ERROR_MESSAGE);

		}else {

			ser.setId(Singleton.id);

		}

	}

	public static void update(Service ser) {

		if (ser instanceof LogoDesign) {

			String[] atributos = { "Identificador", "Nombre del propietario", "Nombre del curso", "Precio", "Colores", "Tipo de plantilla" };
			int option_menu = 0;
			boolean key = false;
			LogoDesign log = null;

			do {

				option_menu = functions_menu.menubuttons(atributos, "Selecciona la opción de desea actualizar:", "Elija la opción deseada");

				switch (option_menu) {

				case 0: 

					functions_service.update_LogoDesign_id(log, ser);
					key = true;
					break;
				
				case 1:

					String owner_name = data_functions.askowner_name("¿A qué nombre quiere que esté el servicio?", "Nombre");
					ser.setOwner_name(owner_name);
					key = true;
					break;

				case 2: 

					String course_name = data_functions.askcourse_name("¿Cuál es el nombre de la marca/empresa que desea actualizar?", "Nombre de la marca/empresa");
					ser.setCourse_name(course_name);
					key = true;
					break;

				case 3:

					int price = validates.number("¿Qué precio tenía el servicio?", "Precio");
					ser.setPrice(price);
					key = true;
					break;

				case 4: 

					String[] option_colors = {"Pasteles", "Claros", "Oscuros" };
					ser.setColors(validates.combo(option_colors, "¿A qué colores quieres cambiar?", "Colores"));
					key = true;
					break;

				case 5:

					String[] option_template_type = {"Básico", "Estándar", "Premium" };
					String template_type = validates.combo(option_template_type, "¿A qué tipo de plantilla quiere cambiar?", "Plantilla");
					((LogoDesign) ser).setTemplate_type(template_type);
					key = true;
					break;

				default:
					
					key = true;
					break;

				}

			}while (key != true);
			
		}

	}

	

	/// CREAMOS INVITATIONCARD ///

	public static InvitationCard askinvitationCard_id(String message) { 

		Singleton.id = data_functions.askid(message, "Id");

		return new InvitationCard(Singleton.id); 
	
	}

	public static InvitationCard create_InvitationCard() {
		
		String id = Singleton.id;
		
		String owner_name = data_functions.askowner_name("Escribe su nombre", "Nombre");
				
		String course_name = data_functions.askcourse_name("Nombre de la marca/empresa", "Nombre de la marca");

		String invited_name = data_functions.askinvited_name("Escribe el nombre del invitado/a", "Nombre del invitado/a");
		
		int price = validates.number("¿Qué precio tiene el servicio?", "Precio");
		
		String[] option_colors = {"Pasteles", "Claros", "Oscuros" };
		String colors = validates.combo(option_colors, "¿Qué colores quiere elegir?", "Colores");
		
		String[] option_shape = {"Circular", "Cuadrada", "Rectangular" };
		String shape = validates.combo(option_shape, "¿Qué tipo de forma desea?", "Forma");

		return new InvitationCard(id, owner_name, course_name, invited_name, price, colors, shape); 
		
	} /// END CREATE ///


	// UPDATE TARJETA DE INVITACIÓN // 

	public static void update_InvitationCard_id(InvitationCard inv, Service ser) {

		int location = -1;

		inv = functions_service.askinvitationCard_id("¿Cuál es el identificador del servicio que quieres modificar?");

		location = find_functions.find_invitationCard(inv);

		if (location != -1) {

			JOptionPane.showMessageDialog(null, "Ya existe este identificador", "Error", JOptionPane.ERROR_MESSAGE);

		}else {

			ser.setId(Singleton.id);

		}

	}

	public static void update_inv(Service ser) {

		if (ser instanceof InvitationCard) {

			String[] atributos = { "Identificador", "Nombre del propietario", "Nombre del curso", "Nombre del invitado/a", "Precio", "Colores", "Forma" };
			int option_menu = 0;
			boolean key = false;
			InvitationCard inv = null;

			do {

				option_menu = functions_menu.menubuttons(atributos, "Selecciona la opción de desea actualizar:", "Elija la opción deseada");

				switch (option_menu) {

				case 0: 

					functions_service.update_InvitationCard_id(inv, ser);
					key = true;
					break;
				
				case 1:

					String owner_name = data_functions.askowner_name("¿A qué nombre quiere que esté el servicio?", "Nombre");
					ser.setOwner_name(owner_name);
					key = true;
					break;

				case 2: 

					String course_name = data_functions.askcourse_name("¿Cuál es el nombre de la marca/empresa que desea actualizar?", "Nombre de la marca/empresa");
					ser.setCourse_name(course_name);
					key = true;
					break;

				case 3: 

					String invited_name = data_functions.askinvited_name("¿A qué nombre de invitado/a desea cambiar?", "Nombre del invitado/a");
					((InvitationCard) ser).setInvited_name(invited_name);
					key = true;
					break;

				case 4:

					int price = validates.number("¿Qué precio tenía el servicio?", "Precio");
					ser.setPrice(price);
					key = true;
					break;

				case 5: 

					String[] option_colors = {"Pasteles", "Claros", "Oscuros" };
					ser.setColors(validates.combo(option_colors, "¿A qué colores quieres cambiar?", "Colores"));
					key = true;
					break;

				case 6:

					String[] option_shape = {"Circular", "Cuadrado", "Rectangular" };
					String shape = validates.combo(option_shape, "¿A qué tipo de forma quiere cambiar?", "Forma");
					((InvitationCard) ser).setShape(shape);
					key = true;
					break;

				default:
					
					key = true;
					break;

				}

			}while (key != true);
			
		}

	}

	// REDES SOCIALES //

	public static SocialNetworks asksocialNetworks_id(String message) { 

		Singleton.id = data_functions.askid(message, "Id");

		return new SocialNetworks(Singleton.id); 
	
	}

	public static SocialNetworks create_SocialNetworks() {
		
		String id = Singleton.id;
		
		String owner_name = data_functions.askowner_name("Escribe su nombre", "Nombre");
				
		String course_name = data_functions.askcourse_name("Nombre de la marca/empresa", "Nombre de la marca");
		
		int price = validates.number("¿Qué precio tiene el servicio?", "Precio");
		
		String[] option_colors = {"Pasteles", "Claros", "Oscuros" };
		String colors = validates.combo(option_colors, "¿Qué colores quiere elegir?", "Colores");
		
		String[] option_design_type = {"Historia", "Post", "Historia Destacada" };
		String design_type = validates.combo(option_design_type, "¿Qué tipo de diseño desea?", "Forma");

		return new SocialNetworks(id, owner_name, course_name, price, colors, design_type); 
		
	} /// END CREATE ///

	// UPDATE REDES SOCIALES // 

	public static void update_socialNetworks_id(SocialNetworks soc, Service ser) {

		int location = -1;

		soc = functions_service.asksocialNetworks_id("¿Cuál es el identificador del servicio que quieres modificar?");

		location = find_functions.find_socialNetworks(soc);

		if (location != -1) {

			JOptionPane.showMessageDialog(null, "Ya existe este identificador", "Error", JOptionPane.ERROR_MESSAGE);

		}else {

			ser.setId(Singleton.id);

		}

	}

	public static void update_soc(Service ser) {

		if (ser instanceof SocialNetworks) {

			String[] atributos = { "Identificador", "Nombre del propietario", "Nombre del curso", "Precio", "Colores", "Tipo de diseño" };
			int option_menu = 0;
			boolean key = false;
			SocialNetworks soc = null;

			do {

				option_menu = functions_menu.menubuttons(atributos, "Selecciona la opción de desea actualizar:", "Elija la opción deseada");

				switch (option_menu) {

				case 0: 

					functions_service.update_socialNetworks_id(soc, ser);
					key = true;
					break;
				
				case 1:

					String owner_name = data_functions.askowner_name("¿A qué nombre quiere que esté el servicio?", "Nombre");
					ser.setOwner_name(owner_name);
					key = true;
					break;

				case 2: 

					String course_name = data_functions.askcourse_name("¿Cuál es el nombre de la marca/empresa que desea actualizar?", "Nombre de la marca/empresa");
					ser.setCourse_name(course_name);
					key = true;
					break;

				case 3:

					int price = validates.number("¿Qué precio tenía el servicio?", "Precio");
					ser.setPrice(price);
					key = true;
					break;

				case 4: 

					String[] option_colors = {"Pasteles", "Claros", "Oscuros" };
					ser.setColors(validates.combo(option_colors, "¿A qué colores quieres cambiar?", "Colores"));
					key = true;
					break;

				case 5:

					String[] option_design_type = {"Historia", "Post", "Historia Destacada" };
					String design_type = validates.combo(option_design_type, "¿A qué tipo de diseño quiere cambiar?", "Tipo de diseño");
					((SocialNetworks) ser).setDesign_type(design_type);
					key = true;
					break;

				default:
					
					key = true;
					break;

				}

			}while (key != true);
			
		}

	}	

}