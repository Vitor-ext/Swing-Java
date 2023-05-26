/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;

/**
 *
 * @author ❣🚀❣ Vitor de Jesus ❣🚀❣
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;    // Importa biblioteca para utilizar interface grafica

public class Interface extends JFrame {

    private JTextField tfLogin;
    private JLabel lbSenha;
    private JLabel lbLogin;
    private JButton btLogar;
    private JButton btCancelar;
    private JPasswordField pfSenha;
    private static Interface frame;

    public Interface() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Login no Sistema");
        setBounds(0, 0, 450, 250);
        setLayout(null);
        tfLogin = new JTextField(5);
        pfSenha = new JPasswordField(5);
        lbSenha = new JLabel("Senha:");
        lbLogin = new JLabel("Login:");
        btLogar = new JButton("Logar");
        btCancelar = new JButton("Cancelar");
        tfLogin.setBounds(180, 30, 120, 25);
        lbLogin.setBounds(120, 30, 80, 25);
        lbSenha.setBounds(120, 75, 80, 25);
        pfSenha.setBounds(180, 75, 120, 25);
        btLogar.setBounds(120, 120, 100, 25);
        btCancelar.setBounds(225, 120, 100, 25);
        add(tfLogin);
        add(lbSenha);
        add(lbLogin);
        add(btLogar);
        add(btCancelar);
        add(pfSenha);
    }

    private void definirEventos() {
        btLogar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String senha = String.valueOf(pfSenha.getPassword());
                if (tfLogin.getText().equals("Aluno") && senha.equals("Senai")) {
                    frame.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Login realizado com sucesso !!");
                } else {
                    JOptionPane.showMessageDialog(null, "Login ou Senha Incorretos !!");
                }
            }

        });

        btCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frame = new Interface();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation((tela.width - frame.getSize().width) / 2,
                    (tela.height - frame.getSize().height
                )/2);
                frame.setVisible(true);
            }
        });
    }
}
