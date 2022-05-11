package Controlador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Debug {

	@FXML
	private TextField txtSentencia;

	@FXML
	private TextArea areaShow;

	@FXML
	private Button btnExecSentencia;

	@FXML
	private TextField txtNombreArchivo;

	@FXML
	private Button btnLeerFichero;

	public TextArea getAreaShow() {
		return areaShow;
	}

	public void setAreaShow(TextArea areaShow) {
		this.areaShow = areaShow;
	}

	@FXML
	void execSentencia(ActionEvent event) {
		ResultSet rs = null;
		try {
			rs = Conexion.execSQL("localhost", "hoja9", "root", "", txtSentencia.getText(), false);
			while (rs.next()) {
				System.out.println(rs.getString("")); // or rs.getString("column name");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@FXML
	void leerFicheroInsertPregunta(ActionEvent event) throws ClassNotFoundException, SQLException {

		Connection conexion = null;
		Statement sentenciaSQL = null;
		String sql = "";

		String cadena = "";
		FileReader fichero = null;
		BufferedReader lector = null;
		try {

			fichero = new FileReader("src/data/" + txtNombreArchivo.getText() + ".txt");
			lector = new BufferedReader(fichero);
			while (cadena != null) {
				try {
					cadena = lector.readLine();
					Class.forName("com.mysql.cj.jdbc.Driver");
					conexion = DriverManager.getConnection("jdbc:mysql://localhost/hoja9", "root", "");
					sentenciaSQL = conexion.createStatement();
					sql = "INSERT INTO `preguntas` (`id`, `texto`, `mood`, `variacion`) VALUES (NULL, '" + cadena
							+ "', NULL, NULL);";
					sentenciaSQL.executeUpdate(sql);
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero");
		} catch (IOException e) {
			System.out.println("Hay un problema de lectura");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				sentenciaSQL.close();
				conexion.close();
				lector.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

			

		}

	}

	private ResultSet execListPreguntas() {
		ResultSet rs = null;
		try {
			rs = Conexion.execSQL("localhost", "hoja9", "root", "", "SELECT * FROM `preguntas`", false);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	@FXML
	void listPreguntas(ActionEvent event) {
		ResultSet rs = execListPreguntas();
		try {
			areaShow.clear();
			while (rs.next()) {
				areaShow.appendText("Pregunta: " + rs.getString("texto") + "\n");
				areaShow.appendText(
						"Mood: " + rs.getInt("mood") + "\n" + "variación: " + rs.getInt("variacion") + "\n\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private ResultSet execListCarlos() {
		ResultSet rs = null;
		try {
			rs = Conexion.execSQL("localhost", "hoja9", "root", "", "SELECT * FROM `Carlos`", false);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	@FXML
	void listCarlos(ActionEvent event) {
		ResultSet rs = execListCarlos();
		try {
			areaShow.clear();
			while (rs.next()) {
				areaShow.appendText("Nombre: " + rs.getString("nombre") + "\n");
				areaShow.appendText(
						"Link img: " + rs.getString("img_link") + "\n" + "Texto: " + rs.getString("texto") + "\n\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
