package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import java.awt.TextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class Principal {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
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
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 611, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NUEVO USUARIO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(189, 0, 207, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(152, 75, 85, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(152, 124, 108, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Idioma:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3.setBounds(152, 170, 69, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Comunicación:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_4.setBounds(152, 219, 130, 25);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(318, 75, 108, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(318, 124, 108, 25);
		frame.getContentPane().add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Español", "Inglés", "Francés"}));
		comboBox.setBounds(318, 175, 108, 22);
		frame.getContentPane().add(comboBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Teléfono");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNewRadioButton.setBounds(312, 216, 114, 35);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnEmail = new JRadioButton("e-mail");
		buttonGroup.add(rdbtnEmail);
		rdbtnEmail.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnEmail.setBounds(312, 250, 114, 25);
		frame.getContentPane().add(rdbtnEmail);
		
		JButton btnNewButton = new JButton("GUARDAR");
		btnNewButton.setBounds(253, 298, 130, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
