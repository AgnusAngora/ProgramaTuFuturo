package cl.curso.java.guia12.ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.management.NotCompliantMBeanException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginGUI {

	private JFrame frame;
	private JTextField campoDeTextoNombre;
	private cl.curso.java.guia12.ejercicio2.Usuario usuario;
	private JPasswordField CampoDeTextoContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI window = new LoginGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(){
		this.usuario = new Usuario("Agnus", "Angora", 0);
		frame = new JFrame("Iniciar Sesión");
		frame.setBounds(100, 100, 300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel textInicioSession = new JLabel("Inicio Sesion");
		textInicioSession.setFont(new Font("Tahoma", Font.BOLD, 22));
		textInicioSession.setBackground(Color.BLACK);
		textInicioSession.setBounds(75, 11, 150, 30);
		frame.getContentPane().add(textInicioSession);
		
		JLabel lblNewLabel = new JLabel("Nombre de usuario");
		lblNewLabel.setBounds(10, 60, 115, 15);
		frame.getContentPane().add(lblNewLabel);
		
		campoDeTextoNombre = new JTextField();
		campoDeTextoNombre.setToolTipText("Ingrese su nombre de usuario");
		campoDeTextoNombre.setBounds(135, 56, 130, 20);
		frame.getContentPane().add(campoDeTextoNombre);
		campoDeTextoNombre.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(10, 86, 115, 14);
		frame.getContentPane().add(lblContrasea);

		CampoDeTextoContraseña = new JPasswordField();
		CampoDeTextoContraseña.setToolTipText("Ingrese su contrase\u00F1a");
		CampoDeTextoContraseña.setBounds(135, 83, 130, 20);
		frame.getContentPane().add(CampoDeTextoContraseña);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				try{
					usuario.login(campoDeTextoNombre.getText(), new String (CampoDeTextoContraseña.getPassword()));
					JOptionPane.showMessageDialog(null, "¡Has ingresado correctamente!","Login",JOptionPane.INFORMATION_MESSAGE);
				}catch(AutenticacionException e){
					JOptionPane.showMessageDialog(null, e.getMessage(),"Autentificación fallida",JOptionPane.ERROR_MESSAGE);
				} catch (CuentaBloqueadaException e) {
					JOptionPane.showMessageDialog(null, e.getMessage(),"Cuenta Bloqueada",JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		);
		btnNewButton.setBounds(75, 125, 150, 23);
		frame.getContentPane().add(btnNewButton);
		
	}
}
