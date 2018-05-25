package ControllerCliente;

import RemoteCliente.ServiceLocator;

public class VueloController 
{
	public ServiceLocator serviceLocator;
	
	public VueloController(ServiceLocator serviceLocator)
	{
		this.serviceLocator = serviceLocator;
	}

}
