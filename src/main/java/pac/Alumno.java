package pac;

import java.util.Set;

public class Alumno {
	
	private Long id; // nombre de la columna idAlumno
	private String nombre;
	private String nacionalidad;
	int edad;
	private String sexo; 
	private Set<Modulo> modulos; // La relación entre Alumno y Modulo será llamada alumno_modulo
	
	public Alumno() {
		super();
	}

	public Alumno(String nombre, String nacionalidad, int edad, String sexo, Set<Modulo> modulos) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.sexo = sexo;
		this.modulos = modulos;
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

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Set<Modulo> getModulos() {
		return modulos;
	}

	public void setModulos(Set<Modulo> modulos) {
		this.modulos = modulos;
	}
	
	public int getModulosSize() {
		return this.modulos.size();
	}
	
	

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", edad=" + edad
				+ ", sexo=" + sexo + "]";
	}
	
}
