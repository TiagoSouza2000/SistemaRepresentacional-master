package br.sc.senac.mcap.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Questionario2 extends JFrame{
    private JPanel jHeader;
    private JButton proximoButton;
    private JPanel Q2;
public Questionario2() {
    initComponents();
    listeners();

}


    public void initComponents(){
        setTitle("login");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Q2);
        setVisible(true);


    }
public void listeners(){
    proximoButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Questionario3 q3 = new Questionario3();
            dispose();
        }
    });
}
}
