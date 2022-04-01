import java.util.Scanner;

public class Menu {

	public Menu() {

	}

	public static int mostrarMenu(boolean masOpciones) {
		Scanner scanner = new Scanner(System.in);
		int eleccion;
		boolean valido = false;
		boolean comp1;
		boolean comp2;

		do {
			System.out.println("-------------------------------------------------------------------");
			System.out.println("1. Insertar");
			if (masOpciones) {
				System.out.println("2. Modificar");
				System.out.println("3. Eliminar");
				System.out.println("4. Consultar");
				System.out.println("5. Listar todo");
			}
			System.out.println("6. Finalizar sesión");
			System.out.print("Elige una opción: ");
			eleccion = Integer.parseInt(scanner.nextLine());
			System.out.println();
			comp1 = (eleccion != 1) && !masOpciones;
			comp2 = eleccion <= 0 || eleccion > 6;

//			System.out.println(comp1);
//			System.out.println(comp2);

			if (!(eleccion == 6)) {
				if ((comp1 || comp2)) {
					System.out.println("No es una opción válida");
				} else {
					valido = true;
				}
			} else {
				System.out.println("-------------------------------------------------------------------");
				System.out.println("-------------------------Fin de la sesión--------------------------");
				System.out.println("-------------------------------------------------------------------");
				valido = true;
			}
//			System.out.println("Debug Válido: " +  valido);

		} while (!valido);

		return eleccion;
	}

}
