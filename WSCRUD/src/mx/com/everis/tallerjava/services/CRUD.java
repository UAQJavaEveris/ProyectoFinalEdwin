package mx.com.everis.tallerjava.services;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import mx.com.everis.tallerjava.clases.Personaje;

@WebService
public class CRUD{
	
	@WebMethod
	public void createPersonaje(String nombre, String fechaNacimiento, String descripcion){

		
		
		try {	//Conexion a base de datos JNDI
				InitialContext ctx = new InitialContext();
				DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/CRUDResource");
				Connection conn = ds.getConnection();	
				
				String queryInPersonaje = "INSERT INTO personaje VALUES(default, '" + nombre + "', '" 
												+ fechaNacimiento + "', '" + descripcion +"');";
	
				PreparedStatement pst = conn.prepareStatement(queryInPersonaje);	
				pst.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
		}
	
	@WebMethod
	
	public List<Personaje> readPersonajes(int idPersonaje){

		try {
			InitialContext ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/CRUDResource");
			Connection conn = ds.getConnection();
			Statement s = conn.createStatement();
			ResultSet rs;
			
			if(idPersonaje != -1){
				 rs = s.executeQuery ("SELECT * FROM personaje WHERE idPersonaje = " 
												+ idPersonaje);
			}else{
				 rs = s.executeQuery ("SELECT * FROM personaje");
			}
		    List<Personaje> listaPersonajes = new ArrayList<>();
		    
		    while(rs.next()){
		    	listaPersonajes.add(new Personaje(rs.getInt("idPersonaje"), 
		    			rs.getString("nombre"), rs.getString("fechaNacimiento"), 
		    			rs.getString("descripcion")));
		    }
		    
		    return listaPersonajes;
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	@WebMethod
	public void updatePersonaje(int idPersonaje, String nombre, 
			String fechaNacimiento, String descripcion){
		try {
			
			InitialContext ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/CRUDResource");
			Connection conn = ds.getConnection();
			Statement s = conn.createStatement();
		
			String queryUpPersonaje = "UPDATE personaje SET nombre = '" + nombre + "', fechaNacimiento = '" 
											+ fechaNacimiento + "', descripcion = '" + descripcion +"' "
													+ "WHERE idPersonaje = " + idPersonaje + ";";
			System.out.println(queryUpPersonaje);
		
			PreparedStatement pst = conn.prepareStatement(queryUpPersonaje);	
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
	}
	
	@WebMethod
	public void deletePersonaje (int idPersonaje){
		try {
			
			InitialContext ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/CRUDResource");
			Connection conn = ds.getConnection();
			Statement s = conn.createStatement();
		
			String queryDelPersonaje = "DELETE FROM personaje WHERE idPersonaje = '" + idPersonaje + "';";
			System.out.println(queryDelPersonaje);
		
			PreparedStatement pst = conn.prepareStatement(queryDelPersonaje);	
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
