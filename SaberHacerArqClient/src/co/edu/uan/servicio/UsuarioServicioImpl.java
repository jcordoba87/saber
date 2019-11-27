/**
 * UsuarioServicioImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.edu.uan.servicio;

public interface UsuarioServicioImpl extends java.rmi.Remote {
    public boolean agregarUsuario(co.edu.uan.usuarios.modelo.Usuario user) throws java.rmi.RemoteException;
    public boolean borrarUsuario(long id) throws java.rmi.RemoteException;
    public co.edu.uan.usuarios.modelo.Usuario obtenerUsuario(long id) throws java.rmi.RemoteException;
}
