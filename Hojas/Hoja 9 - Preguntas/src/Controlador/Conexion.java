package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

	public static boolean checkConnection(String host, String user, String pass) {
		Connection conexion = null;
		boolean exito = true;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://" + host, user, pass);
		} catch (SQLException e) {
			exito = false;
			System.out.println("No hay conexión con la BBDD o lógin erroneo");
		} catch (Exception e) {
			System.out.println("Error conexión");
			exito = false;
			e.printStackTrace();
		} finally {
			try {
				conexion.close();
			} catch (Exception e2) {
				exito = false;
			}
		}
		return exito;
	}

	public static ResultSet execSQL(String host, String DDBB, String user, String pass, String sentencia,
			boolean closeConection) throws ClassNotFoundException, SQLException {
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/" + DDBB, "root", "");
			sentenciaSQL = conexion.createStatement();
			rs = sentenciaSQL.executeQuery(sentencia);
		} catch (SQLException ex) {
			ex.printStackTrace();

		} finally {
			if (closeConection) {
				conexion.close();
			}
		}
		return rs;

	}

	public static void updateSQL(String host, String DDBB, String user, String pass, String sentencia,
			boolean closeConection) throws ClassNotFoundException, SQLException {
		Connection conexion = null;
		Statement sentenciaSQL;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/" + DDBB, "root", "");
			sentenciaSQL = conexion.createStatement();
			sentenciaSQL.executeUpdate(sentencia);
			
		} catch (SQLException ex) {
			ex.printStackTrace();

		} finally {
			if (closeConection) {
				conexion.close();
			}
		}

	}
 
}
