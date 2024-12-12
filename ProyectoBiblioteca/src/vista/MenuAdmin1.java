package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;

public class MenuAdmin1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAdmin1 frame = new MenuAdmin1();
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
	public MenuAdmin1() {
		setTitle("Menu de administracion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{100, 100, 100, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnAdminLibro = new JButton("Administrar libros");
		btnAdminLibro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnAdminLibro = new GridBagConstraints();
		gbc_btnAdminLibro.fill = GridBagConstraints.BOTH;
		gbc_btnAdminLibro.insets = new Insets(0, 0, 5, 5);
		gbc_btnAdminLibro.gridx = 1;
		gbc_btnAdminLibro.gridy = 1;
		contentPane.add(btnAdminLibro, gbc_btnAdminLibro);
		
		JButton btnAdministrarUsuario = new JButton("Administrar usuarios");
		btnAdministrarUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnAdministrarUsuario = new GridBagConstraints();
		gbc_btnAdministrarUsuario.fill = GridBagConstraints.BOTH;
		gbc_btnAdministrarUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_btnAdministrarUsuario.gridx = 1;
		gbc_btnAdministrarUsuario.gridy = 2;
		contentPane.add(btnAdministrarUsuario, gbc_btnAdministrarUsuario);
		
		JButton btnBack = new JButton("Atras");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.fill = GridBagConstraints.BOTH;
		gbc_btnBack.insets = new Insets(0, 0, 5, 5);
		gbc_btnBack.gridx = 1;
		gbc_btnBack.gridy = 3;
		contentPane.add(btnBack, gbc_btnBack);
	}

}
