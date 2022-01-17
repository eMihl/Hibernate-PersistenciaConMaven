package pac;

public class Modulo {
	
	private Long id; // nombre de la columna idModulo
	private String nombre;
	private String codigo;
	
	public Modulo(Long id) {
		this.id=id;
	}

	public Modulo(String nombre, String codigo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Modulo [id=" + id + ", nombre=" + nombre + ", código=" + codigo + "]";
	}

}
