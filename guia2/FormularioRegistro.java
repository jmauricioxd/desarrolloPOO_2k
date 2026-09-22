import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioRegistro extends JFrame {

    private JTextField txtUsuario;
    private JTextField txtCorreo;
    private JPasswordField txtPassword;
    private JPasswordField txtConfirmarPassword;

    private JButton btnRegistrar;
    private JButton btnVolverLogin;

    public FormularioRegistro() {

        // CONFIGURACIÓN DE LA VENTANA
        setTitle("Crear Nueva Cuenta");

        // MEDIDAS INDICADAS EN LA ACTIVIDAD
        setSize(400, 480);

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        // CENTRAR VENTANA
        setLocationRelativeTo(null);

        // NO PERMITIR CAMBIAR TAMAÑO
        setResizable(false);

        // PANEL PRINCIPAL
        JPanel panel = new JPanel();

        // PERMITIR POSICIONES EXACTAS
        panel.setLayout(null);

        // FONDO GRIS CLARO
        panel.setBackground(
                new Color(245, 245, 245)
        );

        add(panel);

        // =================================================
        // TÍTULO
        // =================================================

        JLabel lblTitulo = new JLabel(
                "REGISTRO DE USUARIO",
                SwingConstants.CENTER
        );

        lblTitulo.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        18
                )
        );

        lblTitulo.setForeground(
                new Color(45, 45, 45)
        );

        lblTitulo.setBounds(
                70,
                20,
                260,
                30
        );

        panel.add(lblTitulo);

        // =================================================
        // USUARIO
        // =================================================

        JLabel lblUsuario = new JLabel(
                "Usuario:"
        );

        lblUsuario.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        12
                )
        );

        lblUsuario.setForeground(
                new Color(45, 45, 45)
        );

        lblUsuario.setBounds(
                50,
                70,
                280,
                20
        );

        panel.add(lblUsuario);

        txtUsuario = new JTextField();

        txtUsuario.setBounds(
                50,
                95,
                280,
                30
        );

        panel.add(txtUsuario);

        // =================================================
        // CORREO
        // =================================================

        JLabel lblCorreo = new JLabel(
                "Correo Electrónico:"
        );

        lblCorreo.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        12
                )
        );

        lblCorreo.setForeground(
                new Color(45, 45, 45)
        );

        lblCorreo.setBounds(
                50,
                130,
                280,
                20
        );

        panel.add(lblCorreo);

        txtCorreo = new JTextField();

        txtCorreo.setBounds(
                50,
                155,
                280,
                30
        );

        panel.add(txtCorreo);

        // =================================================
        // CONTRASEÑA
        // =================================================

        JLabel lblPassword = new JLabel(
                "Contraseña:"
        );

        lblPassword.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        12
                )
        );

        lblPassword.setForeground(
                new Color(45, 45, 45)
        );

        lblPassword.setBounds(
                50,
                190,
                280,
                20
        );

        panel.add(lblPassword);

        txtPassword = new JPasswordField();

        txtPassword.setBounds(
                50,
                215,
                280,
                30
        );

        panel.add(txtPassword);

        // =================================================
        // CONFIRMAR CONTRASEÑA
        // =================================================

        JLabel lblConfirmar = new JLabel(
                "Confirmar Contraseña:"
        );

        lblConfirmar.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        12
                )
        );

        lblConfirmar.setForeground(
                new Color(45, 45, 45)
        );

        lblConfirmar.setBounds(
                50,
                250,
                280,
                20
        );

        panel.add(lblConfirmar);

        txtConfirmarPassword =
                new JPasswordField();

        txtConfirmarPassword.setBounds(
                50,
                275,
                280,
                30
        );

        panel.add(txtConfirmarPassword);

        // =================================================
        // BOTÓN GUARDAR CUENTA
        // =================================================

        btnRegistrar =
                new JButton("Guardar Cuenta");

        btnRegistrar.setBounds(
                50,
                330,
                280,
                35
        );

        // COLOR VERDE
        btnRegistrar.setBackground(
                new Color(45, 130, 55)
        );

        // TEXTO BLANCO
        btnRegistrar.setForeground(
                Color.WHITE
        );

        btnRegistrar.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        12
                )
        );

        btnRegistrar.setFocusable(false);

        panel.add(btnRegistrar);

        // =================================================
        // BOTÓN VOLVER AL LOGIN
        // =================================================

        btnVolverLogin =
                new JButton(
                        "¿Ya tienes cuenta? Inicia Sesión"
                );

        btnVolverLogin.setBounds(
                85,
                375,
                230,
                30
        );

        btnVolverLogin.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        11
                )
        );

        btnVolverLogin.setForeground(
                new Color(35, 120, 210)
        );

        // QUITAR FONDO
        btnVolverLogin.setContentAreaFilled(
                false
        );

        // QUITAR BORDE
        btnVolverLogin.setBorderPainted(
                false
        );

        // MANITA DEL MOUSE
        btnVolverLogin.setCursor(
                new Cursor(
                        Cursor.HAND_CURSOR
                )
        );

        panel.add(btnVolverLogin);

        // =================================================
        // EVENTO GUARDAR
        // =================================================

        btnRegistrar.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(
                            ActionEvent e) {

                        registrarUsuario();
                    }
                }
        );

        // =================================================
        // EVENTO VOLVER AL LOGIN
        // =================================================

        btnVolverLogin.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(
                            ActionEvent e) {

                        LoginGrafico login =
                                new LoginGrafico();

                        login.setVisible(true);

                        // CERRAR REGISTRO
                        dispose();
                    }
                }
        );
    }

    // =====================================================
    // MÉTODO REGISTRAR USUARIO
    // =====================================================

    private void registrarUsuario() {

        // OBTENER DATOS
        String usuario =
                txtUsuario.getText().trim();

        String correo =
                txtCorreo.getText().trim();

        String pass =
                new String(
                        txtPassword.getPassword()
                );

        String confirmPass =
                new String(
                        txtConfirmarPassword
                                .getPassword()
                );

        // =================================================
        // VALIDAR CAMPOS VACÍOS
        // =================================================

        if (
                usuario.isEmpty()
                || correo.isEmpty()
                || pass.isEmpty()
                || confirmPass.isEmpty()
        ) {

            JOptionPane.showMessageDialog(
                    this,
                    "Complete todos los campos.",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        // =================================================
        // COMPROBAR CONTRASEÑAS
        // =================================================

        if (!pass.equals(confirmPass)) {

            JOptionPane.showMessageDialog(
                    this,
                    "Las contraseñas no coinciden.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );

            return;
        }

        // =================================================
        // REGISTRO CORRECTO
        // =================================================

        JOptionPane.showMessageDialog(
                this,
                "Usuario creado correctamente.",
                "Registro exitoso",
                JOptionPane.INFORMATION_MESSAGE
        );

        // LIMPIAR CAMPOS
        txtUsuario.setText("");

        txtCorreo.setText("");

        txtPassword.setText("");

        txtConfirmarPassword.setText("");
    }

    // =====================================================
    // MÉTODO MAIN
    // =====================================================

    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                () -> {

                    FormularioRegistro registro =
                            new FormularioRegistro();

                    registro.setVisible(true);
                }
        );
    }
}