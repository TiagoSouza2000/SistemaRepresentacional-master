package br.sc.senac.mcap.view;

import br.sc.senac.mcap.controller.LoginController;
import br.sc.senac.mcap.model.Login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class LoginView extends JFrame {
    private JPanel telaInicio;
    private JButton btnLogin;
    private JButton btnCadastrar;
    private JTextField txtLogin;
    private JPasswordField pswSenha;
    private JPanel lblLogin;
    private JLabel lblSenha;
    private JButton btnQuest;

    public LoginView() {
    initComponents();
    listeners();

}

public void initComponents(){
setTitle("login");
setSize(600,600);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setContentPane(telaInicio);
setVisible(true);


}


public void listeners(){
    btnLogin.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            String login = txtLogin.getText();
            char[] senha = pswSenha.getPassword();

            try {
                LoginController lc = new LoginController();
                ArrayList<Login> loginList = lc.buscarLoginSenha();

                for (Login l : loginList) {
                    if (l.getLogin().equalsIgnoreCase(login) &&
                            l.getSenha().equalsIgnoreCase(new String(senha))) {
                        System.out.println("Login validado");

                        Questionario1 q1 = new Questionario1();
                        dispose();

                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Verifique usuário e senha",
                                "Erro",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                System.out.println("Classe não encontrada");
            }
        }
    });

    btnCadastrar.addActionListener((new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            telaCadastro tela = new telaCadastro();
            dispose();
        }
    }));

    btnQuest.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Questionario1 q1 = new Questionario1();
            dispose();
        }
    });

}

    public static void main(String[] args) {
        LoginView tela = new LoginView();
    }
}
