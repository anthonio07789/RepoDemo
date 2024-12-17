package menuPrincipal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//hola
public class AdminPanel extends JFrame {
	public AdminPanel() {
		setTitle("Biblioteca Goya - Panel de Administrador");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		// Encabezado
		JPanel topPanel = new JPanel();
		topPanel.setBackground(new Color(70, 130, 180));
		JLabel titleLabel = new JLabel("📚 Administración de Biblioteca");
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
		topPanel.add(titleLabel);
		
		// Centro - Botones de gestión
		JPanel centerPanel = new JPanel(new GridLayout(2, 1, 20, 20));
		centerPanel.setBackground(new Color(240, 248, 255));
		JButton manageBooksButton = createStyledButton("Gestión de Libros 📖");
		JButton manageUsersButton = createStyledButton("Gestión de Usuarios 👤");
		centerPanel.add(manageBooksButton);
		centerPanel.add(manageUsersButton);
		
		// Botón para volver al login
		JButton backButton = createStyledButton("Cerrar Sesión ⬅️");
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(new Color(70, 130, 180));
		bottomPanel.add(backButton);
		
		// Añadir paneles
		add(topPanel, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		add(bottomPanel, BorderLayout.SOUTH);
		
		// Eventos
		manageBooksButton.addActionListener(e -> new BookManagementPanel());
		manageUsersButton.addActionListener(e -> new UserManagementPanel());
		backButton.addActionListener(e -> {
			new Inicio();
			dispose();
		});
		setVisible(true);
	}

	private JButton createStyledButton(String text) {
		JButton button = new JButton(text);
		button.setFont(new Font("Arial", Font.BOLD, 18));
		button.setBackground(new Color(100, 149, 237));
		button.setForeground(Color.WHITE);
		button.setFocusPainted(false);
		button.setBorder(BorderFactory.createRaisedBevelBorder());
		return button;
	}
}