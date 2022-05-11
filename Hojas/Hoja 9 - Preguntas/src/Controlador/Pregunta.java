package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class Pregunta {
	private int numeroPreguntas = 10;
	public int idPregunta;
	public int moodPregunta;

	@FXML
	private RadioButton radio5;
	@FXML
	private TextArea areaPregunta;
	@FXML
	private RadioButton radio1;
	@FXML
	private RadioButton radio2;
	@FXML
	private RadioButton radio3;
	@FXML
	private RadioButton radio4;
	@FXML
	private ToggleGroup respuesta;
	@FXML
	private Label etiText;
	@FXML
	private Button btnSiguiente;

	public TextArea getAreaPregunta() {
		return areaPregunta;
	}

	public void setAreaPregunta(TextArea areaPregunta) {
		this.areaPregunta = areaPregunta;
	}

	public Label getEtiText() {
		return etiText;
	}

	public void setEtiText(Label etiText) {
		this.etiText = etiText;
	}

	public void initialize() {
		areaPregunta.setEditable(false);
		getPregunta();
	}

	@FXML
	public void goToPregunta(ActionEvent event) {
		FXMLLoader fxmlLoader;
		Parent root;
		Stage stage1 = (Stage) btnSiguiente.getScene().getWindow();
		stage1.close();

		changeValue();

		try {
			if (Controlador.contadorPregunta < numeroPreguntas) {
				fxmlLoader = new FXMLLoader(getClass().getResource("/Vista/Pregunta.fxml"));

				Controlador.contadorPregunta++;

				root = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setScene(new Scene(root));
				stage.setTitle("Pregunta " + Controlador.contadorPregunta);
				stage.show();

			} else {
				fxmlLoader = new FXMLLoader(getClass().getResource("/Vista/resultado.fxml"));

				root = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setScene(new Scene(root));
				stage.setTitle("Resultado");
				stage.show();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private int radioSelect() {
		int valor = 0;
		if (radio1.isSelected()) {
			valor = -2;
		} else if (radio2.isSelected()) {
			valor = -1;
		} else if (radio4.isSelected()) {
			valor = 1;
		} else if (radio5.isSelected()) {
			valor = 2;
		}
		return valor;
	}

	private void changeValue() {
		int idUsuario = Controlador.idUsuario;
		String[] moods = { "", "enfado", "alegre", "seguro", "preocupado", "tranquilo", "deprimido" };
		String sql = "select " + moods[moodPregunta] + " from usuarios where id=" + idUsuario;
		String sqlUpdate = "";
		ResultSet rs = null;
		int numeroMood;
		int variación = radioSelect();

		try {
			rs = Conexion.execSQL("localhost", "hoja9", "root", "", sql, false);
			if (rs.next()) {
				numeroMood = rs.getInt(moods[moodPregunta]);
				sqlUpdate = "UPDATE `usuarios` SET `" + moods[moodPregunta] + "`='" + (numeroMood + variación)
						+ "' WHERE id=" + idUsuario;
				Conexion.updateSQL("localhost", "hoja9", "root", "", sqlUpdate, false);
			} else {
				System.out.println("Algo falla con el RS");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void getPregunta() {

		ResultSet rs = null;
		areaPregunta.clear();
		etiText.setText("Pregunta " + Controlador.contadorPregunta);
		try {
			rs = Conexion.execSQL("localhost", "hoja9", "root", "",
					"SELECT * FROM `preguntas` where id=" + Controlador.listaNumeros.get(0), false);
			if (rs.next()) {
				idPregunta = rs.getInt("id");
				moodPregunta = rs.getInt("mood");
				areaPregunta.appendText(rs.getString("texto"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Controlador.listaNumeros.remove(0);
	}

}
