package Cliente;

import ControllerCliente.UsuarioController;
import ControllerCliente.VueloController;
import RemoteCliente.ServiceLocator;

public class Main {

	public static void main(String[] args) 
	{
		ServiceLocator serviceLocator = new ServiceLocator();
		serviceLocator.setService(args[0], args[1],  args[2]);
		UsuarioController irc = new UsuarioController(serviceLocator);
		VueloController rlc = new VueloController(serviceLocator);
		
		
		//GUIMenu mgui = new GUIMenu(irc, rlc, p);
		//mgui.setVisible(true);
		
		
	}

}
