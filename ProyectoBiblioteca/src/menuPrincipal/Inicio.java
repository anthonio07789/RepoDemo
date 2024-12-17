package menuPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicio extends JFrame {
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;

    public Inicio() {
        setTitle("Biblioteca Goya - Inicio de Sesión");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configurar panel principal con BorderLayout
        setLayout(new BorderLayout());

        // Panel superior con el logo
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(70, 130, 180)); // Azul acero
        JLabel logoLabel = new JLabel("📚 Biblioteca Goya");
        logoLabel.setForeground(Color.WHITE);
        logoLabel.setFont(new Font("Arial", Font.BOLD, 24));
        topPanel.add(logoLabel);

        // Panel central con BoxLayout para los campos
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(new Color(240, 248, 255)); // Fondo celeste claro
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));

        // Etiqueta y campo de usuario
        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        userLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        userField = new JTextField(15);
        userField.setMaximumSize(new Dimension(300, 30));
        userField.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Etiqueta y campo de contraseña
        JLabel passLabel = new JLabel("Contraseña:");
        passLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        passLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        passField = new JPasswordField(15);
        passField.setMaximumSize(new Dimension(300, 30));
        passField.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Botón de inicio de sesión
        loginButton = new JButton("Iniciar Sesión");
        loginButton.setFont(new Font("Arial", Font.BOLD, 16));
        loginButton.setBackground(new Color(100, 149, 237)); // Azul cornflower
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setBorder(BorderFactory.createRaisedBevelBorder());
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Añadir elementos al panel central con espacio
        centerPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        centerPanel.add(userLabel);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        centerPanel.add(userField);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        centerPanel.add(passLabel);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        centerPanel.add(passField);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        centerPanel.add(loginButton);

        // Panel inferior con el pie de página
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(70, 130, 180));
        JLabel footer = new JLabel("© 2024 Biblioteca Goya");
        footer.setForeground(Color.WHITE);
        bottomPanel.add(footer);

        // Añadir paneles al marco principal
        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        // Evento del botón de inicio de sesión
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                if (username.equals("admin") && password.equals("admin123")) {
                    JOptionPane.showMessageDialog(null, "Bienvenido Administrador");
                    // Aquí deberías llamar a la clase AdminPanel cuando esté creada
                    new AdminPanel();
                    dispose();
                } else if (username.equals("user") && password.equals("user123")) {
                    JOptionPane.showMessageDialog(null, "Bienvenido Usuario");
                    // Aquí deberías llamar a la clase UserPanel cuando esté creada
                    // Por ejemplo: new UserPanel();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Inicio());
    }
}
