package App;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import Productos.*;
import Ventas.*;
import Consultas.*;
import Reportes.*;
import Ajustes.*;
import Catalogo.*;

public class MainBase extends JFrame{
    protected JPanel principal;
    protected MenuBar menu;
    protected JLabel logo;

    public MainBase(String nombre){
        Dimension tamaño = new Dimension();
        tamaño.height = (int) (Toolkit.getDefaultToolkit().getScreenSize().height / 1.5) + 60;
        tamaño.width = (int) (Toolkit.getDefaultToolkit().getScreenSize().width / 1.5) + 10;
        tamaño.height = 720;
        tamaño.width = 1080;
        this.setSize(tamaño);
        this.setTitle("MYL" + nombre);
        //this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        inicializarComp();
        inicializarAcciones();
    }

    private void inicializarComp() {
        //MenuBar
        menu = new MenuBar();
        this.setJMenuBar(menu.setJMenuBar());
        //PanelPrincipal
        principal = new JPanel();
        principal.setBounds(0, 0, this.getWidth() - 10, this.getHeight() - 60);
        principal.setLayout(null);
        principal.setBackground(new Color(191,175,161));
        this.add(principal);
        //Logo
        logo = new JLabel();
        logo.setOpaque(false);
        logo.setSize(500, 500);
        ImageIcon image = new ImageIcon(getClass().getResource("/Imagenes/logoOpacidad.png"));
        ImageIcon icon = new ImageIcon(
            image.getImage().getScaledInstance(
                logo.getWidth(), 
                logo.getHeight(), 
                Image.SCALE_SMOOTH
            )
        );
        logo.setIcon(icon);
        int logoX, logoY = 0;
        logoY = (int)((principal.getHeight() / 2) - 250);
        logoX = (int)((principal.getWidth() / 2) - 250);
        logo.setLocation(logoX, logoY);
        principal.add(logo);
    }

    private void inicializarAcciones() {
        //Catalogo
        menu.clientes.addActionListener((ActionEvent e) -> {
            Clientes x = new Clientes(" - Clientes");
            x.setVisible(true);
            habilitar(x.menu);
            x.menu.clientes.setEnabled(false);
            dispose();
        });
        menu.proveedores.addActionListener((ActionEvent e) -> {
            Proveedores x = new Proveedores(" - Proveedores");
            x.setVisible(true);
            habilitar(x.menu);
            x.menu.proveedores.setEnabled(false);
            dispose();
        });
        menu.departamentos.addActionListener((ActionEvent e) -> {
            Departamentos x = new Departamentos(" - Departamentos");
            x.setVisible(true);
            habilitar(x.menu);
            x.menu.departamentos.setEnabled(false);
            dispose();
        });
        //Productos
        menu.productos.addActionListener((ActionEvent e) -> {
            Productos x = new Productos(" - Productos");
            x.setVisible(true);
            habilitar(x.menu);
            x.menu.productos.setEnabled(false);
            dispose();
        });
        menu.precios.addActionListener((ActionEvent e) -> {
            Precios x = new Precios(" - Precios");
            x.setVisible(true);
            habilitar(x.menu);
            x.menu.precios.setEnabled(false);
            dispose();
        });
        menu.grupos.addActionListener((ActionEvent e) -> {
            Grupos x = new Grupos(" - Grupos");
            x.setVisible(true);
            habilitar(x.menu);
            x.menu.grupos.setEnabled(false);
            dispose();
        });
        menu.compras.addActionListener((ActionEvent e) -> {
            Compras x = new Compras(" - Compras");
            x.setVisible(true);
            habilitar(x.menu);
            x.menu.compras.setEnabled(false);
            dispose();
        });
        //Ventas
        menu.ventas.addActionListener((ActionEvent e) -> {
            Ventas x = new Ventas(" - Ventas");
            x.setVisible(true);
            habilitar(x.menu);
            x.menu.ventas.setEnabled(false);
            dispose();
        });
        menu.abonos.addActionListener((ActionEvent e) -> {
            Abonos x = new Abonos(" - Abonos");
            x.setVisible(true);
            habilitar(x.menu);
            x.menu.abonos.setEnabled(false);
            dispose();
        });
        //Consultas
        menu.clientesConsulta.addActionListener((ActionEvent e) -> {
            ClientesConsulta x = new ClientesConsulta(" - Consulta de Clientes");
            x.setVisible(true);
            habilitar(x.menu);
            x.menu.clientesConsulta.setEnabled(false);
            dispose();
        });
        menu.productosConsulta.addActionListener((ActionEvent e) -> {
            ProductosConsulta x = new ProductosConsulta(" - Consulta de Productos");
            x.setVisible(true);
            habilitar(x.menu);
            x.menu.productosConsulta.setEnabled(false);
            dispose();
        });
        //Reportes
        menu.reportes.addActionListener((ActionEvent e) -> {
            Reportes x = new Reportes(" - Reportes");
            x.setVisible(true);
            habilitar(x.menu);
            x.menu.reportes.setEnabled(false);
            dispose();
        });
        //Ajustes
        menu.impresora.addActionListener((ActionEvent e) -> {
            Impresora x = new Impresora(" -Ajustes Impresora");
            x.setVisible(true);
            habilitar(x.menu);
            x.menu.impresora.setEnabled(false);
            dispose();
        });
        menu.tickets.addActionListener((ActionEvent e) -> {
            Tickets x = new Tickets(" - Tickets");
            x.setVisible(true);
            habilitar(x.menu);
            x.menu.tickets.setEnabled(false);
            dispose();
        });
    }

    private void habilitar(MenuBar x){
        //Catalogo
        x.clientes.setEnabled(true);
        x.departamentos.setEnabled(true);
        x.proveedores.setEnabled(true);
        //Productos
        x.compras.setEnabled(true);
        x.grupos.setEnabled(true);
        x.precios.setEnabled(true);
        x.productos.setEnabled(true);
        //Ventas
        x.ventas.setEnabled(true);
        x.abonos.setEnabled(true);
        //Consultas
        x.clientesConsulta.setEnabled(true);
        x.productosConsulta.setEnabled(true);
        //Reportes
        x.reportes.setEnabled(true);
        //Ajustes
        x.impresora.setEnabled(true);
        x.tickets.setEnabled(true);
    }
}