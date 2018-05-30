package Cliente;

import ControllerCliente.UsuarioController;
import ControllerCliente.VueloController;
import GUICliente.MenuGUI;
import RemoteCliente.ServiceLocator;

//sign in --> entrar por primera vez
//log in --> cuando ya tienes usuario 

public class Main {

	public static void main(String[] args) 
	{
		ServiceLocator serviceLocator = new ServiceLocator();
		serviceLocator.setService(args[0], args[1],  args[2]);
		
		UsuarioController irc = new UsuarioController(serviceLocator);
		VueloController rlc = new VueloController(serviceLocator);
		
		MenuGUI mgui = new MenuGUI(irc, rlc);
		mgui.setVisible(true);

	}

}
