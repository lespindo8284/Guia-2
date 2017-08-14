public class Persona {
	
	private String nombre;
	private String apellido;
	private int fechaNacimiento;
	private int numId;

	public Persona(String n,String a, int f, int id)	{
		nombre = n;
		apellido = a;
		fechaNacimiento = f;
		numId = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getNumId() {
		return numId;
	}

	public void setNumId(int numId) {
		this.numId = numId;
	}
	
}