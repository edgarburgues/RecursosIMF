package application;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controlador {
	@FXML
	private TextField txtNombrePocion;

	@FXML
	private Button btnAdd;

	@FXML
	private Button btnListar;

	@FXML
	private TextArea areaShow;

	@FXML
	private Button btnBuscar;

	private static ArrayList<Pocion> listaPociones = new ArrayList<Pocion>();

	public static ArrayList<Pocion> getListaPociones() {
		return listaPociones;
	}

	public void setListaPociones(ArrayList<Pocion> listaPociones) {
		Controlador.listaPociones = listaPociones;
	}

	public void initialize() {
		areaShow.setEditable(false);

	}

	@FXML
	void goToAddPocion(ActionEvent event) {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/addPocion.fxml"));
		Parent root1;
		try {
			root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root1));
			stage.setTitle("Gestionar pociones");
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	void buscarPocion(ActionEvent event) {
		String nombrePocion = txtNombrePocion.getText();
		areaShow.clear();
		for (int i = 0; i < listaPociones.size(); i++) {
			if (listaPociones.get(i).getNombre().contains(nombrePocion)) {
				mostrarPociones(i);
			}
		}

	}

	@FXML
	void listarPociones(ActionEvent event) {
		if (listaPociones.size() == 0) {
			mostrarAlertInfo(event, "La lista está vacía");
		} else {
			areaShow.clear();
			for (int i = 0; i < listaPociones.size(); i++) {
				mostrarPociones(i);
			}
		}

	}

	private void mostrarPociones(int i) {
		areaShow.appendText("Nombre: " + listaPociones.get(i).getNombre() + "\n" + "Nivel: "
				+ listaPociones.get(i).getNivel() + "\n" + "-----------------------" + "\n");

	}

	public void mostrarAlertInfo(ActionEvent event, String texto) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setHeaderText(null);
		alert.setTitle("Alerta!!");
		alert.setContentText(texto);
		alert.showAndWait();
	}
}
