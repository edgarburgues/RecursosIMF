import java.util.Scanner;

public class caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int habitacion;

		System.out.println("1. Azul");
		System.out.println("2. Roja");
		System.out.println("3. Verde");
		System.out.println("4. Rosa");
		System.out.println("5. Gris");
		do {
			System.out.print("Elige una habitaci�n: ");
			habitacion = sc.nextInt();
		} while (habitacion < 1 || habitacion > 5);
		switch (habitacion) {
		case 1: {
			System.out.println("Camas: 2");
			System.out.println("Planta: 1");
			break;
		}
		case 2: {
			System.out.println("Camas: 1");
			System.out.println("Planta: 1");
			break;
		}
		case 3: {
			System.out.println("Camas: 3");
			System.out.println("Planta: 2");
			break;
		}
		case 4: {
			System.out.println("Camas: 2");
			System.out.println("Planta: 2");
			break;
		}
		case 5: {
			System.out.println("Camas: 1");
			System.out.println("Planta: 3");
			break;
		}
		default: {
			System.out.println("default");
		}

		}
		sc.close();
	}

}
