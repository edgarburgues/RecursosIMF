import java.util.Arrays;
import java.util.Scanner;

public class caso2 {

	public static void main(String[] args) {
		// Pregunta al usuario por dos arrays de caracteres y mézclalos.
		// Por ejemplo: “ABCD” y “1234”
		// EL resultado será “A1B2C3D4”
		// Se valora que el usuario seleccione el tamaño de los arrays.

		String palabra1;
		String palabra2;
		byte longitudPeq;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce una palabra: "); // Se piden dos strings
		palabra1 = scanner.nextLine();
		System.out.print("Introduce otra palabra: ");
		palabra2 = scanner.nextLine();

		char[] cadena1 = palabra1.toCharArray(); // Esto es un método que convierte un string en un array de chars
		char[] cadena2 = palabra2.toCharArray();

		if (cadena1.length > cadena2.length) { // compruebo cuál de las dos es mayor. Igualo longitudPeq al tamaño de la pequeña de las dos
			longitudPeq = (byte) (cadena2.length);
		} else {
			longitudPeq = (byte) (cadena1.length);
		}

		for (int i = 0; i < longitudPeq; i++) { // Imprimo cada letra en la misma linea hasta el tamaño máximo de la pequeña
			System.out.print(cadena1[i]); 		// De esta forma se imprimirá la pequeña completa y sólo una parte de la grande
			System.out.print(cadena2[i]);
		}

		if (cadena1.length > cadena2.length) { 						// Aquí vuelvo a comprobar cuál de las dos es más grande y con un bucle for
			for (int i = longitudPeq; i < cadena1.length; i++) {	// le digo que imprima cada posición del grande desde donde se quedó hasta el final
				System.out.print(cadena1[i]);
			}
		} else if (cadena1.length < cadena2.length) {
			for (int i = longitudPeq; i < cadena2.length; i++) {
				System.out.print(cadena2[i]);
			}
		}

		scanner.close();
	}
}
