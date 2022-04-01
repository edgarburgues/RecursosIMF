import java.util.Scanner;

public class caso3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int diaInt;
		String dia;
		String mes;
		String ano;

		System.out.print("Introduce tu día de nacimiento: ");
		dia = scanner.nextLine();
		diaInt = Integer.parseInt(dia);
		System.out.print("Introduce tu mes de nacimiento: ");
		mes = scanner.nextLine();
		System.out.print("Introduce tu año de nacimiento: ");
		ano = scanner.nextLine();
		System.out.println("------------------------------------------------");
// Primer caso
		System.out.println(dia + "/" + mes + "/" + ano);
// segundo caso
		switch (mes) {
		case "01":
			mes = "enero";
			break;
		case "02":
			mes = "febrero";
			break;
		case "03":
			mes = "marzo";
			break;
		case "04":
			mes = "abril";
			break;
		case "05":
			mes = "mayo";
			break;
		case "06":
			mes = "junio";
			break;
		case "07":
			mes = "julio";
			break;
		case "08":
			mes = "agosto";
			break;
		case "09":
			mes = "septiembre";
			break;
		case "10":
			mes = "octubre";
			break;
		case "11":
			mes = "noviembre";
			break;
		case "12":
			mes = "diciembre";
			break;
		default:
			mes = "unknown";
			break;
		}

		System.out.println(dia + " de " + mes + " de " + ano);
// tercer caso
// ----------------------------------------------------------------	
		System.out.print(ano + ", " + mes + " - ");
		switch (dia) {
		case "11":
			System.out.println("once");
			break;
		case "12":
			System.out.println("doce");
			break;
		case "13":
			System.out.println("trece");
			break;
		case "14":
			System.out.println("catorce");
			break;
		case "15":
			System.out.println("quince");
			break;
		default:
			if (diaInt >= 16 || diaInt == 10) {
				switch (dia.charAt(0)) {
				case '1':
					if (dia.charAt(1) == '0') {
						System.out.print("diez");
					} else {
						System.out.print("dieci");
					}
					break;
				case '2':
					if (dia.charAt(1) == '0') {
						System.out.print("veinte");
					} else {
						System.out.print("veinti");
					}
					break;
				case '3':
					if (dia.charAt(1) == '0') {
						System.out.print("treinta");
					} else {
						System.out.print("treinta y ");
					}
				}
			}
			switch (dia.charAt(1)) {
			case '1':
				System.out.print("uno");
				break;
			case '2':
				System.out.print("dos");
				break;
			case '3':
				System.out.print("tres");
				break;
			case '4':
				System.out.print("cuatro");
				break;
			case '5':
				System.out.print("cinco");
				break;
			case '6':
				System.out.print("seis");
				break;
			case '7':
				System.out.print("siete");
				break;
			case '8':
				System.out.print("ocho");
				break;
			case '9':
				System.out.print("nueve");
				break;

			}

		}

// ----------------------------------------------------------------	
		scanner.close();
	}

}
