package br.com.jan1ooo.calc.visao;

import javax.swing.*;
import java.awt.*;

public class Botao extends JButton {

    public Botao(String texto, Color cor){
        setText(texto);
        setOpaque(true);
        setBackground(cor);
        setForeground(Color.WHITE);
        setFont(new Font("courier", Font.PLAIN, 15));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
