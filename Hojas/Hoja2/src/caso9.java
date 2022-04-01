import java.util.Scanner;

public class caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		do {
			System.out.print("Introduce un n�mero entre 0 y 9999: ");
			numero = sc.nextInt();
		} while (numero < 0 || numero >= 10000);
		if (numero < 10) {
			System.out.println("Tiene 1 d�gito");
		} else if (numero < 100) {
			System.out.println("Tiene 2 d�gitos");
		} else if (numero < 1000) {
			System.out.println("Tiene 3 d�gitos");
		} else {
			System.out.println("Tiene 4 d�gitos");
		}
		sc.close();
	}

}
