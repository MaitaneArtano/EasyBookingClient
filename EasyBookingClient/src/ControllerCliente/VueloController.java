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
	
	public boolean pago(int precio, String num_tarjeta, int metodo) throws RemoteException
	{
		
			System.out.println("Entra en vueloController. metodo:" + metodo);
			return this.serviceLocator.getService().pago(precio, num_tarjeta, metodo);
		
	}

}
