import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private int edad;
	private float media;
	private boolean promociona;
	private int cursoActual;

	public Alumno(String nombre, int edad, float media, boolean promociona, int cursoActual) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.media = media;
		this.promociona = promociona;
		this.cursoActual = cursoActual;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	public boolean isPromociona() {
		return promociona;
	}

	public void setPromociona(boolean promociona) {
		this.promociona = promociona;
	}

	public int getCursoActual() {
		return cursoActual;
	}

	public void setCursoActual(int cursoActual) {
		this.cursoActual = cursoActual;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", media=" + media + ", promociona=" + promociona
				+ ", cursoActual=" + cursoActual + "]";
	}

	

}
