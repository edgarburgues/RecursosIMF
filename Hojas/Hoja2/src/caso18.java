import java.util.Scanner;

public class caso18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float sumaNotas = 0f;
		float notaMasAlta = 0f;
		float notaMasBaja = 10f;
		float divisionMediaTest = 30f;
		float notaIndividual;

		for (int i = 1; i <= divisionMediaTest; i++) {
			do {
				System.out.print("Introduce la nota: ");
				notaIndividual = sc.nextFloat();
			} while (notaIndividual < 0 || notaIndividual > 10);

			sumaNotas = sumaNotas + notaIndividual;
			System.out.println("Contador: " + i);
			System.out.println(sumaNotas);

			if (notaIndividual > notaMasAlta) {
				notaMasAlta = notaIndividual;
			}
			if (notaIndividual < notaMasBaja) {
				notaMasBaja = notaIndividual;
			}
		}
		sumaNotas = sumaNotas / divisionMediaTest;
		System.out.println("La nota media es: " + sumaNotas);
		System.out.println("La nota m�s alta es : " + notaMasAlta);
		System.out.println("La nota m�s baja es : " + notaMasBaja);
		sc.close();
	}

}
