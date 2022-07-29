import java.awt.*;
import javax.swing.*;

public class Main extends JFrame{
    JPanel principal;
    MenuBar menu;
    JLabel logo;

    public Main(){
        Dimension tamaño = new Dimension();
        tamaño.height = (int) (Toolkit.getDefaultToolkit().getScreenSize().height / 1.5);
        tamaño.width = (int) (Toolkit.getDefaultToolkit().getScreenSize().width / 1.5);
        this.setSize(tamaño);
        this.setTitle("MYL");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        inicializarComp();
    }

    private void inicializarComp() {
        //MenuBar
        menu = new MenuBar();
        this.setJMenuBar(menu.setJMenuBar());
        //PanelPrincipal
        principal = new JPanel();
        principal.setLayout(new BorderLayout());
        principal.setBackground(new Color(191,175,161));
        this.add(principal, BorderLayout.CENTER);
        //Logo
        logo = new JLabel();
        logo.setOpaque(false);
        logo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/logo.png")));
        principal.add(logo);
    }
}