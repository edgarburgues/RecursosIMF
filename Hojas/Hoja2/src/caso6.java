import java.util.Scanner;

public class caso6 {

	public static void main(String[] args) {
		int numeroUsuario;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un n�mero: ");
		numeroUsuario = sc.nextInt();
		if (numeroUsuario >= 0) {
			System.out.println("Es positivo");
		} else {
			System.out.println("Es negativo");
		}
		sc.close();
	}

}
