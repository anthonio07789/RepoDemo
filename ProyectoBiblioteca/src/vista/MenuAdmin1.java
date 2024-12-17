package vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;

public class MenuAdmin1 extends JFrame {

	
	//HOLA BB SE QUE CONTIGO NO SIRVE LA LABIA Y TE CREES MUY SABIA PERO TE VAS A CAER
	///Miau
	
	///caca pedo pis
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
        setTitle("Menú de Administración");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400); // Tamaño de ventana aumentado
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.setBackground(new Color(240, 248, 255)); // Color de fondo azul claro
        setContentPane(contentPane);

        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[]{100, 200, 100, 0};
        gbl_contentPane.rowHeights = new int[]{50, 50, 50, 50, 50, 0};
        gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
        gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
        contentPane.setLayout(gbl_contentPane);

        // Botón Administrar Libros
        JButton btnAdminLibro = new JButton("📚 Administrar Libros");
        btnAdminLibro.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnAdminLibro.setBackground(new Color(173, 216, 230)); // Fondo azul claro
        btnAdminLibro.setFocusPainted(false);
        GridBagConstraints gbc_btnAdminLibro = new GridBagConstraints();
        gbc_btnAdminLibro.fill = GridBagConstraints.BOTH;
        gbc_btnAdminLibro.insets = new Insets(10, 10, 10, 10); // Espaciado uniforme
        gbc_btnAdminLibro.gridx = 1;
        gbc_btnAdminLibro.gridy = 1;
        contentPane.add(btnAdminLibro, gbc_btnAdminLibro);

        // Botón Administrar Usuariosss
        JButton btnAdministrarUsuario = new JButton("👥 Administrar Usuarios");
        btnAdministrarUsuario.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnAdministrarUsuario.setBackground(new Color(173, 216, 230)); // Fondo azul claro
        btnAdministrarUsuario.setFocusPainted(false);
        GridBagConstraints gbc_btnAdministrarUsuario = new GridBagConstraints();
        gbc_btnAdministrarUsuario.fill = GridBagConstraints.BOTH;
        gbc_btnAdministrarUsuario.insets = new Insets(10, 10, 10, 10);
        gbc_btnAdministrarUsuario.gridx = 1;
        gbc_btnAdministrarUsuario.gridy = 2;
        contentPane.add(btnAdministrarUsuario, gbc_btnAdministrarUsuario);

        // Botón Atrás
        JButton btnBack = new JButton("🔙 Atrás");
        btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnBack.setBackground(new Color(173, 216, 230)); // Fondo azul claro
        btnBack.setFocusPainted(false);
        GridBagConstraints gbc_btnBack = new GridBagConstraints();
        gbc_btnBack.fill = GridBagConstraints.BOTH;
        gbc_btnBack.insets = new Insets(10, 10, 10, 10);
        gbc_btnBack.gridx = 1;
        gbc_btnBack.gridy = 3;
        contentPane.add(btnBack, gbc_btnBack);
    }
}
