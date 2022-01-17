package pac;

public class Profesor {
	
	private Long id; // nombre de la columna idProfesor
	private String nombre;
	private String sexo;
	
	public Profesor() {
		super();
	}

	public Profesor(String nombre, String sexo) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + ", sexo=" + sexo + "]";
	}
	
	

}
