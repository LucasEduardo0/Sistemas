package exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class CadastrarProdutos {

	public static void main(String[] args) {

		//JLabel
		JFrame cadastrarProdutos = new JFrame("Cadastrar Produtos");
		cadastrarProdutos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cadastrarProdutos.setSize(500, 420);
		cadastrarProdutos.setLocationRelativeTo(null);
		cadastrarProdutos.setLayout(null);
		
		//Componentes para realizar o cadastro
		JLabel nomeProduto = new JLabel("Nome do produto");
		nomeProduto.setBounds(80, 10, 120, 20);
		JLabel valorProduto = new JLabel("Valor do produto");
		valorProduto.setBounds(80, 40, 120, 20);
		JTextField nomeProdutoResposta = new JTextField();
		nomeProdutoResposta.setBounds(220, 10, 200, 20);
		JTextField valorProdutoResposta = new JTextField();
		valorProdutoResposta.setBounds(220, 40, 200, 20);
		JButton botao = new JButton("Cadastrar");
		botao.setBounds(180, 110, 150, 30);
		
		//Intanciar um objeto da classe ação
		Acao a = new Acao();
		
		//JTable
		JTable tabela = new JTable(a.listarProdutos());	
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(tabela);
		barra.setBounds(74, 160, 350, 200);
		
		//Ação ao botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				//Obter os dados informados pelo usuário
				String nomeProduto = nomeProdutoResposta.getText();
				double valorProduto = Double.parseDouble(valorProdutoResposta.getText());
				
				//Criar objeto e chamar método
				a.cadastrar(nomeProduto, valorProduto);
				
				//Atualizar tabela
				tabela.setModel(a.listarProdutos());
				
				//Limpar campos
				nomeProdutoResposta.setText("");
				valorProdutoResposta.setText("");
				
				//Cursor no campo nome
				nomeProdutoResposta.requestFocus();
				
			}
		});
		
		//Add ao JFrame
		cadastrarProdutos.add(nomeProduto);
		cadastrarProdutos.add(valorProduto);
		cadastrarProdutos.add(nomeProdutoResposta);
		cadastrarProdutos.add(valorProdutoResposta);
		cadastrarProdutos.add(botao);
		cadastrarProdutos.add(barra);
		
		//Tornar visivel
		cadastrarProdutos.setVisible(true);
	
	}

}
