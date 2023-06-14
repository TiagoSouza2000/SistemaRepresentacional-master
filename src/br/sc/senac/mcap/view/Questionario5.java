package br.sc.senac.mcap.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Questionario5 extends JFrame{
    private JPanel Q2;
    private JButton proximoButton;
    private JPanel jHeader;
    private JPanel Q5;
public Questionario5() {

    initComponents();
    listeners();

}

    public void initComponents(){
        setTitle("login");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Q5);
        setVisible(true);


    }

public void listeners(){
    proximoButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}
}
