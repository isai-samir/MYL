package Herramientas;

import java.awt.event.*;

import Catalogo.Clientes;

public class EventoNumero implements KeyListener{
    Clientes cliente;

    public EventoNumero(Clientes cliente) {
        this.cliente = cliente;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        int key = e.getKeyChar();
        if (key < 48 || key > 57) {
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
    
}
