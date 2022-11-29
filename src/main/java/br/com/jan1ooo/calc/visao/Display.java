package br.com.jan1ooo.calc.visao;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel {

    private final JLabel label;

    public Display(){
        setBackground(new Color(49, 49, 50));
        label = new JLabel("123913");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("courier", Font.PLAIN, 30));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 20));
        add(label);
    }
}
