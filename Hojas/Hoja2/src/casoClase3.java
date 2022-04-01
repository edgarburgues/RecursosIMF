import java.util.Scanner;

public class casoClase3 {

	public static void main(String[] args) {
		// Encontrar una letra en una palabra

		Scanner scanner = new Scanner(System.in);
		String nombreCompleto;
		String nombre;
		String apellido1;
		String apellido2;
		byte primerEspacio;
		byte segundoEspacio;

		System.out.println("Dime tu nombre completo: ");
		nombreCompleto = scanner.nextLine();

		primerEspacio = (byte) nombreCompleto.indexOf(" ");
		segundoEspacio = (byte) nombreCompleto.lastIndexOf(" ");
		System.out.println(primerEspacio);
		nombre = nombreCompleto.substring(0, primerEspacio);
		System.out.println(nombre);
		apellido1 = nombreCompleto.substring(primerEspacio + 1, segundoEspacio);
		System.out.println(apellido1);
		apellido2 = nombreCompleto.substring(segundoEspacio + 1);
		System.out.println(apellido2);

		scanner.close();
	}
}