package Controlador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controlador {
	@FXML
	private Button btnDebug;

	@FXML
	private TextField txtNombre;

	@FXML
	private Button btnJugar;

	public static ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
	public static int idUsuario;
	public static String nombre;
	public static int contadorPregunta = 0;

	@FXML
	void goToDebug(ActionEvent event) {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vista/Debug.fxml"));
		Parent root1;
		try {
			root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root1));
			stage.setTitle("Debug Settings");
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void goToPregunta(ActionEvent event) {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vista/Pregunta.fxml"));
		Parent root;
		Stage stage1 = (Stage) btnJugar.getScene().getWindow();
		nombre = txtNombre.getText();
		Controlador.idUsuario = execAddUser(nombre);
		stage1.close();

		try {
			contadorPregunta++;
			root = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.setTitle("Pregunta " + contadorPregunta);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int execAddUser(String nombre) {
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		String sql;
		int idUsuario = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/hoja9", "root", "");
			sentenciaSQL = conexion.createStatement();
			sql = "INSERT INTO `usuarios` (`nombre`, `enfado`, `alegre`, `seguro`, `preocupado`, `tranquilo`, `deprimido`) "
					+ "VALUES ('" + nombre + "', '0', '0', '0', '0', '0', '0')";
			sentenciaSQL.executeUpdate(sql);

			sql = "SELECT * FROM usuarios ORDER BY ID DESC LIMIT 1";
			rs = Conexion.execSQL("localhost", "hoja9", "root", "", sql, false);
			while (rs.next()) {
				idUsuario = rs.getInt("id");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return idUsuario;

	}

}