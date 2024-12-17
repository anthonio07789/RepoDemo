package menuPrincipal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

class UserPanel extends JFrame {
    public UserPanel() {
        setTitle("Biblioteca Goya - Usuario");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel headerLabel = new JLabel("📚 Libros Disponibles", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerLabel.setForeground(new Color(70, 130, 180));

        JTable booksTable = new JTable(new String[][] { 
            { "El Quijote", "Disponible" }, 
            { "Cien Años de Soledad", "Reservado" } 
        }, new String[] { "Título", "Estado" });

        JButton backButton = new JButton("Volver ⬅️");
        styleButton(backButton);

        add(headerLabel, BorderLayout.NORTH);
        add(new JScrollPane(booksTable), BorderLayout.CENTER);
        add(backButton, BorderLayout.SOUTH);

        backButton.addActionListener(e -> {
            new Inicio();
            dispose();
        });

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
