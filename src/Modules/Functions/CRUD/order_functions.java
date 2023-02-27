package Modules.Functions.CRUD;

import java.util.Collections;

import javax.swing.JOptionPane;

import Modules.Design.Clases.Singleton;
import Modules.orders.course_name_order;
import Modules.orders.id_order;
import Modules.orders.owner_name_order;
import Modules.utils.functions_menu;

public class order_functions {
    
    public static void order_LogoDesign() {

        String[] menu = { "Código de referencia", "Nombre del propietario", "Nombre de la marca/empresa", "Salir" };
        int option_menu = 0;
        boolean key = false;

        if (Singleton.LogoDesign.isEmpty()) {

            JOptionPane.showMessageDialog(null, "No existen logos para poder ordenarlos", "Error", JOptionPane.ERROR_MESSAGE);

        } else if (Singleton.LogoDesign.size() == 1) {

            JOptionPane.showMessageDialog(null, "Sólo existe un logo y por lo tanto, no se puede ordenar", "Error", JOptionPane.ERROR_MESSAGE);

        } else {

            do {

                option_menu = functions_menu.menubuttons(menu, "Seleccione el orden que usted prefiera:", "Elija la opción deseada");

                switch (option_menu) {

                case 0: 

                    Collections.sort(Singleton.LogoDesign, new id_order());
                    key = true;
                    break;

                case 1: 

                    Collections.sort(Singleton.LogoDesign, new owner_name_order());
                    key = true;
                    break;

                case 2:

                    Collections.sort(Singleton.LogoDesign, new course_name_order());
                    key = true;
                    break;

                case 3:

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
