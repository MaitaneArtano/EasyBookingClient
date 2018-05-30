package GUICliente;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import ControllerCliente.VueloController;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PagoGUI extends JInternalFrame {

	 private VueloController vueloC;
	
	/**
	 * Create the frame.
	 */
	public PagoGUI() {
		setBounds(100, 100, 571, 425);
		getContentPane().setLayout(null);
		
		JLabel lblMtodoDePago = new JLabel("M\u00E9todo de pago");
		lblMtodoDePago.setBounds(62, 222, 120, 20);
		getContentPane().add(lblMtodoDePago);
		
		JButton btnPaypal = new JButton("PAYPAL");
		btnPaypal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//hemendik vuelo controllerrea jungoa ta pagoa efectuatu ta factura vueltatu??
			}
		});
		btnPaypal.setBounds(62, 276, 115, 29);
		getContentPane().add(btnPaypal);
		
		JButton btnVisa = new JButton("VISA");
		btnVisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//hemendik vuelo controllerrea jungoa ta pagoa efectuatu ta factura vueltatu??
			}
		});
		btnVisa.setBounds(238, 276, 115, 29);
		getContentPane().add(btnVisa);

	}

}
