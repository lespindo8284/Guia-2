public class Estudiante extends Persona{
	
	private String carrera;
	private String[] materias;
	private int promedio;
	
	public Estudiante(String n,String a, int f, int id, String c, String[] m, int p){
		super(n, a, f, id);
		carrera = c;
		materias=m;
		promedio=p;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
 }