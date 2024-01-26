package App;

import javax.swing.*;

public class MenuBar extends JMenuBar{
    JMenuBar menuB;
    JMenu catalogo, productosM, ventasM, consultaM, reporteM, ajustesM;
    //Catalogo
    JMenuItem clientes, proveedores, departamentos;
    //Productos
    JMenuItem productos, precios, grupos, compras;
    //Ventas
    JMenuItem ventas, abonos;
    //Consultas
    JMenuItem clientesConsulta, productosConsulta;
    //Reportes 
    JMenuItem reportes;
    //Ajustes
    JMenuItem tickets, impresora;
    
    public MenuBar(){
        inicializarComp();
    }

    private void inicializarComp() {
        //Menu
        //MenuBar
        menuB = new JMenuBar();
        //JMenu
        catalogo = new JMenu("Catalogo");
        menuB.add(catalogo);
        //Items
        clientes = new JMenuItem("Clientes");
        catalogo.add(clientes);
        proveedores = new JMenuItem("Proveedores");
        catalogo.add(proveedores);
        departamentos = new JMenuItem("Departamentos");
        catalogo.add(departamentos);
        //JMenu
        productosM = new JMenu("Productos");
        menuB.add(productosM);
        //Items
        productos = new JMenuItem("Productos");
        productosM.add(productos);
        precios = new JMenuItem("Precios");
        productosM.add(precios);
        grupos = new JMenuItem("Grupos");
        productosM.add(grupos);
        compras = new JMenuItem("Compras");
        productosM.add(compras);
        //JMenu
        ventasM = new JMenu("Ventas");
        menuB.add(ventasM);
        //Items
        ventas = new JMenuItem("Ventas");
        ventasM.add(ventas);
        abonos = new JMenuItem("Abonos");
        ventasM.add(abonos);
        //JMenu
        consultaM = new JMenu("Consulta");
        menuB.add(consultaM);
        //Items
        clientesConsulta = new JMenuItem("Clientes");
        consultaM.add(clientesConsulta);
        productosConsulta = new JMenuItem("Productos");
        consultaM.add(productosConsulta);
        //JMenu
        reporteM = new JMenu("Reporte");
        menuB.add(reporteM);
        //Items
        reportes = new JMenuItem("Reportes");
        reporteM.add(reportes);
        //JMenu
        ajustesM = new JMenu("Ajustes");
        menuB.add(ajustesM);
        //Items
        tickets = new JMenuItem("Tickets");
        ajustesM.add(tickets);
        impresora = new JMenuItem("Impresora");
        ajustesM.add(impresora);
    }

    public JMenuBar setJMenuBar() {
        return menuB;
    }
}
