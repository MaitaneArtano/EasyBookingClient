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
		return false;
	}
	
	public boolean signin(String email)//zeba contrseña ez???
	{
		
		return false;
		//Conectarse con servidor externo
	}
	
	
}
