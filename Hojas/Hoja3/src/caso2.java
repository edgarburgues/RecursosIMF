import java.util.Scanner;

public class caso2 {

	public static void main(String[] args) {
		//Elegir frutas y cantidad y e ir sumando
		Scanner scanner = new Scanner(System.in);
		String fruta;
		String peso = " ";
		float sumaTotal = 0f;

		
		do {
			System.out.println("\t\t" + "250g\t" + "500g\t" + "1Kg");
			System.out.println("1. Manzanas\t1,5\t3\t5,8");
			System.out.println("2. Mandarinas \t2\t4\t7,2");
			System.out.println("3. Naranjas\t2,7\t5\t9,1");
			System.out.println("4. Finalizar");

			System.out.print("Elige una fruta: ");
			fruta = scanner.nextLine().toUpperCase();
			if (!fruta.equals("FINALIZAR")) {
				System.out.print("Elige el peso: ");
				peso = scanner.nextLine().toUpperCase();
			}
			switch (fruta) {
			case "MANZANAS":
				switch (peso) {
				case "250G":
					sumaTotal += 1.5f;
					break;
				case "500G":
					sumaTotal += 3f;
					break;
				case "1KG":
					sumaTotal += 5.8f;
					break;
				}
				break;
			case "MANDARINAS":
				switch (peso) {
				case "250G":
					sumaTotal += 2f;
					break;
				case "500G":
					sumaTotal += 4f;
					break;
				case "1KG":
					sumaTotal += 7.2f;
					break;
				}
				break;
			case "NARANJAS":
				switch (peso) {
				case "250G":
					sumaTotal += 2.7f;
					break;
				case "500G":
					sumaTotal += 5f;
					break;
				case "1KG":
					sumaTotal += 9.1f;
					break;
				}
				break;
			case "FINALIZAR":
				System.out.println("Calculando el resultado...");
				break;
			default:
				System.out.println("Fruta no reconocida");
				fruta = "vacio";
				break;
			}
			System.out.println(sumaTotal + "�");
		} while (!fruta.equals("FINALIZAR"));
		scanner.close();
		System.out.println("A pagar final: " + sumaTotal + "�");
	}
}
