package mx.com.everis.tallerjava.clases;

public class Personaje {
	private int idPersonaje;
	private String nombre;
	private String fechaNacimiento;
	private String descripcion;
	
	public Personaje(int idPersonaje, String nombre, String fechaNacimiento, String descripcion) {
		super();
		this.idPersonaje = idPersonaje;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.descripcion = descripcion;
	}

	public int getIdPersonaje() {
		return idPersonaje;
	}

	public void setIdPersonaje(int idPersonaje) {
		this.idPersonaje = idPersonaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	

}

