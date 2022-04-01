import java.util.Scanner;

public class casoClase1 {

	public static void main(String[] args) {
		// Encontrar una letra en una palabra

		Scanner scanner = new Scanner(System.in);
		String palabra;
		char letra;
		byte i = 0;

		System.out.print("Introduce una palabra: ");
		palabra = scanner.nextLine();

		do {
			letra = palabra.charAt(i);
			i++;
		} while (letra != 'p' && i < palabra.length());

		if (letra == 'p') {
			System.out.println("Contiene la P");
		} else {
			System.out.println("No contiene la P");
		}
		scanner.close();
	}
}