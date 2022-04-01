import java.util.Scanner;

public class caso20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		byte numeroUsuario;
		double sumaTotal = 1;

		do {
			System.out.print("Introduce un n�mero: ");
			numeroUsuario = sc.nextByte();
		} while (numeroUsuario < 0);

		for (int i = numeroUsuario; i > 0; i--) {
			if (i != 1) {
				System.out.print(i + " + ");
				sumaTotal = i + sumaTotal;
			} else {
				System.out.print(i + " ");
			}

		}
		System.out.print(" = " + sumaTotal);
		sc.close();
	}

}
