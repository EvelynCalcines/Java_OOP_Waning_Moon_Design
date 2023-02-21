package Modules.Functions.CRUD;

import Modules.Design.Clases.Singleton;
import Modules.utils.data_functions;
import utils.validates;
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


























}