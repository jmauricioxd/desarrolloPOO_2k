import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGrafico extends JFrame {

    private JTextField txtUsuario;
    private JPasswordField txtPassword;
    private JButton btnIngresar;
    private JButton btnRegistrar;

    public LoginGrafico() {

        // CONFIGURACIÓN DE LA VENTANA
        setTitle("Inicio de Sesión Seguro");
        setSize(500, 460);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // PANEL PRINCIPAL
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        add(panel);

        // TÍTULO
        JLabel lblTitulo = new JLabel(
                "INICIO DE SESIÓN SEGURO",
                SwingConstants.CENTER
        );

        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setForeground(new Color(45, 45, 45));
        lblTitulo.setBounds(80, 20, 340, 30);

        panel.add(lblTitulo);

        // ICONO DE SEGURIDAD
        JLabel lblIcono = new JLabel(new IconoSeguridad());
        lblIcono.setBounds(200, 60, 100, 100);

        panel.add(lblIcono);

        // ETIQUETA USUARIO
        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setFont(new Font("Arial", Font.BOLD, 12));
        lblUsuario.setForeground(new Color(45, 45, 45));
        lblUsuario.setBounds(150, 185, 110, 20);

        panel.add(lblUsuario);

        // CAMPO USUARIO
        txtUsuario = new JTextField();
        txtUsuario.setBounds(270, 180, 180, 45);

        panel.add(txtUsuario);

        // ICONO USUARIO
        JLabel iconoUsuario = new JLabel(new IconoUsuario());
        iconoUsuario.setBounds(125, 185, 20, 20);

        panel.add(iconoUsuario);

        // ETIQUETA CONTRASEÑA
        JLabel lblPassword = new JLabel("Contraseña:");
        lblPassword.setFont(new Font("Arial", Font.BOLD, 12));
        lblPassword.setForeground(new Color(45, 45, 45));
        lblPassword.setBounds(150, 245, 110, 20);

        panel.add(lblPassword);

        // CAMPO CONTRASEÑA
        txtPassword = new JPasswordField();
        txtPassword.setBounds(270, 240, 180, 45);

        panel.add(txtPassword);

        // ICONO CANDADO
        JLabel iconoCandado = new JLabel(new IconoCandado());
        iconoCandado.setBounds(125, 245, 20, 20);

        panel.add(iconoCandado);

        // BOTÓN INGRESAR
        btnIngresar = new JButton("Ingresar");

        btnIngresar.setBounds(270, 300, 180, 45);
        btnIngresar.setBackground(new Color(47, 139, 190));
        btnIngresar.setForeground(Color.WHITE);
        btnIngresar.setFont(new Font("Arial", Font.BOLD, 12));
        btnIngresar.setFocusable(false);

        panel.add(btnIngresar);

        // BOTÓN REGISTRO
        btnRegistrar = new JButton("¿No tienes cuenta? Regístrate");

        btnRegistrar.setBounds(245, 360, 220, 30);
        btnRegistrar.setFont(new Font("Arial", Font.PLAIN, 9));
        btnRegistrar.setForeground(new Color(47, 139, 190));

        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setCursor(
                new Cursor(Cursor.HAND_CURSOR)
        );

        panel.add(btnRegistrar);

        // EVENTO BOTÓN INGRESAR
        btnIngresar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                iniciarSesion();

            }
        });

        // EVENTO BOTÓN REGISTRO
        btnRegistrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                FormularioRegistro registro =
                        new FormularioRegistro();

                registro.setVisible(true);

                dispose();
            }
        });
    }

    // MÉTODO PARA INICIAR SESIÓN
    private void iniciarSesion() {

        String usuario =
                txtUsuario.getText().trim();

        String password =
                new String(txtPassword.getPassword());

        // VALIDAR CAMPOS VACÍOS
        if (usuario.isEmpty() || password.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Complete todos los campos.",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        // USUARIO DE PRUEBA
        if (usuario.equals("admin")
                && password.equals("1234")) {

            JOptionPane.showMessageDialog(
                    this,
                    "Inicio de sesión correcto.",
                    "Bienvenido",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "Usuario o contraseña incorrectos.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    // MÉTODO PRINCIPAL
    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                () -> {

                    LoginGrafico login =
                            new LoginGrafico();

                    login.setVisible(true);
                }
        );
    }

    // =====================================================
    // ICONO DE SEGURIDAD
    // =====================================================

    static class IconoSeguridad implements Icon {

        public int getIconWidth() {
            return 100;
        }

        public int getIconHeight() {
            return 100;
        }

        public void paintIcon(
                Component c,
                Graphics g,
                int x,
                int y) {

            Graphics2D g2 =
                    (Graphics2D) g.create();

            g2.setRenderingHint(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON
            );

            // CÍRCULO AZUL
            g2.setColor(new Color(42, 67, 145));

            g2.fillOval(
                    x + 5,
                    y + 5,
                    90,
                    90
            );

            // CABEZA
            g2.setColor(new Color(245, 120, 70));

            g2.fillOval(
                    x + 36,
                    y + 20,
                    18,
                    23
            );

            // CUERPO
            g2.fillOval(
                    x + 20,
                    y + 43,
                    48,
                    35
            );

            // CANDADO
            g2.setColor(new Color(255, 196, 45));

            g2.fillRoundRect(
                    x + 55,
                    y + 44,
                    28,
                    34,
                    6,
                    6
            );

            // ARCO DEL CANDADO
            g2.setColor(new Color(90, 60, 35));

            g2.setStroke(
                    new BasicStroke(4)
            );

            g2.drawArc(
                    x + 59,
                    y + 29,
                    20,
                    30,
                    0,
                    180
            );

            g2.dispose();
        }
    }

    // =====================================================
    // ICONO USUARIO
    // =====================================================

    static class IconoUsuario implements Icon {

        public int getIconWidth() {
            return 20;
        }

        public int getIconHeight() {
            return 20;
        }

        public void paintIcon(
                Component c,
                Graphics g,
                int x,
                int y) {

            Graphics2D g2 =
                    (Graphics2D) g.create();

            g2.setRenderingHint(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON
            );

            // CABEZAS
            g2.setColor(new Color(60, 180, 75));

            g2.fillOval(
                    x + 7,
                    y,
                    7,
                    7
            );

            g2.setColor(new Color(245, 120, 70));

            g2.fillOval(
                    x + 2,
                    y + 3,
                    7,
                    7
            );

            // CUERPOS
            g2.fillOval(
                    x,
                    y + 9,
                    12,
                    9
            );

            g2.setColor(new Color(50, 130, 210));

            g2.fillOval(
                    x + 7,
                    y + 8,
                    11,
                    10
            );

            g2.dispose();
        }
    }

    // =====================================================
    // ICONO CANDADO
    // =====================================================

    static class IconoCandado implements Icon {

        public int getIconWidth() {
            return 20;
        }

        public int getIconHeight() {
            return 20;
        }

        public void paintIcon(
                Component c,
                Graphics g,
                int x,
                int y) {

            Graphics2D g2 =
                    (Graphics2D) g.create();

            g2.setRenderingHint(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON
            );

            // CUERPO
            g2.setColor(new Color(20, 160, 230));

            g2.fillRoundRect(
                    x + 4,
                    y + 7,
                    12,
                    11,
                    3,
                    3
            );

            // ARCO
            g2.setColor(new Color(20, 130, 210));

            g2.setStroke(
                    new BasicStroke(2)
            );

            g2.drawArc(
                    x + 6,
                    y + 2,
                    8,
                    10,
                    0,
                    180
            );

            g2.dispose();
        }
    }
}