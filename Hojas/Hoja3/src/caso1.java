import java.util.Scanner;
public class caso1 {

	public static void main(String[] args) {
		//Generar X números aleatorios en entre Y números
		int numeroUsuario;
		int repeticiones;
		int numeroGenerado;
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Introduce un número entre 100 y 1000: ");
			numeroUsuario = sc.nextInt();
		} while (numeroUsuario < 100 || numeroUsuario > 1000);
		do {
			System.out.print("Introduce un número de repeticiones superior a 3: ");
			repeticiones = sc.nextInt();
		} while (repeticiones < 3);
		//Comprobar cuál es el mayor
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
		System.out.println("Número más alto:		" + numero1);
		System.out.println("Segundo número más alto: 	" + numero2);
		System.out.println("Tercer número más alto: 	" + numero3);
		sc.close();
	}

}