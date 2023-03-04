package Modules.Design.Clases;

public class SocialNetworks extends Service {
	
	private String design_type;
	
	// CONSTRUCTOR //

		public SocialNetworks(String id, String owner_name, String course_name, int price, String colors, String design_type) {
			super(id, owner_name, course_name, price, colors);
		
			this.design_type = design_type; 
	
		}
		
	// CONSTRUCTOR VACÍO //
		
		public SocialNetworks() {
					
		}
	
	// CONSTRUCTOR CLAVE PRIMARIA //
		
		public SocialNetworks(String id) {
			super(id); 
			
		}
	
	// GETTERS //
		
		public String getDesign_type() {
			return design_type;
			
		}
	
	// SETTERS //
		
		public void setDesign_type(String design_type) {
			this.design_type = design_type;
		}
	
	// TO STRING //	

		public String toString() {
			
			return "InvitationCard: " + "\n" + "Id: " + getId() + "\n" + 
				   "Nombre del propietario: " + getOwner_name() + "\n" + 
				   "Nombre de la marca/empresa: " + getCourse_name() + "\n" + 
				   "Precio: " + getPrice() + "\n" + 
			       "Colores: " + getColors() + "\n" + 
				   "Tipo del diseño: " + getDesign_type();
	
		}	
}

//// END SOCIALNETWORKS

