package Modules.Design.Clases;

public class InvitationCard extends Service {

	private String shape;
	private String invited_name;
	
// CONSTRUCTOR //

	public InvitationCard(String id, String owner_name, String course_name, String invited_name, int price, String colors, String shape) {
		super(id, owner_name, course_name, price, colors);
	
		this.shape = shape;
		this.invited_name = invited_name; 
		
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
	
	public String getInvited_name() {
		return invited_name; 
	
	}
	
// SETTERS //
	
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	public void setInvited_name(String Invited_name) {
		this.invited_name = Invited_name; 
	}
	
// TO STRING //	

	public String toString() {
		
		return "InvitationCard: " + "\n" + "Id: " + getId() + "\n" + 
			   "Nombre del propietario: " + getOwner_name() + "\n" + 
			   "Nombre del curso: " + getCourse_name() + "\n" + 
			   "Nombre del invitado: " + getInvited_name() + "\n" +
			   "Precio: " + getPrice() + "\n" + 
		       "Colores: " + getColors() + "\n" +
			   "Forma: " + getShape();
	}	
}

//// END INVITATIONCARD


