import java.util.Scanner;

public class caso5 {

	public static void main(String[] args) {
		float valueA;
		float valueB;
		Scanner scanner = new Scanner(System.in);
		
		//Dibujo de la regla de 3
		System.out.println("A -----> 100%\t A -----> 100%");
		System.out.println("B -----> X1\tX2 -----> B");
		
		System.out.print("Introduce el valor de A: ");
		valueA = scanner.nextFloat();
		System.out.print("Introduce el valor de B: ");
		valueB = scanner.nextFloat();
		// Lógica
		System.out.println("X1 = " + (valueB * 100 / valueA));
		System.out.println("X2 = " + (valueA * valueB / 100));



		scanner.close();
	}

}
