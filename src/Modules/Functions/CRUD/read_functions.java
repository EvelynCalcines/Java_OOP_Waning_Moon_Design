package Modules.Functions.CRUD;

import javax.swing.JOptionPane;

import Modules.Design.Clases.Singleton;
import Modules.Design.Clases.LogoDesign;
import Utils.data_functions;
import Utils.find_functions;
import Utils.functions_menu;


public class read_functions {

	public static LogoDesign find_logoDesign_id() { 

		Singleton.id = data_functions.askid("¿Cuál es el código del logo?", "Id");

		return new LogoDesign(Singleton.id); 
	}

	public static void read_logoDesign(LogoDesign log) {
		String[] menu = { "All", "One to one", "Atrás" };
		int option_menu_logo = 0;
		int location = -1;
		String cad = "";
		String atributo = "";
		String[] atributos = { "Identificador", "Nombre del propietario", "Nombre del curso", "Precio", "Colores", "Tipo de plantilla", "Todos" };
		boolean key_read = false;

		if (Singleton.LogoDesign.isEmpty()) {

			JOptionPane.showMessageDialog(null, "No existe ningún identificador para poder leer", "Error", JOptionPane.ERROR_MESSAGE);	

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

					log = find_logoDesign_id();

					location = find_functions.find_logoDesign(log);

					if (location != -1) {

						log = Singleton.LogoDesign.get(location);
						
						int	option_atributo = functions_menu.menubuttons(atributos, "¿Qué característica quiere leer?", "Elige opción deseada");
						
						switch (option_atributo) {
						
						case 0: 
							
							atributo = ("Identificador: " + log.getId());
							break;
							
						case 1:
							
							atributo = ("Nombre del propietario: " + log.getOwner_name());
							break;
							
						case 2:
						
							atributo = ("Nombre de la marca/empresa: " + log.getCurse_name());
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
							
							atributo = (log.toString());
						}
						
						JOptionPane.showMessageDialog(null, atributo, "Características", JOptionPane.INFORMATION_MESSAGE);

					}else {

						JOptionPane.showMessageDialog(null, "No existe ningún identificador para poder leer", "Error", JOptionPane.ERROR_MESSAGE);

					}

					break;

				default:
					key_read = false;
					break;

				}  

			}while (key_read != true);
		}
	}
}