public class caso3 {

	public static void main(String[] args) {
		// Comprueba que se trata de una cuenta bancaria. Por ejemplo:
		// ES12-1223-4321-23-12348765

		String cuentaBancaria = "ES12-3456-7890-1-12345678";
		String iban = cuentaBancaria.substring(0, 4);
		String numeros = "1234567890";
		boolean checkNum = true;
		System.out.println(cuentaBancaria);

		if (cuentaBancaria.length() == 26) {
			if (cuentaBancaria.charAt(4) == '-' && cuentaBancaria.charAt(9) == '-' && cuentaBancaria.charAt(14) == '-'
					&& cuentaBancaria.charAt(17) == '-') {
				if (iban.substring(0, 2).toUpperCase().equals("ES")) {
					for (int i = 2; i < cuentaBancaria.length() - 1; i++) {
						if ((i != 4 && i != 9 && i != 14 && i != 17) || !checkNum) {
							if (numeros.indexOf(cuentaBancaria.charAt(i)) == -1) {
								checkNum = false;
							}
						}
					}
				} else {
					checkNum = false;
				}

			} else {
				checkNum = false;
			}
		} else {
			checkNum = false;
		}
		
		if (checkNum) {
			System.out.println("Es válida");
		} else {
			System.out.println("No es válida");
		}
	} 
}
