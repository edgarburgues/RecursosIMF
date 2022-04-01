

public class casoClase6 {

	public static void main(String[] args) {
		// Validar DNI

		String dni = "012e45678-Z";
		String numeros = "0123456789";
		String letras = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		byte validacionSuma = 0;

		if (dni.length() == 11 && dni.charAt(9) == '-') {
			System.out.println("Debug: Longitud correcta y puntuaci�n correcta");
			for (int i = 0; i < dni.length() - 2; i++) {
				if (numeros.indexOf(dni.charAt(i)) > -1 && letras.indexOf(dni.charAt(10)) > -1) {
					// System.out.println("DNI v�lido");
					validacionSuma++;
				}
			}
			if (validacionSuma == 9) {
				System.out.println("DNI v�lido");
			} 
		} else {
			System.out.println("DNI no v�lido");
		}

	}

}
