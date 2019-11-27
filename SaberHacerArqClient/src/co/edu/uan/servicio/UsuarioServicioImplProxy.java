package co.edu.uan.servicio;

public class UsuarioServicioImplProxy implements co.edu.uan.servicio.UsuarioServicioImpl {
  private String _endpoint = null;
  private co.edu.uan.servicio.UsuarioServicioImpl usuarioServicioImpl = null;
  
  public UsuarioServicioImplProxy() {
    _initUsuarioServicioImplProxy();
  }
  
  public UsuarioServicioImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initUsuarioServicioImplProxy();
  }
  
  private void _initUsuarioServicioImplProxy() {
    try {
      usuarioServicioImpl = (new co.edu.uan.servicio.UsuarioServicioImplServiceLocator()).getUsuarioServicioImpl();
      if (usuarioServicioImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)usuarioServicioImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)usuarioServicioImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (usuarioServicioImpl != null)
      ((javax.xml.rpc.Stub)usuarioServicioImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public co.edu.uan.servicio.UsuarioServicioImpl getUsuarioServicioImpl() {
    if (usuarioServicioImpl == null)
      _initUsuarioServicioImplProxy();
    return usuarioServicioImpl;
  }
  
  public boolean agregarUsuario(co.edu.uan.usuarios.modelo.Usuario user) throws java.rmi.RemoteException{
    if (usuarioServicioImpl == null)
      _initUsuarioServicioImplProxy();
    return usuarioServicioImpl.agregarUsuario(user);
  }
  
  public boolean borrarUsuario(long id) throws java.rmi.RemoteException{
    if (usuarioServicioImpl == null)
      _initUsuarioServicioImplProxy();
    return usuarioServicioImpl.borrarUsuario(id);
  }
  
  public co.edu.uan.usuarios.modelo.Usuario obtenerUsuario(long id) throws java.rmi.RemoteException{
    if (usuarioServicioImpl == null)
      _initUsuarioServicioImplProxy();
    return usuarioServicioImpl.obtenerUsuario(id);
  }
  
  
}