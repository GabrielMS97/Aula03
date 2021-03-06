package br.ufjf.dcc171;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class JanelaTexto extends JFrame {

    private final JLabel etiqueta1;
    private final JLabel etiqueta2;
    private final JTextField texto;

    public JanelaTexto() throws HeadlessException {
        super("Janela Texto");
        etiqueta1 = new JLabel("Nome: ");
        etiqueta2 = new JLabel("");
        texto = new JTextField(10);
        
        setLayout((new FlowLayout()));
        add(etiqueta1);
        add(etiqueta2);
        add(texto);
        
    }
}
