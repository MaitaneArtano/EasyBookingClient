package GUICliente;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import ControllerCliente.VueloController;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PagoGUI extends JFrame {

	 private VueloController vueloC;
	 private JTextField textField;
	 private JTextField textField_1;
	
	/**
	 * Create the frame.
	 */
	public PagoGUI(int precio) {
		setBounds(100, 100, 571, 425);
		getContentPane().setLayout(null);
		
		JLabel lblMtodoDePago = new JLabel("M\u00E9todo de pago");
		lblMtodoDePago.setBounds(57, 41, 120, 20);
		getContentPane().add(lblMtodoDePago);
		
		JRadioButton rdbtnVisa = new JRadioButton("VISA");
		rdbtnVisa.setBounds(57, 73, 155, 29);
		getContentPane().add(rdbtnVisa);
		
		JRadioButton rdbtnPaypal = new JRadioButton("PAYPAL");
		rdbtnPaypal.setBounds(57, 125, 155, 29);
		getContentPane().add(rdbtnPaypal);
		
		JLabel lblNumeroDeTarjeta = new JLabel("Numero de tarjeta");
		lblNumeroDeTarjeta.setBounds(57, 166, 145, 20);
		getContentPane().add(lblNumeroDeTarjeta);
		
		textField = new JTextField();
		textField.setBounds(57, 202, 146, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(225, 248, 146, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		System.out.println(precio);
		textField_1.setText(Integer.toString( precio));
		
		JLabel lblTotak = new JLabel("TOTAL");
		lblTotak.setBounds(67, 251, 69, 20);
		getContentPane().add(lblTotak);
		
		JButton btnComprar = new JButton("COMPRAR");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int metodo;
				boolean correcto;
				if(rdbtnVisa.isSelected())
				{
					metodo=1;
				}
				
				else
				{
					metodo=2;
				}
				
				
				try 
				{
					System.out.println("Metodo en  "+ metodo);
					correcto = vueloC.pago(precio, textField.getText(), metodo);
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				if(correcto == true)
				{
					
					JOptionPane.showMessageDialog(null, "Pago efectuado");
					
				}
				
				else
				{
					JOptionPane.showMessageDialog(null, "Pago incorrecto. Vuelva a intentarlo");
				
				}
			}
			
		});
		btnComprar.setBounds(256, 304, 115, 29);
		getContentPane().add(btnComprar);

	}
}
