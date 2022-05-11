package Controlador;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

public class Validaciones {
	
	public static void mostrarAlertInfo(ActionEvent event, String texto) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setHeaderText(null);
		alert.setTitle("Alerta!!");
		alert.setContentText(texto);
		alert.showAndWait();
	}

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
