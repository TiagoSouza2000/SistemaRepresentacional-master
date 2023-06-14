package br.sc.senac.mcap.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Questionario4 extends JFrame {
    private JButton proximoButton;
    private JPanel jHeader;
    private JPanel Q4;
public Questionario4() {

    initComponents();
    listeners();

}

    public void initComponents(){
        setTitle("login");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Q4);
        setVisible(true);


    }

public void listeners(){
    proximoButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Questionario5 q5 = new Questionario5();
            dispose();
        }
    });
}
}
