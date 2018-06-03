package GUICliente;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Data.Vuelo;
import Remote.VueloDAO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class listaVuelosGUI extends JInternalFrame {
	
	private JList listVuelo;

	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listaVuelosGUI frame = new listaVuelosGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public listaVuelosGUI() {
		setBounds(100, 100, 513, 369);
		getContentPane().setLayout(null);
		
		JList Jlist = new JList();
		Jlist.setBounds(15, 16, 226, 283);
		getContentPane().add(Jlist);
		
		JLabel lblEfectuarPagoCon = new JLabel("Efectuar pago con...");
		lblEfectuarPagoCon.setBounds(270, 17, 149, 20);
		getContentPane().add(lblEfectuarPagoCon);
		
		JRadioButton rdbtnVisa = new JRadioButton("VISA");
		rdbtnVisa.setBounds(268, 49, 155, 29);
		getContentPane().add(rdbtnVisa);
		
		JRadioButton rdbtnPaypal = new JRadioButton("PAYPAL");
		rdbtnPaypal.setBounds(270, 86, 155, 29);
		getContentPane().add(rdbtnPaypal);
		
		JLabel lblNmeroDeTarjeta = new JLabel("N\u00FAmero de tarjeta");
		lblNmeroDeTarjeta.setBounds(270, 128, 149, 20);
		getContentPane().add(lblNmeroDeTarjeta);
		
		textField = new JTextField();
		textField.setBounds(270, 164, 146, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnPagar = new JButton("Comprar");
		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int metodo;//sera 1 (VISA), sera 2 (PAYPAL)
				
				if(rdbtnVisa.isSelected())
				{
					metodo=1;
				}
				
				else
				{
					metodo=2;
				}
			}
		});
		btnPagar.setBounds(280, 206, 115, 29);
		getContentPane().add(btnPagar);

	}
	
	public void CargarListas(VueloDAO vuelo){
		
		DefaultListModel modeloV=new DefaultListModel();		
		
	
			try {
				for (Vuelo s : vuelo.getVuelos() ){
					
						modeloV.addElement( s.getId_vuelo() );
					
					}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		listVuelo.setModel( modeloV );
			
		
		
	}
}
