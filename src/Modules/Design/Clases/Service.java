package Modules.Design.Clases;

public abstract class Service implements Comparable<Service> {
	
	// ATRIBUTOS //
	
	private String id;
	private String owner_name;
	private String course_name; 
	private int price;
	private String colors; 
	
	// CONSTRUCTOR //
	
	public Service (String id, String owner_name, String curse_name, int price, String colors) {
		
		super(); 
		this.id = id;
		this.owner_name = owner_name;
		this.course_name = curse_name;
		this.price = price;
		this.colors = colors; 
		
	}
	
	// CONSTRUCTOR VACÍO //
	
	public Service() {
		
	}
	
	// CONSTRUCTOR CLAVE PRIMARIA //
	
	public Service(String id) {
		this.id = id; 
	}
	
	// GETTERS //
	
	public String getId() {
		return id;
	}
	
	public String getOwner_name() {
		return owner_name;
	}
	
	public String getCurse_name() {
		return course_name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getColors() {
		return colors;
	}
	
	// SETTERS //
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	
	public void setCourse_name(String curse_name) {
		this.course_name = curse_name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setColors(String colors) {
		this.colors = colors; 
	}
	
	public int compareTo(Service service) { // para ordenar por nombre
		if (this.getId().compareTo(service.getId()) > 0)
			return 1;
		if (this.getId().compareTo(service.getId()) < 0)
			return -1;
		return 0; 
	}
	
	public boolean equals(Object service) {
		return getId().equals(((Service) service).getId());
	}
	
	public abstract String toString(); 
	
	
}