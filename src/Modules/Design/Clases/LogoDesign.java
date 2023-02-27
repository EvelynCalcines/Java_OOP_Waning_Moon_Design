package Modules.Design.Clases;

public class LogoDesign extends Service {
	
	private String template_type;

// CONSTRUCTOR //
	
	public LogoDesign(String id, String owner_name, String course_name, int price, String colors, String template_type) {
		super(id, owner_name, course_name, price, colors);
		
		this.template_type = template_type;
	}
	
// CONSTRUCTOR VACÍO //
	
		public LogoDesign() {
			
		}
	
// CONSTRUCTOR CLAVE PRIMARIA //
	
		public LogoDesign(String id) {
			super(id); 
		}
	
// GETTERS //
		
		public String getTemplate_type() {
			return template_type;
		}

// SETTERS //
		
		public void setTemplate_type(String template_type) {
			this.template_type = template_type;
		}
	
// TO STRING //	
	
		public String toString() {
			
			return "LogoDesign: " + "\n" + "Id: " +  getId() + "\n" + 
				   "Nombre del propietario: " + getOwner_name() + "\n" + 
				   "Nombre del curso: " + getCourse_name() + "\n" + 
				   "Precio: " + getPrice() + "\n" + 
				   "Colores: " + getColors() + "\n" +
				   "Tipo de plantilla" + getTemplate_type();
		}

}

//// END LOGODESIGN
