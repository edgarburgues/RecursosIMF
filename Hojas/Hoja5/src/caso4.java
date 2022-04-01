
import java.util.Scanner;

public class caso4 {

	public static void main(String[] args) {
		// Genera un boleto de bingo al azar siguiendo este patrón:
		// 01 11 20 32 44 50 61 73 81 93
		// 04 13 21 38 47 53 66 74 87 94
		// 09 18 22 39 49 55 68 76 88 98
		// Se debe mostrar por consola en un formato que permita su lectura de manera
		// razonable.
		// Se debe almacenar en un array bidimensional.
		// Pide un número al usuario y devuelve si se encuentra en su cartón.

		int tablero[][] = new int[3][10];
		int random;
		int buffer;
		boolean encontrado = false;
		String consultaUsuario;
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < tablero.length; i++) {				
			for (int j = 0; j < tablero[i].length; j++) {
				random = (int) (Math.random() * 10 + j * 10);
				tablero[i][j] = random;
			}
		}

		for (int i = 0; i < tablero[0].length; i++) { 			
			do {
				if (tablero[0][i] > tablero[2][i]) {
					buffer = tablero[2][i];
					tablero[2][i] = tablero[0][i];
					tablero[0][i] = buffer;
				}
				if (tablero[0][i] > tablero[1][i]) {
					buffer = tablero[1][i];
					tablero[1][i] = tablero[0][i];
					tablero[0][i] = buffer;
				}
				if (tablero[1][i] > tablero[2][i]) {
					buffer = tablero[2][i];
					tablero[2][i] = tablero[1][i];
					tablero[1][i] = buffer;
				}
			} while (tablero[0][i] > tablero[1][i] || tablero[1][i] > tablero[2][i] || tablero[0][i] > tablero[2][i]);
		}

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}

		System.out.print("Introduce un número: ");
		consultaUsuario = scanner.nextLine();

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (Integer.parseInt(consultaUsuario) == tablero[i][j]) {
					encontrado = true;
				}
			}
		}
		if (encontrado) {
			System.out.println("Está en el tablero");
		} else {
			System.out.println("No está en el trablero");
		}

	}

}
