import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ListaAlumnos listaAlumnos = new ListaAlumnos();
		boolean masOpciones = false;
		int eleccion;

		do {
			if (listaAlumnos.getListaAlumnos().isEmpty()) {
				masOpciones = false;
			} else {
				masOpciones = true;
			}

			eleccion = Menu.mostrarMenu(masOpciones);
			switch (eleccion) {
			case 1: // insertar
				listaAlumnos.addAlumno();
				break;
			case 2: // modificar
				listaAlumnos.modificarAlumno();
				break;
			case 3: // eliminar
				listaAlumnos.eliminarAlumno();
				break;
			case 4: // consultar
				listaAlumnos.consulta();
				break;
			case 5: // Mostrar alumnos
				listaAlumnos.mostrarAlummnos();
				break;
			}
		} while (eleccion != 6);

	}

}
