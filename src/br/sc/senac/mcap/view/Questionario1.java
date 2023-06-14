package br.sc.senac.mcap.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Questionario1 extends JFrame{
    private JPanel Q1;
    private JPanel jHeader;
    private JButton proximoButton;
public Questionario1() {
    initComponents();
    listeners();
}


    public void initComponents(){
        setTitle("login");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Q1);
        setVisible(true);


    }
 public void listeners(){
    proximoButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Questionario2 q2 = new Questionario2();
            dispose();

        }
    });
}
}
