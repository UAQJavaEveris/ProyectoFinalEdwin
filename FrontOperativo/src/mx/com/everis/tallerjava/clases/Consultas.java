package mx.com.everis.tallerjava.clases;


import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.xml.rpc.ServiceException;

import mx.com.everis.tallerjava.services.*;
public class Consultas {
	
	public static void createPersonaje(String nombre, String fechaNacimiento,
			String descripcion){
		CRUDServiceLocator serviceLocator = new CRUDServiceLocator();
		try {
			CRUD ws = serviceLocator.getCRUDPort();
			ws.createPersonaje(nombre, fechaNacimiento, descripcion);
			
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public static Personaje[] readPersonaje(int idPersonaje){
		CRUDServiceLocator serviceLocator = new CRUDServiceLocator();
		try {
			
			CRUD ws = serviceLocator.getCRUDPort();
			Personaje[] personajes = ws.readPersonajes(idPersonaje);
			
			return personajes;
			
		} catch (ServiceException e) {
			e.printStackTrace();
			return null;
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}		
		
	}
	
	public static void updatePersonaje(int id, String nombre, String fechaNacimiento,
										String descripcion){
		CRUDServiceLocator serviceLocator = new CRUDServiceLocator();
		try {
			
			CRUD ws = serviceLocator.getCRUDPort();
			ws.updatePersonaje(id, nombre, fechaNacimiento, descripcion);
			
			
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}	
	}
	
	public static void deletePersonaje(int id){
		CRUDServiceLocator serviceLocator = new CRUDServiceLocator();
		try {
			
			CRUD ws = serviceLocator.getCRUDPort();
			ws.deletePersonaje(id);
			
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}	
		
	}

}
