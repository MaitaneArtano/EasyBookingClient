package GUICliente;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

import ControllerCliente.UsuarioController;
import ControllerCliente.VueloController;

public class BuscarGUI extends JInternalFrame {

	private UsuarioController usuarioC;
	private VueloController vueloC;
	/**
	 * Create the frame.
	 */
	public BuscarGUI(UsuarioController usuarioC, VueloController vueloC) {
		setBounds(100, 100, 450, 300);

	}

}
