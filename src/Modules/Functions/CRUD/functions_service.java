package Modules.Functions.CRUD;

import Modules.Design.Clases.Service;
import Modules.Design.Clases.Singleton;
import Modules.utils.data_functions;
import Modules.utils.find_functions;
import Modules.utils.functions_menu;
import utils.validates;

import javax.swing.JOptionPane;

import Modules.Design.Clases.LogoDesign;

public class functions_service {
	
	//// CREAMOS //// 

	public static LogoDesign create_logoDesign() {
		
		String id = Singleton.id;
		
		String owner_name = data_functions.askowner_name("Escribe su nombre", "Nombre");
				
		String course_name = data_functions.askcourse_name("Nombre de la marca/empresa", "Nombre de la marca");
		
		int price = validates.price("¿Qué precio tiene el servicio?", "Precio");
		
		String[] option_colors = {"Pasteles", "Claros", "Oscuros" };
		String colors = validates.combo(option_colors, "¿Qué colores quiere elegir?", "Colores");
		
		String[] option_template_type = {"Básico", "Estándar", "Premium" };
		String template_type = validates.combo(option_template_type, "¿Qué tipo de plantilla desea?", "Plantillas");

		return new LogoDesign(id, owner_name, course_name, price, colors, template_type); 
		
	} /// END CREATE ///

	public static LogoDesign create_logoDesign_id() { 

		Singleton.id = data_functions.askid("¿Qué identificador va a asignar al servicio?", "Id");

		return new LogoDesign(Singleton.id); 
	}

	// CAMBIAMOS (UPDATE) //

	public static void update_LogoDesign_id(LogoDesign log, Service ser) {

		int location = -1;

		log = functions_service.create_logoDesign_id();

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

				option_menu = functions_menu.menubuttons(atributos, "Selecciona la opción de desea actualizar", "Elija la opción deseada");

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

					int price = validates.price("¿Qué precio tenía el servicio?", "Precio");
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

}