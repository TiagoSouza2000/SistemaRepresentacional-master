package br.sc.senac.mcap.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class telaCadastro extends JFrame {
    private JLabel lblNome;
    private JTextField txtDataNascimento;
    private JTextField txtNome;
    private JTextField txtCurso;
    private JLabel lblCurso;
    private JLabel lblFase;
    private JTextField txtFase;
    private JButton btnCadastrar;
    private JPanel telaCadastro;
    private JButton btnVoltar;
    final String URL = "jdbc:mysql://localhost:3306/mca";
    final String USER = "root";
    final String PASSWORD = "root99";
    final String INSERIR = "INSERT INTO aluno(aluno_nome, aluno_dt_nasc, aluno_curso, aluno_fase) VALUES (?,?,?,?)";

    public telaCadastro() {
        iniciarComponentes();
        addListener();
    }

    public void iniciarComponentes() {
        setTitle("Cadastro");
        setMinimumSize(new Dimension(450, 474));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(telaCadastro);
        setVisible(true);
    }

    public void addListener() {
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrar();
            }
        });

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginView lg = new LoginView();
                dispose();
            }
        });
    }

    private void cadastrar() {
        String nome = txtNome.getText();
        String dataNasc = txtDataNascimento.getText();
        String curso = txtCurso.getText();
        String fase = txtFase.getText();

        addUsuario(nome, dataNasc, curso, fase);
    }

    private void addUsuario(String nome, String dataNasc, String curso, String fase) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado");

            final PreparedStatement stmtInserir;
            stmtInserir = connection.prepareStatement(INSERIR);

            stmtInserir.setString(1, nome);
            stmtInserir.setString(2, dataNasc);
            stmtInserir.setString(3, curso);
            stmtInserir.setString(4, fase);

            stmtInserir.executeUpdate();
            System.out.println("Dados inseridos!");
            JOptionPane.showMessageDialog(btnCadastrar,"Dados Inseridos");
            txtNome.setText("");
            txtCurso.setText("");
            txtFase.setText("");
            txtDataNascimento.setText("");

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        br.sc.senac.mcap.view.telaCadastro tela = new telaCadastro();
    }
}