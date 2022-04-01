
public class caso1 {

	public static void main(String[] args) {
		// Validar un email

		String email = "abcde@fg@rstuvw.xy/z";
		String domain = email.substring(email.indexOf("@") + 1);
		String subdomain = domain.substring(domain.indexOf(".") + 1);
		String numero = "1234567890";
		String especiales = ".,-_?!��$%&/";
		boolean valido = true;
		boolean checkSub = false;

		System.out.println(email);
		// No logro entender por qu� si la primera sentencia antes del && me sale false y a�n as� entra en el if. Llevo
		//Toda dos d�as d�ndole vueltas y no encuentro la forma
		System.out.println(email.indexOf("@"));
		System.out.println(email.lastIndexOf("@"));
		System.out.println(email.lastIndexOf('@') == email.indexOf('@'));

		if (email.length() >= 10) {
			if ((email.lastIndexOf('@') == email.indexOf('@')) && email.indexOf('@') != -1) {
				if (domain.lastIndexOf(".") != -1) {
					if (numero.indexOf(email.charAt(0)) < 0 && especiales.indexOf(email.charAt(0)) < 0
							&& especiales.indexOf(email.charAt(email.indexOf("@") - 1)) < 0) {
						for (int i = 0; i < subdomain.length(); i++) {
							if (especiales.indexOf(subdomain.charAt(i)) != -1 && !checkSub) {
								checkSub = true;
							}

						}
					}
				} else {
					checkSub = true;
				}
			}
		}
		if (checkSub) {
			valido = false;
		}
		if (valido) {
			System.out.println("Es v�lido");
		} else {
			System.out.println("No es v�lido");
		}
	}

}
