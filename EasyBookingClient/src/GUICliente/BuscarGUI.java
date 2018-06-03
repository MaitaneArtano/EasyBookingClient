package GUICliente;

import ControllerCliente.UsuarioController;
import ControllerCliente.VueloController;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class BuscarGUI extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textFieldOrigen;
	private JTextField textFieldDestino;
	private JTextField textFieldIda;
	private JTextField textFieldVuelta;
	/**
	 * Create the frame.
	 */
	public BuscarGUI(UsuarioController usuarioC, VueloController vueloC)
	{
		setTitle("BUSCAR VUELOS");
		setBounds(100, 100, 579, 438);
		getContentPane().setLayout(null);
		
		JLabel lblOrigen = new JLabel("Origen");
		lblOrigen.setBounds(53, 51, 69, 20);
		getContentPane().add(lblOrigen);
		
		textFieldOrigen = new JTextField();
		textFieldOrigen.setBounds(53, 87, 146, 26);
		getContentPane().add(textFieldOrigen);
		textFieldOrigen.setColumns(10);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setBounds(53, 129, 69, 20);
		getContentPane().add(lblDestino);
		
		textFieldDestino = new JTextField();
		textFieldDestino.setBounds(53, 165, 146, 26);
		getContentPane().add(textFieldDestino);
		textFieldDestino.setColumns(10);
		
		JLabel lblFechaIda = new JLabel("Fecha ida");
		lblFechaIda.setBounds(53, 217, 69, 20);
		getContentPane().add(lblFechaIda);
		
		textFieldIda = new JTextField();
		textFieldIda.setBounds(53, 253, 146, 26);
		getContentPane().add(textFieldIda);
		textFieldIda.setColumns(10);
		
		JLabel lblFechaVuelta = new JLabel("Fecha vuelta");
		lblFechaVuelta.setBounds(264, 217, 98, 20);
		getContentPane().add(lblFechaVuelta);
		
		textFieldVuelta = new JTextField();
		textFieldVuelta.setBounds(264, 253, 146, 26);
		getContentPane().add(textFieldVuelta);
		textFieldVuelta.setColumns(10);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(53, 316, 69, 20);
		getContentPane().add(lblCantidad);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(131, 313, 32, 26);
		getContentPane().add(spinner);

		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				textFieldOrigen.getText();
				textFieldDestino.getText();
				textFieldIda.getText();
				textFieldVuelta.getText();				
				spinner.getValue();
				
				//vuelo controllerrea jungoa eta hor si hay vuelos que coincidan devolvera una lista
			/*	
				correcto=vueloC.buscar(origen,destino,ida,vuelta);
				
				if(correcto==true)
				{
					//ez dakit nola bueltatukoun lista ta gero or seleccionatzeko nola in
					JOptionPane.showMessageDialog(null, "Busqueda con exito");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Busqueda fallido. Vuelva a intentarlo");
				
				}
				*/
			}
				
			
		});
		
		btnBuscar.setBounds(320, 332, 115, 29);
		getContentPane().add(btnBuscar);
		
	}
}
