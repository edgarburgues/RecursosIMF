import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		int numeroUsuario;
		int suma = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Introduce un n�mero: ");
			numeroUsuario = sc.nextInt();
			suma = numeroUsuario + suma;

		} while (suma <= 30);
		System.out.println("Done");
		sc.close();
	}
}
