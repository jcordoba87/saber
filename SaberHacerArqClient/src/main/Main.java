package main;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import co.edu.uan.servicio.UsuarioServicioImpl;
import co.edu.uan.servicio.UsuarioServicioImplProxy;
import co.edu.uan.servicio.UsuarioServicioImplServiceLocator;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
	
		UsuarioServicioImplProxy pro = new 	UsuarioServicioImplProxy();
		String nombre = pro.obtenerUsuario(1L).getNombre();
		System. out .println(nombre);
				
		
	}

}
