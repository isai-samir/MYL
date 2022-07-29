import javax.swing.*;

public class MenuBar extends JMenuBar{
    JMenuBar menuB;
    JMenu catalogo, ventas;
    JMenuItem clientes, productos, ventasM;
    
    public MenuBar(){
        inicializarComp();
    }

    private void inicializarComp() {
        //Menu
        //MenuBar
        menuB = new JMenuBar();
        //Menus
        //Catalogo
        catalogo = new JMenu("Catalogo");
        menuB.add(catalogo);
        //Items
        clientes = new JMenuItem("Clientes");
        catalogo.add(clientes);
    }

    public JMenuBar setJMenuBar(){
        return menuB;
    }
}
