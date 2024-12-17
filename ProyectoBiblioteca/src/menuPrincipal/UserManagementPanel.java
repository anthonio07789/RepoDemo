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
import javax.swing.SwingConstants;

class UserManagementPanel extends JFrame {
	
    public void UserMasnagementPanel() {
        setTitle("Biblioteca Goya - Gestión de Usuarios");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(240, 248, 255));

        // Título
        JLabel titleLabel = new JLabel("👤 Gestión de Usuarios", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setForeground(new Color(70, 130, 180));

        // Botones
        JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 10, 10));
        JButton addUserButton = new JButton("Agregar Usuario ➕");
        JButton removeUserButton = new JButton("Eliminar Usuario ❌");
        styleButton(addUserButton);
        styleButton(removeUserButton);

        buttonPanel.add(addUserButton);
        buttonPanel.add(removeUserButton);

        // Volver
        JButton backButton = new JButton("Volver ⬅️");
        styleButton(backButton);

        panel.add(titleLabel, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.CENTER);
        panel.add(backButton, BorderLayout.SOUTH);

        add(panel);

        backButton.addActionListener(e -> dispose());
        setVisible(true);
    }

    private void styleButton(JButton button) {
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.setBackground(new Color(100, 149, 237));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createRaisedBevelBorder());
    }
}
