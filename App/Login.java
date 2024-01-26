package App;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;



public class Login extends JFrame{
    JPanel principal, pDerecho, pIzquierdo;
    JLabel logo, fondo, lUsuario, lContraseña, cerrar, titulo, logo2;
    JTextField usuario;
    JButton aceptar;
    JPasswordField contraseña;
    JSeparator separador1, separador2;
    Fuente fuente;

    public Login() {
        Dimension tamaño = new Dimension();
        tamaño.height = (int) (Toolkit.getDefaultToolkit().getScreenSize().height * .5);
        tamaño.width = (int) (Toolkit.getDefaultToolkit().getScreenSize().width * .5);
        this.setSize(tamaño);
        this.setTitle("Login");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setUndecorated(true);
        fuente = new Fuente();
        inicializarComp();
        inicializarAcciones();
    }

    private void inicializarComp() {
        /*
        ImageIcon image = new ImageIcon(getClass().getResource("/Imagenes/loginImg.png"));
        Image conversion = image.getImage();
        conversion = conversion.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(conversion);
        */
        Border border = LineBorder.createBlackLineBorder();
        //Panel Principal
        principal = new JPanel();
        principal.setBounds(0, 0, this.getWidth(), this.getHeight());
        principal.setLayout(null);
        this.add(principal);
        //Panel Izquierdo
        pIzquierdo = new JPanel();
        pIzquierdo.setBounds(0, 0, (int)(this.getWidth() * .65), this.getHeight());
        pIzquierdo.setLayout(null);
        pIzquierdo.setBackground(new Color(248, 248, 255));
        principal.add(pIzquierdo);
        //Panel Derecho
        pDerecho = new JPanel();
        pDerecho.setBounds(pIzquierdo.getWidth(), 0, (int)(this.getWidth() * .35), this.getHeight());
        pDerecho.setLayout(null);
        pDerecho.setBackground(new Color(212, 201, 191));
        principal.add(pDerecho);
        ////Fondo
        fondo = new JLabel();
        fondo.setOpaque(false);
        fondo.setSize((int)(pDerecho.getWidth() * .75), (int)(pDerecho.getHeight() * .85));
        ImageIcon image = new ImageIcon(getClass().getResource("/Imagenes/loginImg.png"));
        ImageIcon icon = new ImageIcon(
            image.getImage().getScaledInstance(
                fondo.getWidth(), 
                fondo.getHeight(), 
                Image.SCALE_SMOOTH
            )
        );
        fondo.setIcon(icon);
        int x, y = 0;
        x = (int)((pDerecho.getWidth() * .125));
        y = 0;
        fondo.setLocation(x, y);
        pDerecho.add(fondo);
        //Logo
        logo = new JLabel();
        logo.setOpaque(false);
        logo.setSize((int)(pDerecho.getWidth() * .68), (int)(pDerecho.getWidth() * .68));
        image = new ImageIcon(getClass().getResource("/Imagenes/titulo.png"));
        icon = new ImageIcon(
            image.getImage().getScaledInstance(
                logo.getWidth(), 
                logo.getHeight(), 
                Image.SCALE_SMOOTH
            )
        );
        logo.setIcon(icon);
        x = (int)((pDerecho.getWidth() * .16));
        y = (int)((pDerecho.getHeight() * .68));
        logo.setLocation(x, y);
        pDerecho.add(logo);
        //Logo Izquierdo
        logo2 = new JLabel();
        logo2.setOpaque(false);
        logo2.setSize(60, 60);
        image = new ImageIcon(getClass().getResource("/Imagenes/logo.png"));
        icon = new ImageIcon(
            image.getImage().getScaledInstance(
                logo2.getWidth(), 
                logo2.getHeight(), 
                Image.SCALE_SMOOTH
            )
        );
        logo2.setIcon(icon);
        x = (int)((pIzquierdo.getWidth() - 280) / 2);
        y = (int)(pIzquierdo.getHeight() * .1);
        logo2.setLocation(x, y);
        pIzquierdo.add(logo2);
        //Cerrar
        cerrar = new JLabel("X");
        cerrar.setBounds(0, 0, 40, 40);
        cerrar.setFont(fuente.getFont("purisa",1, 25));
        cerrar.setVerticalAlignment(SwingConstants.CENTER);
        cerrar.setHorizontalAlignment(SwingConstants.CENTER);
        cerrar.setBorder(border);
        cerrar.setOpaque(true);
        cerrar.setForeground(Color.BLACK);
        cerrar.setBackground(new Color(209, 68, 61));
        pIzquierdo.add(cerrar);
        //Label titulo
        titulo = new JLabel("Iniciar Sesion");
        x += 80;
        y += 5;
        titulo.setBounds(x, y, 200, 50);
        titulo.setFont(fuente.getFont("purisa",1, 25));
        pIzquierdo.add(titulo);
        //Label usuario
        int width = (int)(pIzquierdo.getWidth() * .8);
        lUsuario = new JLabel("Usuario");
        x = (int)(pIzquierdo.getWidth() * .15);
        y += (int)(((pIzquierdo.getHeight() - y * 2) / 2.5) - 60);
        lUsuario.setBounds(x, y, 100, 40);
        lUsuario.setFont(fuente.getFont("purisa",1, 20));
        pIzquierdo.add(lUsuario);
        //TextField usuario
        usuario = new JTextField("Ingrese su nombre de usuario");
        usuario.setForeground(Color.GRAY);
        y += 60;
        usuario.setBounds(x, y, width, 40);
        usuario.setFont(fuente.getFont("purisa",0, 16));
        usuario.setBorder(null);
        pIzquierdo.add(usuario);
        //Jseparator1
        separador1 = new JSeparator();
        separador1.setBounds(x, y + 45, width, 10);
        separador1.setOrientation(SwingConstants.HORIZONTAL);
        separador1.setBackground(Color.BLACK);
        pIzquierdo.add(separador1);
        //Label Contraseña
        y -= 100;
        y += (int)(((pIzquierdo.getHeight() - y * 2) / 2.5) *2) - 60;
        lContraseña = new JLabel("Contraseña");
        lContraseña.setBounds(x, y, 150, 40);
        lContraseña.setFont(fuente.getFont("purisa",1, 20));
        pIzquierdo.add(lContraseña);
        //TextField contraseña
        contraseña = new JPasswordField("     ");
        contraseña.setForeground(Color.GRAY);
        y += 60;
        contraseña.setBounds(x, y, width, 40);
        contraseña.setFont(fuente.getFont("purisa",0, 16));
        contraseña.setBorder(null);
        pIzquierdo.add(contraseña);
        //Jseparador2
        separador2 = new JSeparator();
        separador2.setBounds(x, y + 45, width, 10);
        separador2.setOrientation(SwingConstants.HORIZONTAL);
        separador2.setBackground(Color.BLACK);
        pIzquierdo.add(separador2);
        //Boton
        aceptar = new JButton("Aceptar");
        x = (int)(pIzquierdo.getWidth() * .65);
        aceptar.setBounds(x, (int)(pIzquierdo.getHeight() * .85), 150, 40);
        aceptar.setFont(fuente.getFont("purisa",1, 18));
        aceptar.setBackground(new Color(212, 201, 191));
        aceptar.setBorder(null);
        pIzquierdo.add(aceptar);
    }

    private void inicializarAcciones(){
        //Boton Aceptar
        aceptar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                MainBase main = new MainBase("");
                main.setVisible(true);
                dispose();
            }
        });
        //Usuario
        usuario.addFocusListener(new FocusListener(){

            @Override
            public void focusGained(FocusEvent e) {
                usuario.setForeground(Color.BLACK);
                usuario.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (usuario.getText().length() == 0) {
                    usuario.setForeground(Color.GRAY);
                    usuario.setText("Ingrese su nombre de usuario");
                }
            }
        });
        //Contraseña
        contraseña.addFocusListener(new FocusListener(){

            @Override
            public void focusGained(FocusEvent e) {
                contraseña.setForeground(Color.BLACK);
                contraseña.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (String.valueOf(contraseña.getPassword()).length() == 0) {
                    contraseña.setText("     ");
                    contraseña.setForeground(Color.GRAY
                    );
                }
            }
            
        });
        //Boton cerrar
        cerrar.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                cerrar.setBackground(new Color(173, 38, 25));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                cerrar.setBackground(new Color(209, 68, 61));
            }

            public void mouseEntered(MouseEvent e) {}

            public void mouseExited(MouseEvent e) {}
        });
    }
}
