import java.util.ArrayList;
import java.util.Scanner;

public class ListaAlumnos {
	Alumno alumno;
	private ArrayList<Alumno> listaAlumnos;

	public ListaAlumnos() {
		listaAlumnos = new ArrayList<Alumno>();
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public ArrayList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	@Override
	public String toString() {
		return "ListaAlumnos [alumno=" + alumno + ", listaAlumnos=" + listaAlumnos + "]";
	}

	public void addAlumno() {
		Scanner scanner = new Scanner(System.in);
		String nombre;
		int edad;
		float media;
		boolean promociona = false;
		int cursoActual;

		System.out.print("Nombre del alumno: ");
		nombre = scanner.nextLine();

		System.out.print("Edad del alumno: ");
		edad = Integer.parseInt(scanner.nextLine());

		System.out.print("Media del alumno: ");
		media = scanner.nextFloat();
		scanner.nextLine();

		System.out.print("¿Promociona?[s/n]: ");
		if (scanner.nextLine().charAt(0) == 's') {
			promociona = true;
		}

		System.out.print("Curso actual: ");
		cursoActual = Integer.parseInt(scanner.nextLine());

		listaAlumnos.add(new Alumno(nombre, edad, media, promociona, cursoActual));
	}

	public void modificarAlumno() {
		Scanner scanner = new Scanner(System.in);
		int posicion;

		mostrarAlummnos();
		System.out.print("Introduce la posición del alumno que quieres modificar: ");
		posicion = Integer.parseInt(scanner.nextLine());

		System.out.println("1. Nombre\n2. Edad\n3. Media\n4. Promociona\n5. Curso actual");
		System.out.print("¿Qué atributo quieres cambiar?: ");
		switch (Integer.parseInt(scanner.nextLine())) {
		case 1:
			System.out.print("Introduce el nombre: ");
			listaAlumnos.get(posicion).setNombre(scanner.nextLine());
			break;
		case 2:
			System.out.print("Introduce la edad: ");
			listaAlumnos.get(posicion).setEdad(Integer.parseInt(scanner.nextLine()));
			break;
		case 3:
			System.out.print("Introduce la media: ");
			listaAlumnos.get(posicion).setMedia(scanner.nextFloat());
			scanner.nextLine();
			break;
		case 4:
			if (listaAlumnos.get(posicion).isPromociona()) {
				listaAlumnos.get(posicion).setPromociona(false);
			} else {
				listaAlumnos.get(posicion).setPromociona(true);
			}
			System.out.println("Cambiado");
			break;
		case 5:
			System.out.print("Introduce el curso actual: ");
			listaAlumnos.get(posicion).setCursoActual(Integer.parseInt(scanner.nextLine()));
			break;
		}

	}

	public void eliminarAlumno() {
		Scanner scanner = new Scanner(System.in);
		int posicion;

		mostrarAlummnos();

		System.out.print("¿Qué posición quieres eliminar?: ");
		posicion = Integer.parseInt(scanner.nextLine());
		listaAlumnos.remove(posicion);
	}

	public void consulta() {
		Scanner scanner = new Scanner(System.in);
		int eleccion;
		String palabraString;
		int numeroInt;
		float numeroFloat;

		System.out.println("1. Nombre\n2. Edad\n3. Media\n4. Promociona\n5. Curso actual");
		System.out.print("¿Sobre qué atributo quieres hacer la búsqueda?: ");
		eleccion = Integer.parseInt(scanner.nextLine());

		switch (eleccion) {
		case 1: // nombre : String
			System.out.print("¿Qué nombre quieres buscar?: ");
			palabraString = scanner.nextLine();
			for (int i = 0; i < listaAlumnos.size(); i++) {
				if (listaAlumnos.get(i).getNombre().equals(palabraString)) {
					System.out.println(listaAlumnos.get(i).toString());
				}
			}
			break;
		case 2: // edad : int
			System.out.print("¿Qué edad quieres buscar?: ");
			numeroInt = Integer.parseInt(scanner.nextLine());
			for (int i = 0; i < listaAlumnos.size(); i++) {
				if (listaAlumnos.get(i).getEdad() == numeroInt) {
					System.out.println(listaAlumnos.get(i).toString());
				}
			}
			break;
		case 3: // media : float
			System.out.print("¿Qué media quieres buscar?: ");
			numeroFloat = scanner.nextFloat();
			scanner.nextLine();
			for (int i = 0; i < listaAlumnos.size(); i++) {
				if (listaAlumnos.get(i).getEdad() == numeroFloat) {
					System.out.println(listaAlumnos.get(i).toString());
				}
			}
			break;
		case 4: // promociona : boolean
			System.out.print("¿Buscas [a]probados o [s]uspensos?: ");
			if (scanner.nextLine().charAt(0) == 'a') {
				for (int i = 0; i < listaAlumnos.size(); i++) {
					if (listaAlumnos.get(i).isPromociona()) {
						System.out.println(listaAlumnos.get(i).toString());
					}
				}
			} else {
				for (int i = 0; i < listaAlumnos.size(); i++) {
					if (!listaAlumnos.get(i).isPromociona()) {
						System.out.println(listaAlumnos.get(i).toString());
					}
				}
			}

			break;
		case 5: // cursoActual : int
			System.out.print("¿Qué curso quieres buscar?: ");
			numeroInt = Integer.parseInt(scanner.nextLine());
			for (int i = 0; i < listaAlumnos.size(); i++) {
				if (listaAlumnos.get(i).getCursoActual() == numeroInt) {
					System.out.println(listaAlumnos.get(i).toString());
				}
			}
			break;

		}

	}

	public void mostrarAlummnos() {
		for (int i = 0; i < listaAlumnos.size(); i++) {
			System.out.println(i + ". " + listaAlumnos.get(i).toString());
		}
	}

}
