package Catalogo;
import App.*;
import Catalogo.EventosClientes.EventoTelefono;
import Herramientas.*;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.Color;
import java.awt.event.*;

//Action event en JTextField al presional enter
//Doble clic en un elemento de lista
public class Clientes extends MainBase{
    private JLabel nombreJL, apellidoJL, telefonoJL, municipioJL, localidadJL, calleJL, numeroCalleJL, maxCreditoJL, idClienteJL;
    private JTextField idTF, nombreTF, apellidoTF, municipioTF, localidadTF, calleTF, numeroCalleTF, maxCreditoTF;
    public JTextField telefonoTF;
    private JButton nuevoBT, borrarBT, buscarBT, guardarBT;    
    private JComboBox<String> menuDesplegable;
    private Fuente fuente;
    private Border borde;
    private JPanel panelI, panelDI, panelDS;

    public Clientes(String nombre) {
        super(nombre);
        initPaneles();
        initPI();
        initPD();
    }


    private void initPaneles() {
        //Panel Izquierdo
        panelI = new JPanel();
        panelI.setLayout(null);
        panelI.setOpaque(true);
        panelI.setBackground(new Color(0, 0, 0, 30));
        panelI.setBounds(50, 50, 600, 550);
        principal.add(panelI);
        //Panel Derecho Inferior
        panelDI = new JPanel();
        panelDI.setLayout(null);
        panelDI.setOpaque(true); 
        panelDI.setBackground(new Color(0, 0, 0, 30));
        panelDI.setBounds(720, 200, 300, 400);
        principal.add(panelDI);
        //Panel Derecho Superior
        panelDS = new JPanel();
        panelDS.setLayout(null);
        panelDS.setOpaque(true); 
        panelDS.setBackground(new Color(0, 0, 0, 30));
        panelDS.setBounds(720, 50, 300, 100);
        principal.add(panelDS);
    }


    public void initPI() {
        borde = LineBorder.createBlackLineBorder();
        fuente = new Fuente(); 
        //Inicializacion Jlabel ID
        idClienteJL = new JLabel("ID");
        idClienteJL.setBounds(20, 20, 50, 30);
        idClienteJL.setFont(fuente.getFont("purisa",1, 20));
        idClienteJL.setBorder(borde);
        panelI.add(idClienteJL);
        //Inicializacion Jlabel Nombre
        nombreJL  = new JLabel("Nombre");
        nombreJL.setBounds(20, 80, 100, 30);
        nombreJL.setFont((new Fuente()).getFont(0, 20));
        nombreJL.setBorder(borde);
        panelI.add(nombreJL); 
        //Inicializacion Jlabel Apellidos
        apellidoJL  = new JLabel("Apellido");
        apellidoJL.setBounds(20, 140, 100, 30);
        apellidoJL.setFont(fuente.getFont("arial",0, 20));
        apellidoJL.setBorder(borde);
        panelI.add(apellidoJL);
        //Inicializacion Jlabel Telefono
        telefonoJL  = new JLabel("Telefono");
        telefonoJL.setBounds(20, 200, 100, 30);
        telefonoJL.setFont(fuente.getFont("purisa",1, 20));
        telefonoJL.setBorder(borde);
        panelI.add(telefonoJL);
        //Inicializacion Jlabel Municipio
        municipioJL  = new JLabel("Municipio");
        municipioJL.setBounds(20, 260, 100, 30);
        municipioJL.setFont(fuente.getFont("purisa",1, 20));
        municipioJL.setBorder(borde);
        panelI.add(municipioJL);
        //Inicializacion Jlabel Localidad
        localidadJL  = new JLabel("Localidad");
        localidadJL.setBounds(20, 320, 100, 30);
        localidadJL.setFont(fuente.getFont("purisa",1, 20));
        localidadJL.setBorder(borde);
        panelI.add(localidadJL);
        //Inicializacion Jlabel Calle
        calleJL  = new JLabel("Calle");
        calleJL.setBounds(20, 380, 100, 30);
        calleJL.setFont(fuente.getFont("purisa",1, 20));
        calleJL.setBorder(borde);
        panelI.add(calleJL);
        //Inicializacion Jlabel NO.
        numeroCalleJL  = new JLabel("NO.");
        numeroCalleJL.setBounds(500, 380, 50, 30);
        numeroCalleJL.setFont(fuente.getFont("purisa",1, 20));
        numeroCalleJL.setBorder(borde);
        panelI.add(numeroCalleJL);
        //Inicializacion Jlabel Maximo Credito
        maxCreditoJL  = new JLabel("Max. Credito");
        maxCreditoJL.setBounds(20, 440, 130, 30);
        maxCreditoJL.setFont(fuente.getFont("purisa",1, 20));
        maxCreditoJL.setBorder(borde);
        panelI.add(maxCreditoJL);
        /////Inicializacion JtextArea//////
        //Inicializacion IDTF
        idTF = new JTextField();
        idTF.setBounds(200, 20, 100, 30);
        idTF.setEditable(false);
        panelI.add(idTF);
        //Inicializacion NombreTF
        nombreTF = new JTextField();
        nombreTF.setBounds(200, 80, 100, 30);
        panelI.add(nombreTF);
        //Inicializacion Apellido
        apellidoTF = new JTextField();
        apellidoTF.setBounds(200, 140, 100, 30);
        panelI.add(apellidoTF);
        //Inicializacion Telefono
        telefonoTF = new JTextField();
        telefonoTF.setBounds(200, 200, 100, 30);
        panelI.add(telefonoTF);
        
        //Inicializacion Municipio
        municipioTF = new JTextField();
        municipioTF.setBounds(200, 260, 100, 30);
        panelI.add(municipioTF);
        //Inicializacion Localidad
        localidadTF = new JTextField();
        localidadTF.setBounds(200, 320, 100, 30);
        panelI.add(localidadTF);
        //Inicializacion Calle
        calleTF = new JTextField();
        calleTF.setBounds(200, 380, 100, 30);
        panelI.add(calleTF);
        //Inicializacion No
        numeroCalleTF = new JTextField();
        numeroCalleTF.setBounds(300, 380, 100, 30);
        panelI.add(numeroCalleTF);
        //Inicializacion Credito Max
        maxCreditoTF = new JTextField();
        maxCreditoTF.setBounds(200, 440, 100, 30);
        panelI.add(maxCreditoTF);
        /////Inicializacion Botones/////
        //Inicializacion Boton Nuevo
        nuevoBT = new JButton("Nuevo");
        nuevoBT.setBounds(50, 50, 100, 50);

        ////Action Event////
        telefonoTF.addKeyListener(new EventoTelefono(this));
        numeroCalleTF.addKeyListener(new EventoNumero(this));
        nuevoBT.addActionListener((ActionEvent e)->{
            System.out.println("(f)");
        });
        panelDI.add(nuevoBT);
    }

    public void initPD() {
        //Inicializacion Botones

        //Inicializacion opciones 
        String[] opciones = {};
        menuDesplegable = new JComboBox<>(opciones);
        menuDesplegable.setBounds(25, 35, 250, 30);
        menuDesplegable.setEnabled(false);
        panelDS.add(menuDesplegable);
    }
}
