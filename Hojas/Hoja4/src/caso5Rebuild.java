import java.util.Scanner;

public class caso5Rebuild {

	public static void main(String[] args) {
		// Variables
		String contrasena, contrasena2;
		String mayusculas = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String numeros = "1234567890";
		String especiales = ".,-_?!��$%&/";
		boolean compMayus = false;
		boolean compNum = false;
		boolean compRaro = false;
		boolean compInicioFinal = false;
		boolean compLongitud = false;
		boolean compSeguidos = false;
		byte i = 0;
		byte checkChar1;
		byte checkChar2;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce una contraseña: ");
		contrasena = scanner.nextLine();

		System.out.print("Introduce otra vez la contraseña: ");
		contrasena2 = scanner.nextLine();

		if (contrasena.equals(contrasena2)) {
			System.out.println("- Son iguales");

			// Contiene al menos una letra may�scula.
			while (!compMayus && i < contrasena.length()) {
				if (mayusculas.indexOf(contrasena.charAt(i)) != -1) {
					compMayus = true;
				}
				i++;
			}

			// Contiene al menos un n�mero.
			i = 0;
			while (!compNum && i < contrasena.length()) {
				if (numeros.indexOf(contrasena.charAt(i)) != -1) {
					compNum = true;
				}
				i++;
			}

			// Contiene alg�n car�cter raro (.,-_?!��$%&/) pero ni al inicio ni al
			// final.
			i = 0;
			while (!compRaro && i < contrasena.length()) {
				if (especiales.indexOf(contrasena.charAt(i)) != -1) {
					compRaro = true;
				}
				i++;
			}
			
			//System.out.println(especiales.indexOf(contrasena.charAt(contrasena.length()) - 2));
			

			
			
			if ((especiales.indexOf(contrasena.charAt(0)) != -1) 
					|| (especiales.indexOf(contrasena.charAt(contrasena.length() - 1)) != -1)) {
				System.out.println("-- Empieza o termina con caracter especial");
				compInicioFinal = true;
			} else {
				System.out.println("- Ni comienza ni termina con caracter especial");
			}

			// No hay dos caracteres raros seguidos.
			i = 0;
			while ( i < contrasena.length() - 1) {
				checkChar1 = (byte) especiales.indexOf(contrasena.charAt(i));
				checkChar2 = (byte) especiales.indexOf(contrasena.charAt(i + 1));
				if (checkChar1 != -1 && checkChar2 != -1) {
					compSeguidos = true;
				}
				i++;
			}

			// Tiene al menos 8 caracteres y m�ximo 15.
			if (contrasena.length() >= 8 && contrasena.length() <= 15) {
				System.out.println("- Tiene entre 8 y 15 caracteres");
				compLongitud = true;
			} else {
				System.out.println("-- No tiene entre 8 y 15 caracteres");
			}

			// Mostrar validaciones
			if (compMayus) {
				System.out.println("- Contiene al menos una mayúscula");
			} else {
				System.out.println("-- Necesita al menos una mayúscula");
			}

			if (compNum) {
				System.out.println("- Contiene al menos un número");
			} else {
				System.out.println("-- Necesita al menos un número");
			}

			if (compRaro) {
				System.out.println("- Contiene al menos un caracter especial");
			} else {
				System.out.println("-- Necesita al menos un caracter especial");
			}

			if (compSeguidos) {
				System.out.println("-- Contiene dos caracteres especiales seguidos");
			} else {
				System.out.println("- No contiene dos caracteres especiales seguidos");
			}

			if (compMayus && compNum && compRaro && !compSeguidos && !compInicioFinal && compLongitud) {
				System.out.println("-------Cumple todos los requisitos-------");
			} else {
				System.out.println("-------No cumple los requisitos-------");
			}
		} else {
			System.out.println("-- Las contraseñas no son iguales");
		}
		scanner.close();
	}

}
