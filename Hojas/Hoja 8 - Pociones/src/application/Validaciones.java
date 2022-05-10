package application;

public class Validaciones {

	public static boolean validarNumero(String numero) {
		String numeros = "1234567890";
		boolean valido = true;
		int contador = 0;

		do {
			if (numeros.indexOf(numero.charAt(contador)) == -1) {
				valido = false;
			}
			contador++;
		} while (valido && contador < numero.length());

		return valido;
		
	}

}
