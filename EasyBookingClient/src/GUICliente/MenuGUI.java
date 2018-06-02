package GUICliente;

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
import javax.swing.ButtonGroup;

public class MenuGUI extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static UsuarioController usuarioC;
	private static VueloController vueloC;

	private JPanel contentPane;
	private JTextField textRegUsuario;
	private JTextField textRegPass;
	private JTextField textLogUsuario;
	private JTextField textLogPass;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run()
			{
				try
				{
					MenuGUI frame = new MenuGUI(usuarioC, vueloC);
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuGUI(UsuarioController usuarioC, VueloController vueloC) 
	{
		this.usuarioC = usuarioC;
		setTitle("EASYBOOKING");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 852, 613);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Etiquetas
		JLabel lblLogin = new JLabel("Registrarme (Sign in):");
		lblLogin.setBounds(48, 95, 147, 20);
		contentPane.add(lblLogin);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(46, 128, 69, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(46, 219, 114, 20);
		contentPane.add(lblContrasea);
		
		JLabel lblNoTengoCuenta = new JLabel("Iniciar sesi\u00F3n (Log in):");
		lblNoTengoCuenta.setBounds(346, 27, 275, 20);
		contentPane.add(lblNoTengoCuenta);
		
		JLabel labelUsuarioFace = new JLabel("Usuario");
		labelUsuarioFace.setBounds(346, 128, 69, 20);
		contentPane.add(labelUsuarioFace);
		
		JLabel labelContraseñaFace = new JLabel("Contrase\u00F1a");
		labelContraseñaFace.setBounds(344, 219, 114, 20);
		contentPane.add(labelContraseñaFace);
		
		//Datos
		textRegUsuario = new JTextField();
		textRegUsuario.setBounds(46, 167, 186, 39);
		contentPane.add(textRegUsuario);
		textRegUsuario.setColumns(10);
		
		textRegPass = new JTextField();
		textRegPass.setBounds(46, 255, 186, 39);
		contentPane.add(textRegPass);
		textRegPass.setColumns(10);
		
		textLogUsuario = new JTextField();
		textLogUsuario.setColumns(10);
		textLogUsuario.setBounds(344, 164, 186, 39);
		contentPane.add(textLogUsuario);
		
		textLogPass = new JTextField();
		textLogPass.setColumns(10);
		textLogPass.setBounds(344, 255, 186, 39);
		contentPane.add(textLogPass);
		
		JButton btnRegistrar = new JButton("REGISTRARME");
		btnRegistrar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				boolean correcto;
				String email = textRegUsuario.getText();
				String contraseña = textRegPass.getText();
		
				
					correcto = usuarioC.signin(email, contraseña);
				
				if(correcto == true)
				{
					setVisible(false);
					BuscarGUI buscar = new BuscarGUI(usuarioC, vueloC);
					JOptionPane.showMessageDialog(null, "Registro exitoso");
					
					buscar.setVisible(true);
				}
				
				else
				{
					JOptionPane.showMessageDialog(null, "Registro fallido. Vuelva a intentarlo");
				
				}
			}
		});
		
		btnRegistrar.setBounds(79, 320, 135, 29);
		contentPane.add(btnRegistrar);
		
		JRadioButton rdbtnFacebook = new JRadioButton("FACEBOOK");
		buttonGroup.add(rdbtnFacebook);
		rdbtnFacebook.setBounds(342, 90, 155, 29);
		contentPane.add(rdbtnFacebook);
		
		JRadioButton rdbtnGoogle = new JRadioButton("GOOGLE");
		rdbtnGoogle.setSelected(true);
		buttonGroup.add(rdbtnGoogle);
		rdbtnGoogle.setBounds(342, 54, 155, 29);
		contentPane.add(rdbtnGoogle);		
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				boolean correcto = false;
				int plataforma; //Sera 1 (Facebook), 2 (Google)
				String email = textLogUsuario.getText();
				String contrasena = textLogPass.getText();
				
				if(rdbtnFacebook.isSelected())
				{
					plataforma = 1;
				}else
				{
					plataforma = 2;
				}
				
				correcto = usuarioC.login(email, contrasena, plataforma);
				
				if(correcto == true)
				{
					setVisible(false);
					BuscarGUI buscar=new BuscarGUI(usuarioC, vueloC);
					JOptionPane.showMessageDialog(null, "Registro exitoso");
					buscar.setVisible(true);
				}
				
				else
				{
					JOptionPane.showMessageDialog(null, "Registro fallido. Vuelva a intentarlo");
				
				}
			}
		});
		btnEntrar.setBounds(354, 320, 162, 29);
		contentPane.add(btnEntrar);	
		

		
	
	}
}
