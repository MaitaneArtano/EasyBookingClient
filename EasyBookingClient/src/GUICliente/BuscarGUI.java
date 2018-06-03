package GUICliente;

import ControllerCliente.UsuarioController;
import ControllerCliente.VueloController;
import DTO.CompleteVueloDTO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class BuscarGUI extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static VueloController vueloC;
	
	private JTextField textFieldOrigen;
	private JTextField textFieldDestino;
	private JTextField textFieldIda;
	private JTextField textFieldVuelta;
	private JTextField textFieldID_vuelo;
	CompleteVueloDTO miVueloDTO = new CompleteVueloDTO();
	/**
	 * Create the frame.
	 */
	public BuscarGUI(UsuarioController usuarioC, VueloController vueloC)
	{
		
		
		this.vueloC = vueloC;
		setTitle("BUSCAR VUELOS");
		setBounds(100, 100, 579, 438);
		getContentPane().setLayout(null);
		
		
		textFieldID_vuelo = new JTextField();
		textFieldID_vuelo.setColumns(10);
		textFieldID_vuelo.setBounds(53, 78, 146, 26);
		getContentPane().add(textFieldID_vuelo);
		
		JLabel lblIdVuelo = new JLabel("Id Vuelo");
		lblIdVuelo.setBounds(53, 50, 69, 20);
		getContentPane().add(lblIdVuelo);
		
		JLabel lblOrigen = new JLabel("Origen");
		lblOrigen.setBounds(53, 123, 69, 20);
		getContentPane().add(lblOrigen);
		
		textFieldOrigen = new JTextField();
		textFieldOrigen.setBounds(53, 156, 146, 26);
		getContentPane().add(textFieldOrigen);
		textFieldOrigen.setColumns(10);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setBounds(53, 195, 69, 20);
		getContentPane().add(lblDestino);
		
		textFieldDestino = new JTextField();
		textFieldDestino.setBounds(53, 217, 146, 26);
		getContentPane().add(textFieldDestino);
		textFieldDestino.setColumns(10);
		
		JLabel lblFechaIda = new JLabel("Fecha ida");
		lblFechaIda.setBounds(53, 256, 69, 20);
		getContentPane().add(lblFechaIda);
		
		textFieldIda = new JTextField();
		textFieldIda.setBounds(53, 277, 146, 26);
		getContentPane().add(textFieldIda);
		textFieldIda.setColumns(10);
		
		JLabel lblFechaVuelta = new JLabel("Fecha vuelta");
		lblFechaVuelta.setBounds(266, 256, 98, 20);
		getContentPane().add(lblFechaVuelta);
		
		textFieldVuelta = new JTextField();
		textFieldVuelta.setBounds(266, 277, 146, 26);
		getContentPane().add(textFieldVuelta);
		textFieldVuelta.setColumns(10);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(53, 316, 69, 20);
		getContentPane().add(lblCantidad);


		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				textFieldOrigen.getText();
				textFieldDestino.getText();
				textFieldIda.getText();
				textFieldVuelta.getText();				
				try 
				{
					//Hemen supuestamente completeVueloDTO bat bueltauko luke eta hori beste lehion baten edo mostrau beharko litzeke eta erosteko aukera eman
					miVueloDTO = vueloC.buscarVuelo(textFieldID_vuelo.getText());
					JOptionPane.showMessageDialog(null, miVueloDTO.getDestino());
					listaVuelosGUI objListaVuelos=new listaVuelosGUI();
					objListaVuelos.setVisible(true);
				} catch (RemoteException e1)
				{
					JOptionPane.showMessageDialog(null, "Introduce un id vuelo para la búsqueda");
				}
				
			}
				
			
		});
		btnBuscar.setBounds(320, 332, 115, 29);
		getContentPane().add(btnBuscar);
	}
}
