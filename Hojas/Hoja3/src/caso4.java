import java.util.Scanner;

public class caso4 {

	public static void main(String[] args) {
		// Extensión del caso 3
		Scanner scanner = new Scanner(System.in);
		int diaInt;
		int mesInt;
		int anoInt;
		int diaAhora;
		int mesAhora;
		int anoAhora;
		int edad;

		String dia;
		String mes;
		String ano;

		System.out.print("Introduce tu día de nacimiento: ");
		dia = scanner.nextLine();
		diaInt = Integer.parseInt(dia);
		System.out.print("Introduce tu mes de nacimiento: ");
		mes = scanner.nextLine();
		mesInt = Integer.parseInt(mes);
		System.out.print("Introduce tu año de nacimiento: ");
		ano = scanner.nextLine();
		anoInt = Integer.parseInt(ano);
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
		// tercar caso
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
						System.out.println("diez");
					} else {
						System.out.print("dieci");
					}
					break;
				case '2':
					if (dia.charAt(1) == '0') {
						System.out.println("veinte");
					} else {
						System.out.print("veinti");
					}
					break;
				case '3':
					if (dia.charAt(1) == '0') {
						System.out.println("treinta");
					} else {
						System.out.print("treinta y ");
					}
				}
			}
			switch (dia.charAt(1)) {
			case '1':
				System.out.println("uno");
				break;
			case '2':
				System.out.println("dos");
				break;
			case '3':
				System.out.println("tres");
				break;
			case '4':
				System.out.println("cuatro");
				break;
			case '5':
				System.out.println("cinco");
				break;
			case '6':
				System.out.println("seis");
				break;
			case '7':
				System.out.println("siete");
				break;
			case '8':
				System.out.println("ocho");
				break;
			case '9':
				System.out.println("nueve");
				break;

			}

		}

// ----------------------------------------------------------------
// Nuevo contenido
// Se han añadido algunas variables extra
// ----------------------------------------------------------------
		System.out.print("Qué día es hoy?: ");
		diaAhora = scanner.nextInt();
		System.out.print("Qué mes es?: ");
		mesAhora = scanner.nextInt();
		System.out.print("Qué año es?: ");
		anoAhora = scanner.nextInt();

		edad = anoAhora - anoInt;
		if ((mesAhora - mesInt) < 0) {
			edad--;
		} else {
			if (diaAhora - diaInt < 0) {
				edad--;
			}
		}

		System.out.println("Tienes " + edad + " años");

		scanner.close();
	}
}
