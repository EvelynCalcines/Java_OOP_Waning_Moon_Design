package Menu;

import javax.swing.JOptionPane;

import Modules.Design.Clases.LogoDesign;
import Modules.Functions.update_functions;
import Modules.Functions.CRUD.create_functions;
import Modules.Functions.CRUD.delete_functions;
import Modules.Functions.CRUD.order_functions;
import Modules.Functions.CRUD.read_functions;
import Modules.utils.functions_menu;
import Modules.Design.Clases.Singleton;

import java.util.ArrayList;

public class menu_services {
	
	public static void main(String[] args) {

		String[] services = {"Diseño de logo", "Tarjeta de invitación", "Redes Sociales", "Salir" };
		String[] crud = {"Create", "Read", "Update", "Delete", "Ordenar", "Back", "Salir"};
		boolean key_menu_crud = false;
		boolean key_menu_services = false; 
		LogoDesign log = null;
		Singleton.LogoDesign = new ArrayList <LogoDesign> ();

		do {

			int option_menu_services = functions_menu.menubuttons(services, "Elige un servicio:", "Servicios");

			key_menu_services = true;

			switch (option_menu_services) {

			case 0: // LOGO

				key_menu_crud = true;

				do {

					int option_menu_logo = functions_menu.menubuttons(crud, "Seleccione qué quiere hacer:", "Diseño de logo" );

					switch (option_menu_logo) {

					case 0: // CREATE
						create_functions.create_LogoDesign(log);
						break;

					case 1: // READ
						read_functions.read_logoDesign(log);
						break;

					case 2: // UPDATE
						update_functions.update_LogoDesign(log);
						break;

					case 3:  // DELETE
						delete_functions.delete_LogoDesign(log);
						break;

					case 4: // ORDENAR
						order_functions.order_LogoDesign();
						break;


					case 5: // ATRÁS
						JOptionPane.showMessageDialog(null, "Back");
						key_menu_crud = false;
						break;

					default: // SALIR
						JOptionPane.showMessageDialog(null, "Salir");
						key_menu_crud = false;
						key_menu_services = false;
						break;

					}

				}while (key_menu_crud != false);

				break; 

			case 1: // TARJETA DE INVITACIÓN

				key_menu_crud = true;

				do {

					int option_menu_invitation_card = functions_menu.menubuttons(crud, "Seleccione qué quiere hacer:", "Tarjeta de invitación" );

					switch (option_menu_invitation_card) {

					case 0: // CREATE
						
						key_menu_crud = true;
						break;

					case 1: // READ
						JOptionPane.showMessageDialog(null, "Read");
						break;

					case 2: // UPDATE
						JOptionPane.showMessageDialog(null, "Update");
						break; 

					case 3: // DELETE
						JOptionPane.showMessageDialog(null, "Delete");
						break;

					case 4: // ORDENAR
						JOptionPane.showMessageDialog(null, "Ordenar");
						break;

					case 5: // ATRÁS
						JOptionPane.showMessageDialog(null, "Back");
						key_menu_crud = false;
						System.out.print("Volver");				
						break;

					default: // SALIR
						JOptionPane.showMessageDialog(null, "Salir");
						key_menu_crud = false;
						key_menu_services = false;
						System.out.print("Saliendo del todo");				
						break; 

					}

				}while (key_menu_crud != false);

				break;

			case 2: // REDES SOCIALES

				key_menu_crud = true;

				do {

					int option_menu_socialnetworks = functions_menu.menubuttons(crud, "Seleccione qué quiere hacer:", "Redes Sociales" );

					switch (option_menu_socialnetworks) {

					case 0: // CREATE
						JOptionPane.showMessageDialog(null, "Create");
						break;

					case 1: // READ
						JOptionPane.showMessageDialog(null, "Read");
						break;

					case 2: // UPDATE
						JOptionPane.showMessageDialog(null, "Update");
						break; 

					case 3: // DELETE
						JOptionPane.showMessageDialog(null, "Delete");
						break;

					case 4: // ORDENAR
						JOptionPane.showMessageDialog(null, "Ordenar");
						break;

					case 5: // ATRÁS
						JOptionPane.showMessageDialog(null, "Back");
						key_menu_crud = false;
						break;

					default: // SALIR
						JOptionPane.showMessageDialog(null, "Salir");
						key_menu_crud = false;
						key_menu_services = false;
						break; 

					}

				}while (key_menu_crud != false); 

				break;

			default: // SALIR
				JOptionPane.showMessageDialog(null, "Salir");
				key_menu_services = false;
				break;
			}

		}while (key_menu_services != false);

	}
}