package exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Principal {

	public Principal() {

		//JFrame
		JFrame principal = new JFrame("Principal");
		principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		principal.setSize(300, 500);
		principal.setLocationRelativeTo(null);
		principal.setLayout(null);
		
		//JComboBox
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(50, 10, 170, 20);
		combo.addItem("Selecione uma opção");
		combo.addItem("Cadastrar Produtos");
		combo.addItem("Realizar Pedido");
		combo.addItem("Histórico");
		combo.addItem("EstaTísticas");
		combo.addItem("Sair");
		
		//Ação do combo
		combo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if(combo.getSelectedItem().toString().equals("Cadastrar Produtos")){
					
					// Fechar formulário atual
					principal.dispose();
					
					//Chamar Cadastrar Produtos
					CadastrarProdutos cp = new CadastrarProdutos();
					
				}
				
				if(combo.getSelectedItem().toString().equals("Realizar Pedido")){
					
					// Fechar formulário atual
					principal.dispose();
					
					//Chamar Realizar Pedido
					RealizarPedidos rp = new RealizarPedidos();
					
				}
				
				if(combo.getSelectedItem().toString().equals("Histórico")){
					
					// Fechar formulário atual
					principal.dispose();
					
					//Chamar Histórico
					Historico h = new Historico();
					
				}
				
				if(combo.getSelectedItem().toString().equals("Sair")){
					
					//Fechar tudo
					principal.dispose();
					
				}
			}
		});
		
		//Add ao JFrame
		principal.add(combo);
		
		//Tornar visivel
		principal.setVisible(true);
		
		
	}

}
