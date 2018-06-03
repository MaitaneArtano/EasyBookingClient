package ControllerCliente;

import java.rmi.RemoteException;
import java.util.List;

import DTO.CompleteVueloDTO;
import RemoteCliente.ServiceLocator;

public class VueloController 
{
	public ServiceLocator serviceLocator;
	
	public VueloController(ServiceLocator serviceLocator)
	{
		this.serviceLocator = serviceLocator;
	}
	
	public CompleteVueloDTO buscarVuelo(String id_vuelo) throws RemoteException
	{
		CompleteVueloDTO vueloDetails = new CompleteVueloDTO();
		vueloDetails = serviceLocator.getService().getVueloDetails(id_vuelo);
		return vueloDetails;
	}

}
