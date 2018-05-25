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
	
	public void signin(String email)
	{
		//Conectarse con servidor externo
	}
}
