package exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FormularioCadastrarProduto {
	
	public FormularioCadastrarProduto() {
		
		//JFrame
		JFrame cadastrarProduto = new JFrame("Cadastrar Produtos");
		cadastrarProduto.setSize(500, 420);
		cadastrarProduto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cadastrarProduto.setLocationRelativeTo(null);
		cadastrarProduto.setLayout(null);
		
		// Componentes para realizar o cadastro
		JLabel nomeProduto = new JLabel("Nome do produto");
		nomeProduto.setBounds(80, 10, 120, 20);
		JTextField respostaNomeProduto = new JTextField();
		respostaNomeProduto.setBounds(220, 10, 150, 20);
		JLabel valorProduto = new JLabel("Valor do produto");
		valorProduto.setBounds(80, 40, 120, 20);
		JTextField respostaValorProduto = new JTextField();
		respostaValorProduto.setBounds(220, 40, 150, 20);
		JButton cadastrar = new JButton("Cadastrar");
		cadastrar.setBounds(180, 80, 150, 30);
		JButton sair = new JButton("Sair");
		sair.setBounds(180, 110, 150, 30);
		
		//Instanciar
		Acao a = new Acao();
		
		//JTable
		JTable tabela = new JTable(a.listarProdutos());
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(tabela);
		barra.setBounds(74, 160, 350, 200);
		
		//Ação cadastrar
		cadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {

				//Obter os dados informados pelo usuário
				String nomeProduto = respostaNomeProduto.getText();
				double valorProduto = Double.parseDouble(respostaValorProduto.getText());
				
				// Criar objeto e chamar o método
				a.cadastrar(nomeProduto, valorProduto);
				
				//Atualizar tabela
				tabela.setModel(a.listarProdutos());
				
				//Limpar campos
				respostaNomeProduto.setText("");
				respostaValorProduto.setText("");
				
				//Cursor no campo nome
				respostaNomeProduto.requestFocus();
				
			}
		});
		
		//Ação sair
		sair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {

				//Fechar formulario CadastrarProdutos
				cadastrarProduto.dispose();
				
				//Chamar formulario Principal
				FormularioPrincipal p = new FormularioPrincipal();
				
			}
		});
		
		//Add JFrame
		cadastrarProduto.add(nomeProduto);
		cadastrarProduto.add(respostaNomeProduto);
		cadastrarProduto.add(valorProduto);
		cadastrarProduto.add(respostaValorProduto);
		cadastrarProduto.add(cadastrar);
		cadastrarProduto.add(sair);
		cadastrarProduto.add(barra);
		
		//Tornar visível
		cadastrarProduto.setVisible(true);
		
	}

}