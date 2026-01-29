import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SplashScreen extends JFrame {

    public SplashScreen() {
        setTitle("Sistema de Capacitación");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(255, 255, 255));
        mainPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 102, 153), 3));

        JLabel lblBienvenido = new JLabel("BIENVENIDO", SwingConstants.CENTER);
        lblBienvenido.setFont(new Font("Arial Black", Font.BOLD, 32));
        lblBienvenido.setForeground(new Color(0, 102, 153));
        lblBienvenido.setBorder(BorderFactory.createEmptyBorder(40, 0, 20, 0));

        JLabel lblLogo = new JLabel(new ImageIcon(getClass().getResource("/logo/logo.png")));
        lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
       
        JLabel lblSistema = new JLabel("Sistema de Capacitación", SwingConstants.CENTER);
        lblSistema.setFont(new Font("Segoe UI", Font.ITALIC, 18));
        lblSistema.setForeground(new Color(100, 100, 100));
        lblSistema.setBorder(BorderFactory.createEmptyBorder(20, 0, 40, 0));

        mainPanel.add(lblBienvenido, BorderLayout.NORTH);
        mainPanel.add(lblLogo, BorderLayout.CENTER);
        mainPanel.add(lblSistema, BorderLayout.SOUTH);
        
        add(mainPanel);

        // Timer para cerrar el splash y abrir el menú principal después de 3 segundos
        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuPrincipal().setVisible(true);
                dispose();
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SplashScreen().setVisible(true);
        });
    }
}