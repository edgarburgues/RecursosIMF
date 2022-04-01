import java.util.Scanner;

public class casoClase4 {
	public static void main(String[] args) {
		// Dividir un nombre

		Scanner scanner = new Scanner(System.in);
		String nombreCompleto;

		System.out.print("Dime tu nombre completo: ");

		nombreCompleto = scanner.nextLine();

		do {
			System.out.println(nombreCompleto.substring(0, nombreCompleto.indexOf(" ")));
			nombreCompleto = nombreCompleto.substring(nombreCompleto.indexOf(" ") + 1);
		} while (nombreCompleto.indexOf(" ") != -1);

		System.out.println(nombreCompleto);
		scanner.close();
	}
}
