package ControllerCliente;

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
	
	public boolean signin(String email)//zeba contrse�a ez???
	{
		
		return false;
		//Conectarse con servidor externo
	}
	
	
}
