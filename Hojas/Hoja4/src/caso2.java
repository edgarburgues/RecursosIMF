import java.util.Scanner;

public class caso2 {

	public static void main(String[] args) {
		// Pregunta al usuario por dos cadenas y m�zclalas.
		// Por ejemplo: �ABCDEFGHI� y �1234�
		// EL resultado ser� �A1B2C3D4EFGHI�

		String palabra1;
		String palabra2;
		byte longitudPeq;

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce una cadena de caracteres: ");
		palabra1 = scanner.nextLine();
		System.out.print("Introduce otra cadena de caracteres: ");
		palabra2 = scanner.nextLine();
		
		if (palabra1.length() > palabra2.length() || palabra1.length() == palabra2.length()) {
			longitudPeq = (byte) (palabra2.length() + 1);
		} else {
			longitudPeq = (byte) (palabra1.length() + 1);
		}

		for (int i = 0; i < longitudPeq - 1; i++) {
			System.out.print(palabra1.charAt(i));
			System.out.print(palabra2.charAt(i));
		}

		if (palabra1.length() > palabra2.length()) {
			for (int i = longitudPeq - 1; i < palabra1.length(); i++) {
				System.out.print(palabra1.charAt(i));
			}		
		} else {
			for (int i = longitudPeq - 1; i < palabra2.length(); i++) {
				System.out.print(palabra2.charAt(i));
			}
		}
		

		scanner.close();
	}

}



// QWERTY
// 123456 78