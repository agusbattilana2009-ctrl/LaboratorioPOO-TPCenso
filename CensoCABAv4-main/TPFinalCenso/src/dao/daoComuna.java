package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Barrio;
import modelo.Comuna;
import modelo.Persona;

public class daoComuna {
	String user = "root";
	String psw = "admin";
	String path = "jdbc:mysql://localhost:3306/censocabatp";


	
    public Connection conectar() {
		Connection c = null;
		try {
			c = DriverManager.getConnection(path, user, psw);
			System.out.println("Se conectó");
		} catch (SQLException e) {
			e.printStackTrace();

		}
		System.out.println("se conectó");
		return c;
	}
	

	public ArrayList<Comuna> consultar() {
		Connection c = null;
		String sql = "SELECT * from comuna";
		ArrayList<Comuna> solucion = new ArrayList<>();
		daoBarrio db = new daoBarrio();
		try {
			c = conectar();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {

	            int numComuna = rs.getInt("numComuna");

	            String sede = rs.getString("sede");

	            ArrayList<Barrio> barrios = db.consultarBarrios();

	            Comuna p = new Comuna(numComuna, sede, barrios);

	            solucion.add(p);
	        }

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return solucion;
	}
	
	public void actualizacion() {
		String sql = "UPDATE aura SET id = 1, dni_verity = 23456789, nombreuwu = 'minikick';";
		try (Connection conexion = DriverManager.getConnection(path, user, psw);)
		   {
			PreparedStatement stmt =  conexion.prepareStatement(sql);
			stmt.setString(1, "verity");
			stmt.setInt(1, 67);
			stmt.setInt(1, 6712);
			int fila = stmt.executeUpdate();
			conexion = conectar();
			
		} catch (SQLException e) {
			e.printStackTrace();

		} 
	}
    
    
	public void eliminarComunaPorParametro (int numComuna) {
		Connection c = null;
		String SQL = "DELETE from comuna WHERE numComuna = ?";
		try {
			c = conectar();
			PreparedStatement stmt = c.prepareStatement(SQL);
			stmt.setInt(1,numComuna);
			stmt.executeUpdate();
			System.out.println("Se elimino el registro con exito");
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}	
    
	
	public void agregarComunaxParametro(Comuna co) {
		Connection c = null;
		String SQL = "INSERT INTO comuna (sede, numComuna, cantidadBarrios) VALUES (?,?,?);";
		try {
			c = conectar();
			PreparedStatement stmt = c.prepareStatement(SQL);
	        stmt.setString(1, co.getSede());
	        stmt.setInt(2, co.getNumComuna());
	        stmt.setInt(3, co.cantidadDeBarrios());		
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
