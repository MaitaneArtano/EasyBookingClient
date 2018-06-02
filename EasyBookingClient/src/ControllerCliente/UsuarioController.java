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
	
	public boolean login(String email, String password, int plataforma) throws RemoteException
	{
		
			System.out.println("Entra en usuarioController. Plataforma:" + plataforma);
			return this.serviceLocator.getService().login(email, password, plataforma);
		
	}
	
	public boolean signin(String email, String password)
	{
		try 
		{
			return this.serviceLocator.getService().signin(email, password);
		} catch (RemoteException e) 
		{
			// TODO Auto-generated catch block
			System.err.println("# Error creating usuario: " + e);
			return false;
		}
		
		
	}
}
