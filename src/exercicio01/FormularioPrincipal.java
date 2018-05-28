package exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class FormularioPrincipal {
	
	public FormularioPrincipal() {
	
		//JFrame
		JFrame principal = new JFrame("Pricipal");
		principal.setSize(250, 250);
		principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		principal.setLocationRelativeTo(null);
		principal.setLayout(null);
	
		//JComboBox
		JComboBox<String> combo = new JComboBox<>();
		combo.addItem("Escolha uma opção");
		combo.addItem("Cadastrar Produto");
		combo.addItem("Realizar Pedido");
		combo.addItem("Histórico");
		combo.addItem("Estatísticas");
		combo.addItem("Sair");
		combo.setBounds(50, 20, 150, 30);
		
		combo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {

				if(combo.getSelectedItem().toString().equals("Cadastrar Produto")) {
					
					//Fechar formulario principal
					principal.dispose();
					
					//Chamar Cadastrar Produtos
					FormularioCadastrarProduto cp = new FormularioCadastrarProduto();
					
				}
				
				if(combo.getSelectedItem().toString().equals("Realizar Pedido")) {
					
					//Fechar formulario principa
					principal.dispose();
					
					//Chamar Realizar Pedido
					FormularioRealizarPedidos rp = new FormularioRealizarPedidos();
					
				}
				
				if(combo.getSelectedItem().toString().equals("Histórico")) {
					
					//Fechar formulario principa
					principal.dispose();
					
					//Chamar formulario histórico
					Historico h = new Historico();
					
				}
				
				if(combo.getSelectedItem().toString().equals("Estatísticas")) {
					
					//Fechar formulario principa
					principal.dispose();
					
					//Chamar formulario
					Estatisticas e = new Estatisticas();
					e.setVisible(true);
					
				}
				
			}
		});
		
		//Add JFrame
		principal.add(combo);
		
		//Tornar visível
		principal.setVisible(true);
	
	}

}