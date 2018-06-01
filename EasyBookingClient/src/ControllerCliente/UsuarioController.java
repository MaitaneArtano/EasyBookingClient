package ControllerCliente;

import java.rmi.RemoteException;

import RemoteCliente.ServiceLocator;



public class UsuarioController
{
	public ServiceLocator serviceLocator;
	
	public UsuarioController(ServiceLocator serviceLocator)
	{
		this.serviceLocator = serviceLocator;
	}
	
	public boolean login(String email, String password)
	{
		
		
		boolean resultado=false;
		try {
			resultado = serviceLocator.getService().login(email,password);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}
	
	

	public boolean signin(String email, String password)
	{
		try {
			return this.serviceLocator.getService().signin(email, password);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			System.err.println("# Error creating usuario: " +e);
			return false;
		}
		
		
	}
}
