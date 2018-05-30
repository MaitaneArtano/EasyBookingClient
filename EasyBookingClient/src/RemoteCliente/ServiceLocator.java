package RemoteCliente;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

import Remote.IRemoteFacade;

@SuppressWarnings("deprecation")
public class ServiceLocator 
{
	private IRemoteFacade service;
	

	public void setService(String ip, String port, String serverName)
	{
		if (System.getSecurityManager() == null)
		{
			System.setSecurityManager(new RMISecurityManager());
		}
		
		try
		{		
			String URL = "//" + ip + ":" + port + "/" + serverName;
			this.service = (IRemoteFacade) Naming.lookup(URL);
		} catch (Exception ex)
		{
			System.err.println("# Error locating remote facade: " + ex);
		}		
	}

	public IRemoteFacade getService()
	{
		return this.service;
	}
}
