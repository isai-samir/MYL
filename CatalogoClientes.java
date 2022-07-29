import java.awt.*;

import javax.swing.*;

public class CatalogoClientes extends JFrame{
    Dimension tamaño;
    JPanel principal;
    MenuBar menu;
    JLabel logo;

    public CatalogoClientes(){
        tamaño = new Dimension();
        tamaño.height = (int) (Toolkit.getDefaultToolkit().getScreenSize().height / 1.5);
        tamaño.width = (int) (Toolkit.getDefaultToolkit().getScreenSize().width / 1.5);
        System.out.println(tamaño);
        this.setTitle("MYL");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(tamaño);
        setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        inicializarComp();
    }

    private void inicializarComp() {
        //PanelPrincipal
        principal = new JPanel();
        principal.setBackground(new Color(191,175,161));
        this.add(principal, BorderLayout.CENTER);
        //PanelesBordes
        JPanel norte = new JPanel();
        norte.setBackground(Color.red);
        JPanel sur = new JPanel();
        sur.setBackground(Color.red);
        JPanel este = new JPanel();
        este.setBackground(Color.red);
        JPanel oeste = new JPanel();
        oeste.setBackground(Color.red);
        this.add(norte, BorderLayout.NORTH);
        this.add(este, BorderLayout.EAST);
        this.add(oeste, BorderLayout.WEST);
        this.add(sur, BorderLayout.SOUTH);
        //Menu
        //MenuBar
        menu = new MenuBar();
        this.setJMenuBar(menu.setJMenuBar());
        //Logo
        logo = new JLabel();
        logo.setSize(50,90);
        logo.setOpaque(false);
        logo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/logo.png")));
        principal.add(logo, BorderLayout.EAST);
       
    }
}
