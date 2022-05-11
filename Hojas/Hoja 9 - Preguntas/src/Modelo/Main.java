package Modelo;

import java.util.Collections;

import Controlador.Conexion;
import Controlador.Controlador;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	public void start(Stage primaryStage) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/Vista/inicio.fxml"));
			primaryStage.setTitle("Hoja9");
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		boolean exito = Conexion.checkConnection("localhost", "root","");
		
		if (exito) {
			for (int i = 1; i <= 136; i++) {
				 Controlador.listaNumeros.add(i);
			}
			Collections.shuffle(Controlador.listaNumeros);
			launch(args);
		} else {
			System.out.println("error en la conexión");
		}
	}
}
