package GUICliente;


import DTO.CompleteVueloDTO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ControllerCliente.UsuarioController;
import ControllerCliente.VueloController;

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
	private JTextField textFieldID_vuelo;
	CompleteVueloDTO miVueloDTO = new CompleteVueloDTO();
	/**
	 * Create the frame.
	 */
	
	
	
	
	public BuscarGUI(UsuarioController usuarioC, VueloController vueloC)
	{		
		this.vueloC = vueloC;
		setTitle("BUSCAR VUELOS");
		setBounds(100, 100, 463, 467);
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
		
		textFieldID_vuelo.setEditable(true);
		textFieldOrigen.setEditable(false);
		textFieldDestino.setEditable(false);
		textFieldIda.setEditable(false);

		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				textFieldOrigen.getText();
				textFieldDestino.getText();
				textFieldIda.getText();			
				try 
				{
					miVueloDTO = vueloC.buscarVuelo(textFieldID_vuelo.getText());
					textFieldOrigen.setText(miVueloDTO.getOrigen());
					textFieldDestino.setText(miVueloDTO.getDestino());
					textFieldIda.setText(miVueloDTO.getFecha());
					btnBuscar.setEnabled(false);

					
				} catch (RemoteException e1)
				{
					JOptionPane.showMessageDialog(null, "Introduce un id vuelo para la b�squeda");
				}
				
			}

		});
		btnBuscar.setBounds(73, 329, 115, 29);
		getContentPane().add(btnBuscar);
		
		
		int precio=(int) miVueloDTO.getPrecio();
		System.out.println(precio);
		JButton btnPagar = new JButton("PAGAR");
		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
				PagoGUI pagar=new PagoGUI(precio);
				pagar.setVisible(true);
			}
		});
		btnPagar.setBounds(251, 329, 115, 29);
		getContentPane().add(btnPagar);
	}
}
