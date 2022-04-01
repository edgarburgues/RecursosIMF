import java.util.Scanner;
public class caso1 {

	public static void main(String[] args) {
		//Generar X n�meros aleatorios en entre Y n�meros
		int numeroUsuario;
		int repeticiones;
		int numeroGenerado;
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Introduce un n�mero entre 100 y 1000: ");
			numeroUsuario = sc.nextInt();
		} while (numeroUsuario < 100 || numeroUsuario > 1000);
		do {
			System.out.print("Introduce un n�mero de repeticiones superior a 3: ");
			repeticiones = sc.nextInt();
		} while (repeticiones < 3);
		//Comprobar cu�l es el mayor
		for (int i = 1; i <= repeticiones; i++) {
			numeroGenerado = (int) (Math.random() * (numeroUsuario - 100 + 1) + 100);
			System.out.println(i + ". " + numeroGenerado);
			if (numeroGenerado > numero1) {
				numero3 = numero2;
				numero2 = numero1;
				numero1 = numeroGenerado;
			} else {
				if (numeroGenerado > numero2) {
					numero3 = numero2;
					numero2 = numeroGenerado;
				} else {
					if (numeroGenerado > numero3) {
						numero3 = numeroGenerado;
					}
				}
			}
		}
		System.out.println("N�mero m�s alto:		" + numero1);
		System.out.println("Segundo n�mero m�s alto: 	" + numero2);
		System.out.println("Tercer n�mero m�s alto: 	" + numero3);
		sc.close();
	}

}