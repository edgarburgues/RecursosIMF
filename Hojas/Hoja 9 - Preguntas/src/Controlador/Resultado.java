package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Resultado {

	@FXML
	private Label nombreCarlos;
	@FXML
	private TextArea areaTexto;
	@FXML
	private ImageView imgCarlos;
	@FXML
	private AnchorPane pane;

	public void initialize() {
		getCarlos();
	}

	public void getCarlos() {
		String nombre = "";
		String imgSrc = "";
		String texto = "";
		Image img = null;

		int idCarlos = 2;
		ResultSet rs = null;
		String sql = "select * from carlos where id=" + idCarlos;
		try {
			rs = Conexion.execSQL("localhost", "hoja9", "root", "", sql, false);
			if (rs.next()) {
				nombre = rs.getString("nombre");
				imgSrc =rs.getString("img_link");
				texto = rs.getString("texto");
			}

			nombreCarlos.setText(nombre);
			areaTexto.setText(texto);
			// No conseguimos poner la imagen de ninguna forma
			//img = new Image(getClass().getResourceAsStream("/src/data.img/" + imgSrc));
			//imgCarlos = new ImageView(img);
			

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
