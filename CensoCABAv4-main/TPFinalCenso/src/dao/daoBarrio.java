package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Barrio;
import modelo.BarrioComplHab;
import modelo.BarrioTrazForm;
import modelo.BarrioUrbPlanif;
import modelo.Persona;

public class daoBarrio {
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
	
	
	public void agregarBarrioxParametro(Barrio b) {
		Connection c = null;
		String SQL = "INSERT INTO barrio (nombreBarrio, superficie, cantEdificios, asfaltoEnCalles, numLey, tieneConformidad, cantMonoblocks, tieneConsorcio) VALUES (?,?,?,?,?,?,?,?);";
		try {
			c = conectar();
			PreparedStatement stmt = c.prepareStatement(SQL);
			stmt.setString(1, b.getNombreBarrio());
			stmt.setFloat(2, b.getSuperficie());

			if (b instanceof BarrioTrazForm) {

			    BarrioTrazForm bt = (BarrioTrazForm) b;
			    stmt.setInt(3, bt.getCantEdificios());
			    stmt.setFloat(4, bt.getAsfaltoEnCalles());
			    stmt.setNull(5, java.sql.Types.FLOAT);
			    stmt.setNull(6, java.sql.Types.BOOLEAN);
			    stmt.setNull(7, java.sql.Types.INTEGER);
			    stmt.setNull(8, java.sql.Types.BOOLEAN);
			}

			else if (b instanceof BarrioUrbPlanif) {
			    BarrioUrbPlanif bu = (BarrioUrbPlanif) b;
			    stmt.setNull(3, java.sql.Types.INTEGER);
			    stmt.setNull(4, java.sql.Types.FLOAT);
			    stmt.setFloat(5, bu.getNumLey());
			    stmt.setBoolean(6, bu.getTieneConexionFormal());
			    stmt.setNull(7, java.sql.Types.INTEGER);
			    stmt.setNull(8, java.sql.Types.BOOLEAN);
			}

			else if (b instanceof BarrioComplHab) {
			    BarrioComplHab bc = (BarrioComplHab) b;
			    stmt.setNull(3, java.sql.Types.INTEGER);
			    stmt.setNull(4, java.sql.Types.FLOAT);
			    stmt.setNull(5, java.sql.Types.FLOAT);
			    stmt.setNull(6, java.sql.Types.BOOLEAN);
			    stmt.setInt(7, bc.getCantMonoblocks());
			    stmt.setBoolean(8, bc.getTieneConsorcio());
			}
	}
		catch (SQLException e) {
		e.printStackTrace();

	} finally {
		try {
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	}
	
	public ArrayList<Barrio> consultarBarrios() {
		Connection c = null;
		String sql = "SELECT * from barrio WHERE `numcomuna` = ?\"";
		ArrayList<Barrio> solucion = new ArrayList<>();
		try {
			c = conectar();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {

			    String nombre = rs.getString("nombreBarrio");
			    float superficie = rs.getFloat("superficie");
			    String tipoBarrio = rs.getString("tipodebarrio");

			    Barrio p = null;

			    if (tipoBarrio.equals("Trazado Formal")) {

			        BarrioTrazForm b = new BarrioTrazForm();

			        b.setNombreBarrio(nombre);
			        b.setSuperficie(superficie);
			        b.setCantEdificios(rs.getInt("cantEdificios"));
			        b.setAsfaltoEnCalles(rs.getFloat("asfaltoEnCalles"));

			        p = b;
			    }

			    if (tipoBarrio.equals("Complejo Habitacional")) {

			        BarrioComplHab b = new BarrioComplHab();

			        b.setNombreBarrio(nombre);
			        b.setSuperficie(superficie);
			        b.setCantMonoblocks(rs.getInt("cantMonoblocks"));
			        b.setTieneConsorcio(rs.getBoolean("tieneConsorcio"));

			        p = b;
			    }

			    if (tipoBarrio.equals("Urbanizacion Planificada")) {

			        BarrioUrbPlanif b = new BarrioUrbPlanif();

			        b.setNombreBarrio(nombre);
			        b.setSuperficie(superficie);
			        b.setTieneConexionFormal(rs.getBoolean("tieneConexionFormal"));
			        b.setNumLey(rs.getFloat("numLey"));

			        p = b;
			    }

			    if (p != null) {
			        solucion.add(p);
			    }
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
	
	public void eliminarBarrioPorParametro (String nombreBarrio) {
		Connection c = null;
		String SQL = "DELETE from comuna WHERE nombre = ?";
		try {
			c = conectar();
			PreparedStatement stmt = c.prepareStatement(SQL);
			stmt.setString(1, nombreBarrio);
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
    
	
	
}
