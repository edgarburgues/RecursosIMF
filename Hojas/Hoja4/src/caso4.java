import java.util.Scanner;


public class caso4 {

	public static void main(String[] args) {
		// Pregunta al usuario por una cadena secreeta. Por ejemplo �Harry Potter�.
		// Jugamos al juego del ahorcado. El usuario ir� diciendo letras hasta que
		// complete la palabra o falle 4 veces.
		// Por ejemplo, pedir� la �R� y saldr� �**RR* *****R�

		String secreto;
		String censurado;
		String secretoNoMod;
		byte vidas = 4;
		char letra;
		byte posicion;
		boolean resuelto = false;
		String subCensurado1;
		String subCensurado2;
		String subSecreto1;
		String subSecreto2;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce la frase a adivinar: ");
		secreto = scanner.nextLine().toUpperCase();
		censurado = secreto;
		secretoNoMod = secreto;
		
		// convertir a *
		for (int i = 0; i < secreto.length(); i++) {
			if (secreto.charAt(i) != ' ') {
				censurado = censurado.replace(secreto.charAt(i), '*');
			}
		}
		System.out.println(censurado);

		// pedir letra

		do {

			System.out.println("Vidas: " + vidas);
			System.out.print("Introduce una letra: ");
			letra = scanner.nextLine().toUpperCase().charAt(0);

			// sustituir * por letras

			if (secreto.contains(Character.toString(letra))) {
				while (secreto.indexOf(letra) != -1) {
					posicion = (byte) secreto.indexOf(letra);
					subCensurado1 = censurado.substring(0, posicion);
					subCensurado2 = censurado.substring(posicion + 1);

					subSecreto1 = secreto.substring(0, posicion);
					subSecreto2 = secreto.substring(posicion + 1);

					censurado = subCensurado1 + letra + subCensurado2;
					secreto = subSecreto1 + "*" + subSecreto2;
				}

				if (censurado.equals(secretoNoMod)) {
					resuelto = true;
				}
			} else {
				vidas -= 1;
			}
			System.out.println(censurado);

		} while (vidas > 0 && !resuelto);

		if (resuelto) {
			System.out.println("Has ganado! :)");
		} else {
			System.out.println("Te has quedado sin vidas :(");
		}

		scanner.close();

	}

}
