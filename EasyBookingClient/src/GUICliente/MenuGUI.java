package GUICliente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ControllerCliente.UsuarioController;
import ControllerCliente.VueloController;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.ButtonGroup;

public class MenuGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsuario;
	private JTextField textFieldContrase�a;
	
	private static UsuarioController usuarioC;
	private static VueloController vueloC;
	private JTextField textFieldUsuarioFace;
	private JTextField textFieldContrase�aFace;
	private JTextField textFieldUsuarioGoogle;
	private JTextField textFieldContrase�aGoogle;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuGUI frame = new MenuGUI(usuarioC, vueloC);
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
	public MenuGUI(UsuarioController usuarioC, VueloController vueloC) {
		setTitle("EASYBOOKING");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 852, 613);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Iniciar sesion");
		lblLogin.setBounds(46, 58, 147, 20);
		contentPane.add(lblLogin);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(46, 106, 69, 20);
		contentPane.add(lblNewLabel);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(46, 142, 186, 39);
		contentPane.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(46, 197, 114, 20);
		contentPane.add(lblContrasea);
		
		textFieldContrase�a = new JTextField();
		textFieldContrase�a.setBounds(46, 233, 186, 39);
		contentPane.add(textFieldContrase�a);
		textFieldContrase�a.setColumns(10);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean correcto;
				String email=textFieldUsuario.getText();
				String contrase�a=textFieldContrase�a.getText();
				
				
				//hemen ya directo base datosen a ver badaon beidatukou y si es true buscarreko pagina
			}
		});
		
		btnEntrar.setBounds(78, 320, 115, 29);
		contentPane.add(btnEntrar);
		
		
		JLabel lblNoTengoCuenta = new JLabel("No tengo cuenta, registrarme con...");
		lblNoTengoCuenta.setBounds(346, 58, 275, 20);
		contentPane.add(lblNoTengoCuenta);
		
		
		
		
		JLabel labelUsuarioFace = new JLabel("Usuario");
		labelUsuarioFace.setBounds(344, 128, 69, 20);
		contentPane.add(labelUsuarioFace);
		
		textFieldUsuarioFace = new JTextField();
		textFieldUsuarioFace.setColumns(10);
		textFieldUsuarioFace.setBounds(344, 164, 186, 39);
		contentPane.add(textFieldUsuarioFace);
		
		JLabel labelContrase�aFace = new JLabel("Contrase\u00F1a");
		labelContrase�aFace.setBounds(344, 219, 114, 20);
		contentPane.add(labelContrase�aFace);
		
		textFieldContrase�aFace = new JTextField();
		textFieldContrase�aFace.setColumns(10);
		textFieldContrase�aFace.setBounds(344, 255, 186, 39);
		contentPane.add(textFieldContrase�aFace);
		
		JButton btnRegisFace = new JButton("REGISTRARME");
		btnRegisFace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean correcto;
				String email=textFieldUsuarioFace.getText();
				String contrase�a=textFieldContrase�aFace.getText();
				//hemen se supone que authorisation ta horrea jungoala nolabait ta true bada buscarreko pagina
			/*	
				correcto=usuarioC.signin(email, contrase�a);
				
				if(correcto==true)
				{
					BuscarGUI buscar=new BuscarGUI(usuarioC, vueloC);
					JOptionPane.showMessageDialog(null, "Registro exitoso");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Registro fallido. Vuelva a intentarlo");
				
				}
				*/
			}
		});
		btnRegisFace.setBounds(354, 320, 162, 29);
		contentPane.add(btnRegisFace);
		
		
		JRadioButton rdbtnFacebook = new JRadioButton("FACEBOOK");
		buttonGroup.add(rdbtnFacebook);
		rdbtnFacebook.setBounds(342, 90, 155, 29);
		contentPane.add(rdbtnFacebook);
				
		
		JLabel labelUsuarioGoogle = new JLabel("Usuario");
		labelUsuarioGoogle.setBounds(583, 128, 69, 20);
		contentPane.add(labelUsuarioGoogle);
		
		textFieldUsuarioGoogle = new JTextField();
		textFieldUsuarioGoogle.setColumns(10);
		textFieldUsuarioGoogle.setBounds(583, 164, 186, 39);
		contentPane.add(textFieldUsuarioGoogle);
		
		JLabel labelContrase�aGoogle = new JLabel("Contrase\u00F1a");
		labelContrase�aGoogle.setBounds(583, 219, 114, 20);
		contentPane.add(labelContrase�aGoogle);
		
		textFieldContrase�aGoogle = new JTextField();
		textFieldContrase�aGoogle.setColumns(10);
		textFieldContrase�aGoogle.setBounds(583, 255, 186, 39);
		contentPane.add(textFieldContrase�aGoogle);		
		
		
		JButton buttonRegisGoogle = new JButton("REGISTRARME");
		buttonRegisGoogle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String email=textFieldUsuarioGoogle.getText();
				String contrase�a=textFieldContrase�aGoogle.getText();
				//hemen se supone que authorisation ta horrea jungoala nolabait ta true bada buscarreko pagina
			}
		});
		buttonRegisGoogle.setBounds(593, 320, 162, 29);
		contentPane.add(buttonRegisGoogle);
		
		JRadioButton rdbtnGoogle = new JRadioButton("GOOGLE");
		buttonGroup.add(rdbtnGoogle);
		rdbtnGoogle.setBounds(581, 90, 155, 29);
		contentPane.add(rdbtnGoogle);
		
		
	
	}
}
