/**
 * CRUD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.everis.tallerjava.services;

public interface CRUD extends java.rmi.Remote {
    public mx.com.everis.tallerjava.services.Personaje[] readPersonajes(int arg0) throws java.rmi.RemoteException;
    public void updatePersonaje(int arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException;
    public void createPersonaje(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public void deletePersonaje(int arg0) throws java.rmi.RemoteException;
}
