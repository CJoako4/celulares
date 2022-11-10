
public class Persona {

	private String nombre;
	private String dni;
	private String genero;

	public Persona(String nombre, String dni, String genero) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.genero = genero;
	}

	public void usarCelular(Celular celular) {
		System.out.println("soy " + this.nombre + " y uso  el celular " + celular.getModelo());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", genero=" + genero + "]";
	}
	
	public void hacerLlamada(Celular nuestro, Celular otro, Persona nombre) {
		
		
		System.out.println("soy " + this.getNombre() + " y estoy llamando a " + nombre.getNombre());
		nuestro.perderBateria();
		otro.perderBateria();
		System.out.println("fin de la llamada...");
		
		
	}
	
	
	
	
}
