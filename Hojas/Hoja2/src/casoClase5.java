import java.util.Scanner;

public class casoClase5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fecha;
		String dia;
		String mes;
		String ano;
		//String numeros = "0123456789";
		
		System.out.println("Introduce una fecha en formato dd/mm/aaaa");
		fecha = sc.nextLine();
		
		if (fecha.length() == 10) {
			dia = fecha.substring(0,2);
			mes = fecha.substring(3,5);
			ano = fecha.substring(6);
			
			if (fecha.charAt(2) == '/' && fecha.charAt(5) == '/') {
				System.out.println("Debug: Fecha v�lida //");
				
				
				
			} else {
				System.out.println("Debug: " + (fecha.charAt(2) == '/'));
				System.out.println("Debug: " + (fecha.charAt(5) == '/'));
				System.out.println("Debug: Fecha no v�lida");
			}
			
			System.out.println("Debug: " + dia + mes + ano);
			
		}
		
		
		
		
		sc.close();
	}
}