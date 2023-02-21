package Modules.utils;

import javax.swing.JOptionPane;

import utils.regular_expr;
import utils.validates;

public class data_functions {

	// IDENTIFICADOR //
	
	public static String askid(String message, String title) {
		boolean result = false;
		String id = "";
		
		do {
			id = validates.cad(message, title);
	
			result = regular_expr.id(id);
			
			if (result == false) {
				
				JOptionPane.showMessageDialog(null, "No es un código de referencia válido", "Error", JOptionPane.ERROR_MESSAGE);
				
			}else {

				result = true;
				
			}
			
		}while (result == false);
		
		return id;
		
	}
	
	// NOMBRE DEL PROPIETARIO //

	public static String askowner_name(String message, String title) {

		String owner_name = "";
		boolean result = false;

		owner_name = validates.cad(message, title);

		result = regular_expr.owner_name(owner_name);

		return owner_name;
	} 
	
	// NOMBRE DEL CURSO //	

	public static String askcourse_name(String message, String title) {

		String course_name = "";
		boolean result = false;

		course_name = validates.cad(message, title);

		result = regular_expr.course_name(course_name);

		return course_name;
	} 
	
}