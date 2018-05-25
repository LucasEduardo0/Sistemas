package exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class RealizarPedidos {

	public RealizarPedidos() {

		//JFrame
		JFrame realizarPedido = new JFrame("Realizar Pedido");
		realizarPedido.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		realizarPedido.setSize(700, 700);
		realizarPedido.setLocationRelativeTo(null);
		realizarPedido.setLayout(null);
		
		//Componentes para realizar o pedido
		JLabel nomeCliente = new JLabel("Seu nome completo");
		nomeCliente.setBounds(330, 10, 120, 20);
		JLabel quantidade = new JLabel("Quantidade");
		quantidade.setBounds(330, 40, 120, 20);
		JTextField nomeClienteResposta = new JTextField();
		nomeClienteResposta.setBounds(450, 10, 200, 20);
		JTextField quantidadeResposta = new JTextField();
		quantidadeResposta.setBounds(450, 40, 200, 20);
		JButton botao = new JButton("Comfirmar Pedido");
		botao.setBounds(390, 90, 150, 30);
		JButton sair = new JButton("Sair");
		sair.setBounds(390, 120, 150, 30);
		
		// Instanciar um objeto da classe Ação	
		Acao a = new Acao();
		
		// JTable
		JTable tabela = new JTable(a.listarProdutos());
		
		// JScrollPane
		JScrollPane barra = new JScrollPane(tabela);
		barra.setBounds(20, 10, 300, 200);
		
		//JTable
		JTable tabela2 = new JTable(a.listarProdutoPedido());
		
		//JScrollPane
		JScrollPane barra2 = new JScrollPane(tabela2);
		barra2.setBounds(20, 300, 645, 200);
		
		//Ação tabela
		tabela.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {

				//Obter linha
				int linha = tabela.getSelectedRow();
				
				//Obter os dados
				String nomeProduto = tabela.getValueAt(linha, 0).toString();
				double valorProduto = Double.parseDouble(tabela.getValueAt(linha, 1).toString());
				
				String texto = nomeProduto+", ";
					   texto += valorProduto;	
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		//Ação botão sair
		sair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Fechar formulário atual
				realizarPedido.dispose();
				
				//Chamar Principal
				Principal p = new Principal();
				
			}
		});
		
		//Add ao JFrame
		realizarPedido.add(nomeCliente);
		realizarPedido.add(quantidade);
		realizarPedido.add(nomeClienteResposta);
		realizarPedido.add(quantidadeResposta);
		realizarPedido.add(botao);
		realizarPedido.add(sair);
		realizarPedido.add(barra);
		realizarPedido.add(barra2);
		
		//Tornar visivel
		realizarPedido.setVisible(true);
		
		
		
		
		
	}

}
