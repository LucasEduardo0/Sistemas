package Exercicio02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormulárioEntrarSite extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public FormulárioEntrarSite() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 285, 227);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInformeSeuLogin = new JLabel("Informe seu login e sua senha");
		lblInformeSeuLogin.setForeground(Color.MAGENTA);
		lblInformeSeuLogin.setBounds(54, 11, 169, 16);
		lblInformeSeuLogin.setFont(new Font("Rockwell", Font.PLAIN, 13));
		contentPane.add(lblInformeSeuLogin);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(54, 64, 46, 14);
		contentPane.add(lblLogin);
		
		textField = new JTextField();
		textField.setBounds(137, 61, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(54, 99, 46, 14);
		contentPane.add(lblSenha);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 96, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnEntar = new JButton("Entar");
		btnEntar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(((textField.getText().equals("Google")) || (textField_1.getText().equals("soufoda")))) {
					
					FormularioGerente fg = new FormularioGerente();
					
				}
				
			}
		});
		btnEntar.setBounds(93, 141, 89, 32);
		contentPane.add(btnEntar);
	}
}
