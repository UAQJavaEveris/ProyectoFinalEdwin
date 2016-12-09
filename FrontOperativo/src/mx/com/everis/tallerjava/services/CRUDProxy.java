package mx.com.everis.tallerjava.services;

public class CRUDProxy implements mx.com.everis.tallerjava.services.CRUD {
  private String _endpoint = null;
  private mx.com.everis.tallerjava.services.CRUD cRUD = null;
  
  public CRUDProxy() {
    _initCRUDProxy();
  }
  
  public CRUDProxy(String endpoint) {
    _endpoint = endpoint;
    _initCRUDProxy();
  }
  
  private void _initCRUDProxy() {
    try {
      cRUD = (new mx.com.everis.tallerjava.services.CRUDServiceLocator()).getCRUDPort();
      if (cRUD != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cRUD)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cRUD)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cRUD != null)
      ((javax.xml.rpc.Stub)cRUD)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mx.com.everis.tallerjava.services.CRUD getCRUD() {
    if (cRUD == null)
      _initCRUDProxy();
    return cRUD;
  }
  
  public mx.com.everis.tallerjava.services.Personaje[] readPersonajes(int arg0) throws java.rmi.RemoteException{
    if (cRUD == null)
      _initCRUDProxy();
    return cRUD.readPersonajes(arg0);
  }
  
  public void updatePersonaje(int arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException{
    if (cRUD == null)
      _initCRUDProxy();
    cRUD.updatePersonaje(arg0, arg1, arg2, arg3);
  }
  
  public void createPersonaje(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (cRUD == null)
      _initCRUDProxy();
    cRUD.createPersonaje(arg0, arg1, arg2);
  }
  
  public void deletePersonaje(int arg0) throws java.rmi.RemoteException{
    if (cRUD == null)
      _initCRUDProxy();
    cRUD.deletePersonaje(arg0);
  }
  
  
}