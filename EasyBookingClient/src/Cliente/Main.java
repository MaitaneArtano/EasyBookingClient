package Cliente;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import ControllerCliente.UsuarioController;
import ControllerCliente.VueloController;
import client.controller.ControllerCancion;
import client.controller.ControllerPago;
import client.controller.ControllerUsuario;
import client.gui.GUIMenu;
import RemoteCliente.ServiceLocator;

public class Main {

	public static void main(String[] args) 
	{
		ServiceLocator serviceLocator = new ServiceLocator();
		/*serviceLocator.setServiceUsuario(args[0], args[1],  args[2]);
		UsuarioController irc = new UsuarioController(serviceLocator);
		
		serviceLocator.setServicePago(args[0], args[1], args[4]);
		ControllerPago p = new ControllerPago(serviceLocator);
		
		serviceLocator.setServiceCancion(args[0], args[1], args[3]);
		VueloController rlc = new VueloController(serviceLocator);
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			((Throwable) e).printStackTrace();
		}
		
		GUIMenu mgui = new GUIMenu(irc, rlc, p);
		mgui.setVisible(true);*/
		
		
	}

}
