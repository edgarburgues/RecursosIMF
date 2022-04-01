import java.util.Scanner;

public class casoClase2 {

	public static void main(String[] args) {
		// Encontrar una letra en una palabra

		Scanner scanner = new Scanner(System.in);
		String palabra;
		byte letra;

		System.out.print("Introduce una palabra: ");
		palabra = scanner.nextLine();

		letra = (byte) palabra.indexOf('p');
		if (letra != -1) {
			System.out.println("Contiene la P");
		} else {
			System.out.println("No contiene P");
		}
		scanner.close();
	}
}