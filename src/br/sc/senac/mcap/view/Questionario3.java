package br.sc.senac.mcap.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Questionario3 extends JFrame{
    private JButton proximoButton;
    private JPanel jHeader;
    private JPanel Q3;
public Questionario3() {
    listeners();
    initComponents();

}
    public void initComponents(){
        setTitle("login");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Q3);
        setVisible(true);


    }

    private void listeners(){
    proximoButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Questionario4 q4 = new Questionario4();
            dispose();
        }
    });
}
}
