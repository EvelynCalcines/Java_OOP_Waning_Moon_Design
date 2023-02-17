package Utils;

import javax.swing.JOptionPane; 

public class data_functions {
	
	public static String askid(String message, String title) {
		boolean result = false;
		String id = "";
		
		do {
			id = JOptionPane.showInputDialog(null, "Dame un identificador", "Id", JOptionPane.QUESTION_MESSAGE);
			
			result = true;
			
			if (result == false) {
				
				JOptionPane.showMessageDialog(null, "No es un código de refrencia válido", "Error", JOptionPane.ERROR_MESSAGE);
				
			}else {
				result = true;
			}
			
		}while (result == false);
		
		return id;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}