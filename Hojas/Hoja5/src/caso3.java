import java.util.Arrays;
import java.util.Random;

public class caso3 {

	public static void main(String[] args) {
		// Genera 20 números enteros al azar entre 1 y 100. Ordénalos sin usar
		// Arrays.sort.

		Random rand = new Random();

		byte[] numeros = new byte[20];
		byte temporal;
		byte contador = 1;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (byte) rand.nextInt(101);
		}

		System.out.println("Array sin orden: " + Arrays.toString(numeros));

		while (numeros[0] > numeros[1] || numeros[1] > numeros[2] || numeros[2] > numeros[3] || numeros[3] > numeros[4]
				|| numeros[4] > numeros[5] || numeros[5] > numeros[6] || numeros[6] > numeros[7]
				|| numeros[7] > numeros[8] || numeros[8] > numeros[9] || numeros[9] > numeros[10]
				|| numeros[10] > numeros[11] || numeros[11] > numeros[12] || numeros[12] > numeros[13]
				|| numeros[13] > numeros[14] || numeros[14] > numeros[15] || numeros[15] > numeros[16]
				|| numeros[16] > numeros[17] || numeros[17] > numeros[18] || numeros[18] > numeros[19]) {
			if (numeros[contador] < numeros[contador - 1]) {
				temporal = numeros[contador - 1];
				numeros[contador - 1] = numeros[contador];
				numeros[contador] = temporal;
			}
			contador++;
			if (contador == 20) {
				contador = 1;
			}
		}

		System.out.println("Array con orden: " + Arrays.toString(numeros));

	}

}
