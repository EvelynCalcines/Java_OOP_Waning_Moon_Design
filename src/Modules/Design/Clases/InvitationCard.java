package Modules.Design.Clases;

public class InvitationCard extends Service {

	private String shape;
	private String guest_name;
	
// CONSTRUCTOR //

	public InvitationCard(String id, String owner_name, String course_name, int price, String colors, String shape, String guest_name) {
		super(id, owner_name, course_name, price, colors);
	
		this.shape = shape;
		this.guest_name = guest_name; 
		
	}
	
// CONSTRUCTOR VACÍO //
	
	public InvitationCard() {
				
	}
	
// CONSTRUCTOR CLAVE PRIMARIA //
	
	public InvitationCard(String id) {
		super(id); 
		
	}
	
// GETTERS //
	
	public String getShape() {
		return shape;
		
	}
	
	public String getGuest_name() {
		return guest_name; 
	
	}
	
// SETTERS //
	
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	public void setGuest_name(String guest_name) {
		this.guest_name = guest_name; 
	}
	
// TO STRING //	

	public String toString() {
		
		return "InvitationCard: " + "\n" + "Id: " + getId() + "\n" + 
			   "Nombre del propietario: " + getOwner_name() + "\n" + 
			   "Nombre del curso: " + getCourse_name() + "\n" + 
			   "Precio: " + getPrice() + "\n" + 
		       "Colores: " + getColors() + "\n" +
			   "Forma: " + getShape() + "\n" +
		       "Nombre del invitado: " + getGuest_name(); 	
	}	
}

//// END INVITATIONCARD


