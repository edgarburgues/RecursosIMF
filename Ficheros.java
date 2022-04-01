import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ficheros {

	public Ficheros() {
		super();

	}

	public static int leerNumeroEnFichero() {
		String cadena = "Ha ocurrido un error";
		FileReader fichero = null;
		BufferedReader lector = null;
		try {
			fichero = new FileReader("data/edad.txt");
			lector = new BufferedReader(fichero);

			cadena = lector.readLine();

		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero");
		} catch (IOException e) {
			System.out.println("Hay un problema de lectura");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (lector != null) {
					lector.close();
				}
				if (fichero != null) {
					fichero.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("fin");
		}
		return Integer.parseInt(cadena);
	}

	public static void EscribirEnFichero(ArrayList<Persona> listaPersonas, String path, int posicion) {
		FileWriter fichero = null;
		try {
			fichero = new FileWriter(path, true);
			fichero.write(listaPersonas.get(posicion).getNombre() + "\n");

		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero");
		} catch (IOException e) {
			System.out.println("Hay un problema de lectura");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (fichero != null) {
					fichero.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("fin");
		}

	}
}
