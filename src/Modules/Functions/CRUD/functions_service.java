package Modules.Functions.CRUD;

import javax.swing.JOptionPane;
import Modules.Design.Clases.Singleton;
import Utils.data_functions;
import Modules.Design.Clases.LogoDesign;

public class functions_service {
	
	//// CREAMOS //// 

	public static LogoDesign create_logoDesign() {
		
		int price = 0;
		
		String id = Singleton.id;
		
		String owner_name = JOptionPane.showInputDialog(null, "Escribe su nombre: ", "Nombre", JOptionPane.QUESTION_MESSAGE);
				
		String course_name = JOptionPane.showInputDialog(null, "Nombre de la marca/empresa: ", "Nombre de la Marca", JOptionPane.QUESTION_MESSAGE);
		
		String price_string = JOptionPane.showInputDialog(null, "¿Qué precio tiene el servicio?", "Precio", JOptionPane.QUESTION_MESSAGE);
		price = Integer.parseInt(price_string);
		
		String[] option_colors = {"Pasteles", "Claros", "Oscuros" };
		String colors = JOptionPane.showInputDialog(null, "¿Qué colores quiere elegir?", "Colores", JOptionPane.QUESTION_MESSAGE);
		
		
		String[] option_template_type = {"Básico", "Estándar", "Premium" };
		String template_type = JOptionPane.showInputDialog(null, "¿Qué tipo de plantilla desea?", "Plantillas", JOptionPane.QUESTION_MESSAGE);
		

		return new LogoDesign(id, owner_name, course_name, price, colors, template_type); 
		
	} /// END CREATE ///

	public static LogoDesign create_logoDesign_id() { 

		Singleton.id = data_functions.askid("¿Qué identificador va a asignar al servicio?", "Id");

		return new LogoDesign(Singleton.id); 
	}


























}