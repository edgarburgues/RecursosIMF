package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControladorAddPocion {

	@FXML
	private TextField txtNivel;

	@FXML
	private TextField txtNombre;

	@FXML
	private Button btnAddPocion;

	@FXML
	void addPotion(ActionEvent event) {
		
		if (txtNombre.getText().equals("") || txtNivel.getText().equals("") || !Validaciones.validarNumero(txtNivel.getText())) {
			mostrarAlertInfo(event, "Rellena todos los campos correctamente");
		} else {
			Controlador.getListaPociones().add(new Pocion(txtNombre.getText(), Integer.parseInt(txtNivel.getText())));
		}
	}

	private void mostrarAlertInfo(ActionEvent event, String texto) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setHeaderText(null);
		alert.setTitle("Alerta!!");
		alert.setContentText(texto);
		alert.showAndWait();
	}

}
