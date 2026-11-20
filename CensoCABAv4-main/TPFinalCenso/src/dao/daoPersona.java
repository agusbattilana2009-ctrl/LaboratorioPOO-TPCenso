package dao;
import modelo.Barrio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.BarrioComplHab;
import modelo.BarrioTrazForm;
import modelo.BarrioUrbPlanif;
import modelo.Persona;
public class daoPersona {
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
    
    
	
	public void agregarPersonaxParametro(Persona p) {
		Connection c = null;
		String SQL = "INSERT INTO personas (dni, nombreCompleto, situacionLaboral, fechaNacimiento, Barrio_nombre) VALUES (?,?,?,?,?);";
		try {
			c = conectar();
			PreparedStatement stmt = c.prepareStatement(SQL);
	        stmt.setString(1, p.getDNI());
	        stmt.setString(2, p.getnombreCompleto());
	        stmt.setString(3, p.getsituacionLab().name());
	        stmt.setDate(4, java.sql.Date.valueOf(p.getFechaDeNacimiento()));
	        stmt.setString(5, p.getBarrio().getNombreBarrio());			
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
	
	
	
	public void eliminarPersonaPorParametro (String dni) {
		Connection c = null;
		String SQL = "DELETE from comuna WHERE dni = ?";
		try {
			c = conectar();
			PreparedStatement stmt = c.prepareStatement(SQL);
			stmt.setString(1, dni);
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
